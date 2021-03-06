#### 责任链模式
 
#### 责任链模式的定义
    使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，
    并沿着这条链传递该请求，直到有对象处理它为止。
     
#### 责任链模式的使用场景
    * 多个对象可以处理同一请求，但具体由哪个对象处理则在运行时动态决定。
    * 在请求处理不明确的情况下向多个对象中的一个提交一个请求。
    * 需要动态指定一组对象处理请求。
     
 ![image](https://github.com/qqhahaboy/designPattern/raw/master/iterator/iteratorUML.png)    
#### 角色介绍
    Handler: 抽象处理这角色，声明一个请求处理Ac的方法，并在其中保持一个对下一个处理节点Handler对象的引用
     
    ConcreteHandler: 具体处理者角色，对请求进行处理，如果不能处理则将该请求转发给下一个节点上的处理对象。
     
#### Android中的责任链模式
    * [事件分发处理](http://www.gcssloop.com/customview/dispatch-touchevent-theory) 参考 GcsSloop 大神的文章
      
    * 有序广播
