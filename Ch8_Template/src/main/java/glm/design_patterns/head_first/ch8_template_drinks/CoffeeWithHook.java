package glm.design_patterns.head_first.ch8_template_drinks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CoffeineBeverageWithHook {

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("dripping coffee through filter");
    }

    // 覆盖父类的 钩子（hook）
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like mile and sugar with your coffee (y/n) ?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (Exception e) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}