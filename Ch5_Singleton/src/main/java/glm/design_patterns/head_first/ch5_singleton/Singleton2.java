package glm.design_patterns.head_first.ch5_singleton;
// 单件模式的例子。多线程时，改进.
public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2() {// 不可被外部 实例化。
    }
//synchronized 关键词，同步。会降低性能。
    public static synchronized Singleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();//“延迟”创建实例，使用时创建。
        }
        return uniqueInstance;
    }
}