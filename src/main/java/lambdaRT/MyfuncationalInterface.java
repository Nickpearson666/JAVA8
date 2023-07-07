package lambdaRT;

//使用此注解，标记这个接口是函数式接口 仅仅可以支持一个抽象方法
//支持default 实现默认方法
//可以定义obj中的方法
@FunctionalInterface
public interface MyfuncationalInterface {

    void getString();

    //可以定义obj中的方法
    String toString();

    default void getHello(){
        System.out.println("Hello");
    }
}
