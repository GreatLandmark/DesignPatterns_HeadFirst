package glm.design_patterns.head_first.ch8_template_duck;

import java.util.Arrays;

public class DuckSortTest {
    public static void main(String[] args) {
        Duck[] ducks = { new Duck("Ha", 20), new Duck("Da", 11), new Duck("Ca", 10), new Duck("Ba", 9),
                new Duck("Ea", 12), new Duck("Aa", 8), new Duck("Ga", 15), new Duck("Fa", 13) };
        System.out.println("before sorting:");
        display(ducks);

        Arrays.sort(ducks);// 因为Duck类实现了compareTo()方法

        System.out.println("\nafter sorting :");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}