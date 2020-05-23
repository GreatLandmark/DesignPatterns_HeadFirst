package glm.design_patterns.head_first.ch8_template_drinks;

//这相当于一个模板，用于coffee 和 tea 的准备过程。
public abstract class CoffeineBeverageWithHook {
    final void prepareRecipe() {// 模板方法
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 提取 coffee和tea的通用制作过程。
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pour into cup");
    }

    boolean customerWantsCondiments() {//这是一个钩子（hook）
        return true;
    }
}