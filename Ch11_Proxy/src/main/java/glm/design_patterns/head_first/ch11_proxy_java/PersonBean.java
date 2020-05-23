package glm.design_patterns.head_first.ch11_proxy_java;

public interface PersonBean {
    String getName();

    String getGender();

    String getInterests();

    int getHotOrNOtRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);

    void info();
}