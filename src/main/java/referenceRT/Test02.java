package referenceRT;

public class Test02 {
    public static void main(String[] args) {
        //Test02 test02 = new Test02();
        //对象方法引入
        System.out.println(((MessInterface2) new Test02()::getMsg).getMsg());
        //构造方法引入
        System.out.println(((MessInterface3) (MsgEntity::new)).getMsgEntity());
    }

    public String getMsg(){
        return "Hi,nihao";
    }

    public String getObj(){
        return "Hello, Nick";
    }
}
