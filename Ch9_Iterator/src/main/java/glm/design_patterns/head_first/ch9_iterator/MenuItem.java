package glm.design_patterns.head_first.ch9_iterator;

public class MenuItem {
    String name;
    String description;
    boolean vagetarian;
    double price;

    public MenuItem(String name, String description, boolean vagetarian, double price) {
        this.name = name;
        this.description = description;
        this.vagetarian = vagetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVagetarian() {
        return vagetarian;
    }

    public void setVagetarian(boolean vagetarian) {
        this.vagetarian = vagetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}