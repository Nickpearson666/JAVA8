package referenceRT;

public class Test01 {
    public static void main(String[] args) {
        //方法引入结合lambda使用，需要对应的函数方法签名和对应的函数式接口一致
        //lambda 主要解决匿名内部类的问题
        //1.静态方法引入： 类名:: 静态方法名称
        //2.对象方法引入： 类名:: 对象方法名称
        //3.实例方法引入： new 对象:: 方法名称
        //4.构造函数方法引入： 类名:: new

        //最原生的匿名内部类
//        new MessInterface() {
//            @Override
//            public void get(Integer num) {
//                System.out.println("curr number is "+ num);
//            }
//        }.get(78);

        //lambda表达式 写法
        ((MessInterface)(a)-> System.out.println("curr number is "+ a)).get(198);

        //方法引入的写法， 在lambda表达式中方法体直接写方法
        //原接口是void getNum 是 Integer 可以不报错
        ((MessInterface)Test01::getNum).get(234);
    }

    public static Integer getNum(Integer num){
        System.out.println("curr number is "+ num);
        return num;
    }
}
