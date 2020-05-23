package glm.design_patterns.head_first.ch5_singleton;
// 单件模式的例子。多线程时，改进. “急切”创建，加载类时创建实例。
public class Singleton3 {
    private static Singleton3 uniqueInstance=new Singleton3();//“急切”创建，加载类时创建实例

    private Singleton3() {// 不可被外部 实例化。
    }

    public static Singleton3 getInstance() {
        return uniqueInstance;
    }
}