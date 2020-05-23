package glm.design_patterns.head_first.ch8_template_drinks;

public class Test {
    public static void main(String[] args) {
        // var myTea=new Tea();
        // myTea.prepareRecipe();
        // var myCoffee=new Coffee();
        // myCoffee.prepareRecipe();

        var myCoff = new CoffeeWithHook();
        myCoff.prepareRecipe();
    }
}