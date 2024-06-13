### 面向对象编程day05最后留下的提示技巧

##### 1、访问控制修饰符的使用规则

> 1. 类的访问控制
>    - 顶级类(即非内部类)只能使用public或默认(package-private)访问级别
>    - 内部类可以使用所有四种访问修饰符
> 2. 成员变量和方法的访问控制
>    - 可以使用所有四种访问修饰符
>    - 接口中的成员变量默认是public static final的
>    - 接口中的方法默认是public abstract的
> 3. 构造方法
>    - 可以使用所有四种访问修饰符
>    - 如果类没有显式定义构造方法,编译器会自动生成一个默认的无参构造方法,其访问级别与类相同
> 4. 局部变量
>    - 不能使用访问修饰符
>    - 它们的作用域仅限于声明它们的代码块内
> 5. 继承与访问控制
>    - 子类不能降低从父类继承的方法的访问级别,但可以提高
>    - 例如,如果父类方法是protected,子类可以将其重写为public,但不能重写为private
> 6. final关键字
>    - 可以与访问修饰符一起使用
>    - final类不能被继承
>    - final方法不能被重写
>    - final变量(常量)只能被赋值一次
> 7. static关键字
>    - 可以与访问修饰符一起使用
>    - static成员属于类,而不是类的实例
>    - static方法不能直接访问非static成员
> 8. 包的访问控制
>    - 包没有访问修饰符
>    - 要使一个包中的类对其他包可见,需要将类声明为public
>
> 正确使用访问控制修饰符可以帮助我们实现更好的封装,提高代码的安全性和可维护性。在设计类和接口时,应该仔细考虑每个成员的可见性,遵循最小权限原则。

##### 2、何时设计静态方法

> 1. 类的访问控制
>    - 顶级类(即非内部类)只能使用public或默认(package-private)访问级别
>    - 内部类可以使用所有四种访问修饰符
> 2. 成员变量和方法的访问控制
>    - 可以使用所有四种访问修饰符
>    - 接口中的成员变量默认是public static final的
>    - 接口中的方法默认是public abstract的
> 3. 构造方法
>    - 可以使用所有四种访问修饰符
>    - 如果类没有显式定义构造方法,编译器会自动生成一个默认的无参构造方法,其访问级别与类相同
> 4. 局部变量
>    - 不能使用访问修饰符
>    - 它们的作用域仅限于声明它们的代码块内
> 5. 继承与访问控制
>    - 子类不能降低从父类继承的方法的访问级别,但可以提高
>    - 例如,如果父类方法是protected,子类可以将其重写为public,但不能重写为private
> 6. final关键字
>    - 可以与访问修饰符一起使用
>    - final类不能被继承
>    - final方法不能被重写
>    - final变量(常量)只能被赋值一次
> 7. static关键字
>    - 可以与访问修饰符一起使用
>    - static成员属于类,而不是类的实例
>    - static方法不能直接访问非static成员
> 8. 包的访问控制
>    - 包没有访问修饰符
>    - 要使一个包中的类对其他包可见,需要将类声明为public
>
> 正确使用访问控制修饰符可以帮助我们实现更好的封装,提高代码的安全性和可维护性。在设计类和接口时,应该仔细考虑每个成员的可见性,遵循最小权限原则。

##### 2、何时设计静态方法

> 设计静态(static)方法是Java编程中的一个重要决策。以下是一些适合使用静态方法的场景：
>
> 1. 工具类方法
>    - 当方法不需要访问对象的状态，只依赖于传入的参数时
>    - 例如：java.lang.Math类中的数学运算方法
> 2. 工厂方法
>    - 用于创建和返回类的实例
>    - 例如：java.util.Calendar.getInstance()
> 3. 单例模式
>    - 获取单例对象的方法通常是静态的
>    - 例如：getInstance()方法
> 4. 常量定义
>    - 结合final关键字定义类常量
>    - 例如：public static final int MAX_VALUE = 100;
> 5. 辅助方法
>    - 封装一些通用的、与特定对象无关的功能
>    - 例如：字符串处理、日期转换等
> 6. 主方法
>    - Java程序的入口点main方法必须是静态的
>    - public static void main(String[] args)
> 7. 静态初始化块
>    - 用于初始化静态变量
>    - 在类加载时执行
> 8. 缓存或共享数据
>    - 当需要在多个对象之间共享数据时
>    - 例如：保存应用程序的配置信息
> 9. 性能考虑
>    - 静态方法相比实例方法有轻微的性能优势，因为不需要创建对象
> 10. 无状态的操作
>     - 当方法的行为不依赖于对象的状态时
>     - 可以提高代码的可测试性
> 11. 扩展方法（类似C#）
>     - 虽然Java不直接支持扩展方法，但可以通过静态方法模拟
>     - 例如：Apache Commons库中的工具类
> 12. 枚举类中的通用方法
>     - 在枚举类中定义适用于所有枚举常量的方法
>
> 使用静态方法时需要注意：
>
> - 静态方法不能直接访问非静态成员
> - 过度使用静态方法可能导致代码难以测试和维护
> - 静态方法不能被重写，可能影响多态性
>
> 在设计API时，应仔细考虑是否真的需要静态方法。有时，使用依赖注入或工厂模式可能是更好的选择

