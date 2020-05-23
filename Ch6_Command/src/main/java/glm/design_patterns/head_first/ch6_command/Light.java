package glm.design_patterns.head_first.ch6_command;

public class Light {
    String name;

    public Light(String s) {
        name = s;
    }

    public void on() {
        System.out.println(name+" light ~~ON~~");
    }

    public void off() {
        System.out.println(name+" light ~~OFF~~");
    }
}