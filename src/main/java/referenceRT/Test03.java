package referenceRT;

public class Test03 {
    public static void main(String[] args) {
        //对象方法引用
        //匿名内部类
//        new MessInterface4() {
//            @Override
//            public String getMsg(Test03 test03) {
//                return test03.getObj();
//            }
//        };

        //lambda
        //System.out.println(((MessInterface4) (test03) -> test03.getObj()).getMsg(new Test03()));
        //
        //对象方法引入, 此时函数式接口接受参数test03且返回test03中的函数
        //相当于直接调用形参的方法
        System.out.println(((MessInterface4) (Test03::getObj)).getMsg(new Test03()));
    }

//    private String getObj(Test03 test03) {
//        return "Hello, Nick";
//    }

    public String getObj(){
        return "Hello, Nick";
    }
}
