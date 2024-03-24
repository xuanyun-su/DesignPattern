package EmptyObject;

public class NullObjectDemo {
    public static void main(String[] args) {
        Logger logger = getLogger(true);  // 获取日志对象
        logger.log("Hello, world!");  // 调用日志方法

        // 当 logger 为空时，不会发生空引用异常
        Logger logger1 = getLogger(false);  // 获取日志对象
        logger1.log("hi");
    }

    // 模拟获取日志对象的方法
    private static Logger getLogger(boolean logger) {
        // 根据条件判断返回真实对象或空对象
        boolean useConsoleLogger = logger;
        if (useConsoleLogger) {
            return new ConsoleLogger();
        } else {
            return new NullLogger();
        }
    }
}
