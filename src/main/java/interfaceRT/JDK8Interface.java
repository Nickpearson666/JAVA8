package interfaceRT;

public interface JDK8Interface {
    String name = "Nick";

    default void getName(){
        System.out.println(this.name);
    }

    static void getAge(){
        System.out.println("this.age");
    }
}
