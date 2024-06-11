### 异常概述

异常（Exception）是程序运行过程中出现的非正常状态，会导致程序执行流程中断。Java提供了异常处理机制，用于捕获和处理异常，使程序能够在发生异常时做出正确的响应，避免程序崩溃。

### 常见异常类型

Java中常见的异常类型包括：

- **下标越界异常（`ArrayIndexOutOfBoundsException`）**：访问数组元素时，使用的下标超出数组有效范围。
- **空指针异常（`NullPointerException`）**：试图访问或操作一个空指针（指向空对象的引用）。
- **文件异常（`IOException`）**：操作文件或网络资源时发生的异常，例如文件未找到、文件读写失败、网络连接中断等。
- **输入输出异常（`InputOutputException`）**：操作输入输出流时发生的异常，例如流已关闭、流操作不合法等。
- **算术异常（`ArithmeticException`）**：进行算术运算时发生的异常，例如除法运算时除数为零。
- **类型转换异常（`ClassCastException`）**：将一个对象转换为另一个类型时失败的异常。

### 异常处理机制

Java的异常处理机制主要包括以下关键字和代码块：

- `try`：用于包裹可能抛出异常的代码块。
- `catch`：用于捕获异常并处理异常的代码块。
- `finally`：用于包含无论是否发生异常都需要执行的代码块。
- `throw`：用于手动抛出异常。
- `throws`：用于在方法声明中指定方法可能抛出的异常。

### 异常处理示例

以下是一个捕获下标越界异常的示例代码：

Java

```java
int[] arr = new int[10];

try {
  System.out.println(arr[11]); // 可能抛出下标越界异常
} catch (ArrayIndexOutOfBoundsException e) {
  System.out.println("下标越界：" + e.getMessage());
}
```



### 其他常见异常

除了上述常见的异常类型之外，Java中还有一些其他常见的异常，例如：

- **安全异常（`SecurityException`）**：违反安全策略时发生的异常。
- **非法参数异常（`IllegalArgumentException`）**：方法参数不合法时发生的异常。
- **状态异常（`IllegalStateException`）**：对象处于非法状态时发生的异常。
- **不支持的操作异常（`UnsupportedOperationException`）**：试图执行不支持的操作时发生的异常。