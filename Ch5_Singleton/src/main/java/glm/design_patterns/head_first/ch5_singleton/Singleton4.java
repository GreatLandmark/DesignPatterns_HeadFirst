package glm.design_patterns.head_first.ch5_singleton;

// 单件模式的例子。多线程时，改进。“双重检查加锁”。
public class Singleton4 {
    private volatile static Singleton4 uniqueInstance;// volatile关键词

    private Singleton4() {// 不可被外部 实例化。
    }

    // synchronized 关键词，同步。会降低性能。
    public static Singleton4 getInstance() {
        if (uniqueInstance == null) { // 检查实例，如果不存在，就进入同步区块。
            synchronized (Singleton4.class) {
                if (uniqueInstance == null) { // 进入同步区块后再检查，如果仍为null，才创建实例化。
                    uniqueInstance = new Singleton4();// “延迟”创建实例，使用时创建。
                }
            }
        }
        return uniqueInstance;
    }
}