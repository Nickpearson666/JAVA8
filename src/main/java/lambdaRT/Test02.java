package lambdaRT;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        //without lambda
//        OldService oldService = new OldService() {
//            @Override
//            public void get() {
//                System.out.println("get");
//            }
//        };
//        oldService.get();

//        new OldService() {
//            @Override
//            public void get() {
//                System.out.println("get2");
//            }
//        }.get();

        //lambda + 方法引入
//        ((OldService)()-> System.out.println("get3")).get();
//
//        new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+" running");
//        }).start();

        ((MyfuncationalInterface)()->{
            System.out.println("My name is my functional");
        }).getString();

        ((MyfuncationalInterface)()->{
            System.out.println("functional testing 2");
        }).getString();

        //lambda 方法体只有一句语句的时候，不需要使用大括号
        System.out.println(((MyFunInterface2) (a, b) -> (a + b)).getSum(7, 109));

        //lambda表达式实现集合递归
        List<String> list = new ArrayList<>();
        list.add("Kevin");
        list.add("Randell");
        list.add("Kate");
        list.forEach(s-> System.out.println(s));

        //lambda 同时实现自定义对象的排序
        //Tread 构造参数里接收runnable接口的参数, 此接口是函数式接口， 可以使用lambda表达式

        new Thread(()->System.out.println("x")).start();
    }
}