##### 3、Java中有哪些方法是静态的

> Java标准库中有许多静态方法。以下是一些常见的例子，按类别分组：
>
> 1. 数学运算
>    - java.lang.Math 类中的大多数方法，例如：
>      - Math.abs(), Math.max(), Math.min()
>      - Math.sin(), Math.cos(), Math.tan()
>      - Math.sqrt(), Math.pow(), Math.log()
> 2. 工具类
>    - java.util.Arrays
>      - Arrays.sort(), Arrays.binarySearch()
>      - Arrays.asList(), Arrays.copyOf()
>    - java.util.Collections
>      - Collections.sort(), Collections.reverse()
>      - Collections.shuffle(), Collections.binarySearch()
> 3. 字符串操作
>    - String.valueOf() - 将其他类型转换为字符串
>    - String.format() - 格式化字符串
> 4. 包装类型转换
>    - Integer.parseInt(), Long.parseLong()
>    - Double.parseDouble(), Boolean.parseBoolean()
>    - Character.isDigit(), Character.isLetter()
> 5. 系统相关
>    - System.currentTimeMillis()
>    - System.nanoTime()
>    - System.gc() - 建议进行垃圾回收
> 6. 文件操作
>    - java.nio.file.Files 类中的许多方法，例如：
>      - Files.exists(), Files.delete()
>      - Files.copy(), Files.move()
> 7. 日期和时间
>    - java.time.LocalDate.now()
>    - java.time.LocalTime.now()
>    - java.time.LocalDateTime.now()
> 8. 并发编程
>    - java.util.concurrent.Executors
>      - Executors.newFixedThreadPool()
>      - Executors.newCachedThreadPool()
> 9. 流操作
>    - java.util.stream.Stream.of()
>    - java.util.Arrays.stream()
> 10. Optional 类
>     - Optional.of(), Optional.ofNullable()
>     - Optional.empty()
> 11. 随机数生成
>     - java.util.Random.current()
> 12. URL 编码/解码
>     - java.net.URLEncoder.encode()
>     - java.net.URLDecoder.decode()
> 13. Base64 编码/解码
>     - java.util.Base64.getEncoder().encodeToString()
>     - java.util.Base64.getDecoder().decode()
> 14. 日志
>     - java.util.logging.Logger.getLogger()
> 15. 反射
>     - java.lang.Class.forName()
> 16. UUID 生成
>     - java.util.UUID.randomUUID()

##### 4、Java中常量的应用场景是什么

