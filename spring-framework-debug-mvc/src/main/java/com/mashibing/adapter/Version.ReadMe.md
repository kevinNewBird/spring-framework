##1.说明
   对于三种请求方式，handlerAdapter的匹配说明：
````properties
1.实现Controller接口，SimpleControllerHandlerAdapter；
2.实现HttpRequestHandler接口，HttpRequestHandlerAdapter
3.实现@Controller注解，RequestMappingHandlerAdapter
````
   对于实现了@controller注解的请求方式,其解析适配过程将是非常麻烦的。换句话讲，存在大量的注解需要逐次解析。
   ```properties
1.@RequestBody
2.@ResponseBody
3.@RequestMapping
4.@RequestParam
5.@PathVariables
6.@Validated
7.@Valid
8.@CookieValue
9.@SessionAttributae
10.@ModelAttribute
11.@RequestHeader
```
##2.参数处理调试 (HandlerMethodArgumentResolver)
### 2.1.@InitBinder（局部范围，对当前Controller有效）
 <span style="color:red">测试类：com.mashibing.adapter.initbinder.controller.LocalScopeController</span>
 InitBinder注解作用于Controller中的方法，表示为当前控制器注册一个属性编辑器,对webDataBinder进行
初始化且只对当前的Controller有效,对应getDataBinderFactory方法.
```properties
插入一个小知识点：
在反射中，Method存在isBridge(是否为桥接方法)和isSynthetic(是否为合成)。
1.所谓合成，是指在不同的jdk版本中，编译阶段会往你写的某些代码中添加一些代码片段（类似语法糖）；
2.所谓桥接，所有用户自定义的方法都不桥接方法，见测试类 com.mashibing.adapter.initbinder.bridge.SubClass
```
### 2.2.@ModelAttribute(局部范围)
  model数据初始化设置，即在controller的参数Model数据模型塞入初始值。
### 2.3.@ControllerAdvice(全局范围)
  <span style="color:red">测试类：com.mashibing.adapter.controllerAdvice.ControllerAdviceController</span>
  <span style="color:red">测试类：com.mashibing.adapter.initbinder.controller.GlobalScopeController</span>
  如果在该类中定义了@InitBinder,@ModelAttribute，@ExceptionHandler。那么这几个注解对应的数据共享就将是全局范围。
@ControllerAdvice注解，不仅仅是理解的用于全局异常的捕获。
### 2.4.@SessionAttributes (类上) + @ModelAttribute
  <span style="color:red">测试类：com.mashibing.adapter.initbinder.controller.GlobalScopeController</span>
  使用HttpSession对象可以在别的controller中被获取到（注意：HttpSession第一次访问时，未被创建是不能实现@ModelAttribute注解
 的数据共享的）；但是如果是通过@ModelAttribute，则只会在本类生效

### 2.5.@SessionAttribute (方法参数上)
   值设置到request域的同时，往session里也存一份。
##3.返回值处理调试
   重要类：ViewNameMethodReturnValueHandler