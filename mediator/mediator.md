#### 中介者模式
 
 #### 中介者模式的定义
    中介者模式包装了一系列对象相互作用的方式，使得这些对象不必相互明显作用。从而使它们可以松散耦合。
    当某些对象之间的作用发生改变时，不会立即影响其他的一些对象之间的作用。保证这些作用可以彼此独立的变化。
    中介者模式将多对多的相互作用转化为一对多的相互作用。中介者模式将对象的行为和协作抽象化，
    把对象在小尺度的行为上与其他对象的相互作用分开处理。
     
#### 中介者模式的使用场景
    当对象之间的交互操作很多且每个对象的行为操作都依赖彼此时，为防止在修改一个对象的行为时，同时涉及修改很多其他对象的行为，
    可采用 中介者模式，来解决紧耦合问题。该模式将对象之间的多对多关系变成一对多关系，中介者对象将系统从网络结构变成以调停者
    为中心的星形结构，达到降低系统的复杂性，提交可拓展性的作用。
  ![image](https://github.com/qqhahaboy/designPattern/raw/master/mediator/MediatorUML.png)
#### 角色介绍
    Mediator:抽象中介者角色，定义了同时对象到中介对象的接口，一般以抽象类的方式实现。
     
    ConcreteMediator:具体的中介者，继承于抽象中介者，实现了父类定义的方法，它从具体的同事对象接受消息，
                     向具体同事对象发出命令。
     
    Colleague:抽象同事类角色，定义了中介者对象的接口，它只知道中介者而不知道其他的同事对象。
     
    ConcreteColleagueA/B: 具体同事类角色，继承于抽象同事类，每个具体同事类都知道本身在小范围内的行为，
                          而不知道它的大范围内的目的。
    
#### 总结
    在面向对象的编程语言里，一个类必然会与其他类产生依赖关系，如果这种依赖关系如网状般错综复杂，那么必然会影响我们的代码逻辑以及
    执行效率，适当地使用中介者模式可以对这种依赖关系进行解耦使逻辑结构清晰，但是，如果几个类间的依赖关系并不复杂，使用中介者模式
    反而会使得原本不复杂的逻辑结构变得复杂，所以，我们在决定使用中介者模式之前要多方考虑、权衡利弊。