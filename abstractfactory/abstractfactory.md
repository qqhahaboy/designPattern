#### 抽象工厂模式

#### 抽象工厂模式的定义
    为创建一组相关或者是相互依赖的对象提交一个接口，而不需要指定它们的具体类。

#### 抽象工厂模式的使用场景
    一个对象族有相同的约束时可以使用抽象工厂模式。
    
![image](https://github.com/qqhahaboy/designPattern/raw/master/abstractfactory/abstractFactoryUML.png)
#### 角色介绍
    AbstractFactory:抽象工厂角色
        声明了一组用于创建一种产品的方法，每一个方法对应一种产品，入上述类图中的AbstractFactory中的就定义了两个方法，
        分别创建产品A 和 产品B。
     
    ConcreteFoctory:具体产品角色
        它实现了在抽象工厂中定义的创建产品的方法，生成一组具体产品，这些产品构成了一个产品种类，这些产品构成了一个产品
        种类，每一个产品都位于某个产品等级结构中，如上述类图中的ConcreteFactory1 和 ConcreteFactory2。
        
    AbstractProduct:抽象产品角色
        它为每种产品声明接口，比如上述类图中的AbstractProductA 和 AbstractProductB
        
    ConcreteProduct：具体产品角色
        它定义具体工厂的具体产品对象，实现抽象产品接口中声明的业务方法，如上述类图中的ConcreteProductA1、ConcreteProductA2、
        ConcreteProductA2、ConcreteProductB2。
   
#### 总结
    抽象工厂方法模式的优点:
        一个显著的优点是分离接口与实现，客户端使用抽象工厂来创建需要的对象，而客户端根本不知道具体的实现是谁，客户端只是面向产品
        的接口编程而已，使其从具体的产品实现中解耦，同时基于接口与实现的分离，使抽象该工厂模式在切换产品类时更加灵活、容易。
     
    抽象工厂方法模式的缺点:
        一是类文件的爆炸性增加。
        二是不太容易扩展新的产品类，因为每当我们增加一个产品类就需要修改抽象工厂，那么所有的具体工厂类均会被修改。
