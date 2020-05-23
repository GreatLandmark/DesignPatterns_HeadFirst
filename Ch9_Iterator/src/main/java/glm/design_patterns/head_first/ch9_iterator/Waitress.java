package glm.design_patterns.head_first.ch9_iterator;

import java.util.Iterator;

public class Waitress {
    Menu cafeMenu;

    public Waitress(Menu cafeMenu) {
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("\n cafe for dinner");
        printMenu(cafeIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", $" + menuItem.getPrice() + " ~~ " + menuItem.isVagetarian()
                    + " ~~ --" + menuItem.getDescription());
        }
    }
}