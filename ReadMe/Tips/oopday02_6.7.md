### 面向对象编程day02最后留下的提示技巧

##### 1、继承的作用是什么？继承的应用场景有哪些

> 继承的作用:
>
> 1. **代码重用** 子类可以直接继承父类的属性和方法,避免重复编码,提高代码复用性。
> 2. **扩展已有类** 在已有类的基础上,通过继承可以**扩展新的功能,实现代码的扩展和增量。**
> 3. **类的抽象和概念层次** 通过继承,可以构建类的继承关系,更好地体现事物的抽象层次和概念架构。
> 4. **提高代码的可维护性** 良好的继承机制有利于代码的扩展和修改,提高代码的可维护性。
>
> 继承的应用场景:
>
> 1. **实现代码复用** 许多通用的基础类可以被继承以复用其核心功能,如String、ArrayList等。
> 2. 对现实世界的建模 现实世界存在着"是一种"的概念层次关系,可以通过继承来对其建模,如动物-狗等。
> 3. **定义抽象类和接口 通过抽象类和接口,可以定义行为和属性的抽象框架,由子类去具体实现。**
> 4. 框架和UI编程
>     GUI编程中大量使用继承扩展组件库提供的基类,实现定制化界面。
> 5. 设计模式的实现 很多设计模式的实现依赖继承,比如模板方法模式、装饰者模式等。
> 6. **实现多态 继承是实现多态的手段之一,子类可以重写父类的方法以实现不同行为。**

##### 2、继承的特点

> 1. **单继承** Java只支持单继承,一个类只能继承一个父类。但通过接口可以实现多继承。
> 2. **子类拥有父类的非私有成员** 子类可以直接访问和调用父类的非私有属性和方法。
> 3. 不继承构造器 子类不会继承父类的构造器,必须显式调用父类的构造器或自动调用父类默认构造器。
> 4. **支持方法重写(override) 子类可以重写父类的非私有、非final、非static方法,实现行为的扩展或覆盖。**
> 5. **不支持重写属性 子类不能重写父类属性,只能隐藏父类属性。隐藏使用super关键字访问父类被隐藏的属性。**
> 6. **支持多层继承** Java继承是多级的,子类可以继承父类,孙类可以继承子类,依此类推。
> 7. 子类是父类的一种 基于`"是一种"`的原则,子类对象可以视为父类对象的一种,称为`"is-a"`关系。
> 8. **静态绑定和动态绑定** 非覆盖方法使用静态绑定,覆盖方法使用动态绑定确定调用哪个方法。

##### 3、super与继承的关系

> **super关键字主要用于访问父类的属性和方法,体现了继承中子父类的关联关系**。它在继承中扮演着以下重要角色:
>
> 1. **调用父类构造器(构造函数) super(...)可以在子类构造器中调用父类的构造器,确保父类状态正确初始化。**
> 2. 访问父类属性 super.属性名可以让子类显式访问父类中被隐藏的数据属性。
> 3. **调用父类方法 super.方法名可以让子类调用父类中被重写的方法,在扩展时仍能复用父类的功能逻辑。**
> 4. 区分重名变量
>     在父子类有同名变量时,super.变量名可以有效区分该变量是从当前类还是父类继承而来。
> 5. 在构造器内部多态的绑定 super()用于构造器内部的多态绑定,确保基类构造完成时对绑定的方法进行动态绑定。
>
> 通过super,子类对象可以方便地访问到从父类那里继承下来的属性和方法,在覆盖或扩展父类功能时可以有效复用原有代码。正是由于super,才实现了子父类对象状态和行为的有序集成和传承。

##### 4、方法重写的应用场景

> 1. **实现子类特有的行为** 子类可以重写从父类继承来的方法,使其具有自己特殊的行为逻辑,从而满足子类个性化的需求。
> 2. **扩展父类方法的功能** 基于父类已有方法的实现,子类可以在重写方法时添加额外的功能代码,实现方法的增强和扩展。
> 3. **提供方法实现的默认行为** 在抽象类中定义抽象方法,强制要求子类重写该方法,从而提供该方法的默认实现。
> 4. **实现多态特性** 方法重写是实现多态的一种方式。父类引用指向子类对象时,调用的是子类重写后的方法,展现了多态行为。
> 5. 回调控制语义改变 在基于回调的框架设计中,通过重写回调方法,可以改变控制语义,是实现框架中的钩子的常见方式。
> 6. 设计模式的实现 很多设计模式如模板方法模式、策略模式等,都是基于继承多态,通过重写方法实现的。
> 7. 框架扩展与定制 许多框架都给予了扩展的接口,我们可以通过继承并重写相关方法,对框架进行定制和扩展。

##### 5、java中哪些类是final的

> 1. `java.lang.String` **String类代表不可变的字符串对象,**设计为final可以让编译器为其提供一些优化措施。
> 2. `java.lang.Math` Math类提供基本的数学运算静态方法,没有公共构造器,设计为final确保其不能被继承。
> 3. `java.lang.ClassLoader` ClassLoader是加载类的核心类,设计为final是出于安全考虑,防止其被继承以改变加载行为。
> 4. `java.util.regex.Pattern` 正则表达式Pattern对象是不可变的,设计为final可以提高性能和安全性。
> 5. `java.lang.Integer/Long/Byte`等装箱类 Java的基本类型包装器类都是final,这样可以避免操作不当导致安全漏洞。
> 6. 一些核心类库的内部私有类 如`HashMap.Node`、`ArrayList.Itr`等类也被声明为final,防止外部继承造成潜在风险。
> 7. 一些匿名内部类 匿名内部类默认就是final的,因为对于一次性使用的内部类没有继承的必要。
>
> 通常,类被声明为final主要出于以下几个考虑:安全性、性能、防止改变语义、简化设计等。final类不能被继承,这是java提高安全性、性能的重要手段,也使得API设计更加简单。理解类被声明为final的原因,能够加深对面向对象语言特性的理解。