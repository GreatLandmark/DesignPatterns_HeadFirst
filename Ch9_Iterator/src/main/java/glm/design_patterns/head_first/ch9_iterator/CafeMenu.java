package glm.design_patterns.head_first.ch9_iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

    public CafeMenu() {
        addItem("Veggie Burger", "description Veggie Burger", true, 2.999);
        addItem("Soup of the day", "description Soup of the day", false, 2.229);
        addItem("Air Burger", "description Air Burgerr", false, 4.999);
        addItem("Burrito", "description Burrito", true, 1.999);
    }

    public void addItem(String name,String description,boolean vagetarian,double price) {
            MenuItem menuItem=new MenuItem(name, description, vagetarian, price);
            menuItems.put(menuItem.getName(), menuItem);
        }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }

}