package glm.design_patterns.head_first.ch3_decorator_coffe;
/**
 * 以咖啡为例 体现 装饰者
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}