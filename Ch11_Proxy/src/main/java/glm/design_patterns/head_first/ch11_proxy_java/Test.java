package glm.design_patterns.head_first.ch11_proxy_java;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class Test {
    HashMap<String, PersonBean> datingDB = new HashMap<String, PersonBean>();

    public static void main(String[] args) {
        Test test = new Test();
        test.drive();
    }

    public Test() {
        initializeDatabase();
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("Joe");
        joe.info();
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("basketball");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can not set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNOtRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("boeling,go");
        } catch (Exception e) {
            System.out.println("Can not set interests from nonOwnerProxy");
        }
        nonOwnerProxy.setHotOrNotRating(2);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is "+nonOwnerProxy.getHotOrNOtRating());
    }

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }

    PersonBean getPersonFromDatabase(String name) {

        return (PersonBean) datingDB.get(name);

    }

    void initializeDatabase() {

        PersonBean joe = new PersonBeanImpl();

        joe.setName("Joe");

        joe.setInterests("cars, computers, music");

        joe.setHotOrNotRating(7);

        datingDB.put(joe.getName(), joe);

        PersonBean kelly = new PersonBeanImpl();

        kelly.setName("Kelly Klosure");

        kelly.setInterests("ebay, movies, music");

        kelly.setHotOrNotRating(6);

        datingDB.put(kelly.getName(), kelly);

    }
}