> 在Java中，常量通常使用 `public static final` 修饰符声明。以下是常量的一些常见应用场景：
>
> 1. 配置值
>    - 数据库连接URL、用户名
>    - 应用程序的版本号
>    - 文件路径、日志文件名
> 2. 数学常数
>    - Math.PI, Math.E
>    - 自定义的数学常数，如重力加速度
> 3. 状态和错误码
>    - HTTP状态码
>    - 自定义错误码
>    - 枚举类型（实际上每个枚举值都是一个常量）
> 4. 限制值
>    - 数组或集合的最大容量
>    - 密码最小长度
>    - 线程池大小
> 5. 时间相关常量
>    - 毫秒/秒/分钟/小时/天的换算
>    - 日期格式字符串
> 6. 正则表达式模式
>    - 邮箱、电话号码等常用正则表达式
> 7. 文件扩展名
>    - .jpg, .png, .pdf 等
> 8. 字符集和编码
>    - UTF-8, ISO-8859-1 等
> 9. 默认值
>    - 默认端口号
>    - 默认超时时间
> 10. UI相关
>     - 颜色值（RGB）
>     - 字体大小
>     - 窗口尺寸
> 11. 权限和角色
>     - 用户角色（如 ADMIN, USER, GUEST）
>     - 访问权限级别
> 12. 单位转换
>     - 英制to公制
>     - 货币汇率（虽然实际应用中汇率可能是变动的）
> 13. 加密算法
>     - 加密方法名称（如 "AES", "RSA"）
>     - 密钥长度
> 14. 协议版本
>     - HTTP/1.1, HTTP/2
>     - 自定义协议版本
> 15. 系统路径分隔符
>     - File.separator
> 16. 特殊字符
>     - 换行符 (\n)
>     - 制表符 (\t)
> 17. 标志位
>     - 布尔常量，如 true, false
> 18. 国际化
>     - 语言代码（如 "en", "zh"）
>     - 国家/地区代码
> 19. 业务规则
>     - 最大折扣率
>     - 最小订单金额
> 20. 测试相关
>     - 测试数据
>     - 测试超时时间
>
> 使用常量的好处包括：
>
> - 提高代码可读性
> - 便于维护（只需在一处修改）
> - 防止魔法数字（Magic Numbers）
> - 在编译时进行类型检查
> - 可能带来轻微的性能提升

##### 5、Jva中枚举的应用场景是什么

> Java中的枚举（Enum）是一种特殊的类，用于表示一组固定的常量。以下是枚举的一些常见应用场景：
>
> 1. 状态表示
>    - 订单状态（新建、处理中、已发货、已完成、已取消）
>    - 任务状态（待处理、进行中、已完成、失败）
> 2. 类型分类
>    - 支付方式（现金、信用卡、PayPal、微信支付）
>    - 用户角色（管理员、普通用户、访客）
> 3. 错误码和消息
>    - HTTP状态码
>    - 自定义API响应码
> 4. 配置选项
>    - 日志级别（DEBUG, INFO, WARN, ERROR）
>    - 数据库类型（MySQL, PostgreSQL, Oracle）
> 5. 时间单位
>    - java.util.concurrent.TimeUnit（秒、分、时、天）
> 6. 方向和坐标
>    - 方向（北、南、东、西）
>    - 棋盘位置
> 7. 颜色
>    - 基本颜色（红、绿、蓝、黄）
>    - 交通信号灯颜色
> 8. 星期和月份
>    - DayOfWeek, Month（Java 8 中的 java.time 包）
> 9. 策略模式
>    - 排序算法（冒泡排序、快速排序、归并排序）
>    - 折扣策略（无折扣、固定折扣、百分比折扣）
> 10. 单例模式
>     - 使用枚举实现线程安全的单例
> 11. 权限控制
>     - 文件权限（读、写、执行）
>     - 功能权限
> 12. UI元素
>     - 按钮类型
>     - 对话框类型
> 13. 数据库操作类型
>     - CRUD操作（创建、读取、更新、删除）
> 14. 计量单位
>     - 长度单位（米、厘米、英寸）
>     - 重量单位（千克、磅）
> 15. 音乐和声音
>     - 音符（DO, RE, MI, FA, SOL, LA, SI）
>     - 音量级别
> 16. 游戏编程
>     - 难度级别（简单、中等、困难）
>     - 角色类型
> 17. 网络协议
>     - IP协议版本（IPv4, IPv6）
>     - TCP/UDP
> 18. 编程语言
>     - 在编译器或IDE中表示支持的语言
> 19. 季节
>     - 春、夏、秋、冬
> 20. 行为控制
>     - 开关状态（ON, OFF）
>     - 设备模式（正常模式、省电模式、高性能模式）
>
> 枚举的优点：
>
> - 类型安全，编译时检查
> - 可以包含方法和字段，使其比简单的常量更强大
> - 可以实现接口，允许在不同的枚举常量上有不同的行为
> - 自带序列化机制
> - 可以使用在switch语句中
> - 提供了values()和valueOf()等有用的方法
>
> 使用枚举可以使代码更加清晰、类型安全，并且易于维护。在设计API时，合理使用枚举可以显著提高代码的可读性和健壮性。