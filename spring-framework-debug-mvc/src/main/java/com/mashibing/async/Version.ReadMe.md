##1.说明
  springmvc的异步处理是对servlet异步处理的支撑（servlet3.0之后）。
##2.servlet3.0 异步处理实现
  工程：myskywalking-boot, 涉及类AsyncServlet，并需要在web.xml开启<async-supported>为true。
   <span style="color:red">AsyncContext</span>保存异步请求的相关信息。

```java
public class AsyncServlet extends HttpServlet {
    /**
     * servlet3.0提供的异步请求实现
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 完成具体的核心逻辑
        resp.setContentType("text/plain;charset=utf-8");
        resp.setHeader("Cache-Control", "private");

        PrintWriter writer = resp.getWriter();
        writer.println("检查工作");
        writer.flush();

        // 假设有一堆的job需要完成，每一个job代表具体的业务处理逻辑
        List<String> jobList = new ArrayList<>();
        IntStream.range(0, 10).forEach(index -> jobList.add("job" + index));
        // 可以使用request中的startAsync来进行启动
        // AsyncContext等同于Servlet中的ServletContext, 保存异步请求执行过程中的相关信息
        AsyncContext asyncContext = req.startAsync();
        // （***）核心业务逻辑
        work(asyncContext, jobList);
        writer.println("任务布置完成");
        writer.flush();
    }

    public void work(AsyncContext context, List<String> taskList) {
        //核心业务逻辑处理
        // 1.设置超时时间
        context.setTimeout(60 * 60_000);
        // 2.开启新线程，执行具体的处理逻辑
        context.start(()->{
            try {
                PrintWriter writer = context.getResponse().getWriter();
                for (String task : taskList) {
                    writer.println(task+"正在执行中...");
                    writer.flush();
                    TimeUnit.SECONDS.sleep(1);
                }

                // 当请求执行完毕之后，需要给定完成通知
                context.complete();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}
```
##3.springmvc 异步处理实现
   与servlet相呼应的接口<span style="color:red">AsyncWebRequest</span>。在springmvc中，异步处理的管理WebAsyncManager和工具WebAsyncUtils。