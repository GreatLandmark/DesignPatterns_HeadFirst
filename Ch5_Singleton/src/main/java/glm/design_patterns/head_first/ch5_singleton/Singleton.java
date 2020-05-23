package glm.design_patterns.head_first.ch5_singleton;
// 单件模式的例子。多线程时，可能并不能保证只有一个实例，这将在Singleton2.java改进
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {// 不可被外部 实例化。
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}