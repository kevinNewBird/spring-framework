## 1.说明
   本包主要是请求的三种基本实现方式，即：
```properties
   1.实现Controler接口；
   2.实现HttpRequestHandler接口；
   3.使用@Controller注解方式
```
   <span style="color:red">正是由于有三种请求实现方式，所以会需要HandlerAdapter适配器完成请求的准确分发。</span>