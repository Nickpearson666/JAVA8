package OptionalRT;

import java.util.Optional;
import java.util.function.Supplier;

public class Test03 {

    private static MsgEntity msgEntity;
    public static void main(String[] args) {
        System.out.println(Test03.msgEntity);
        System.out.println(Test03.getMsgEntity());
        System.out.println(Test03.msgEntity);
    }

    public static MsgEntity getMsgEntity(){
//        if(msgEntity == null){
//            msgEntity = createMsgEntity();
//        }
        //此方法并没有给全局变量赋值
        //return Optional.ofNullable(msgEntity).orElse(createMsgEntity());
        //给全局变量赋值 + 方法引用
        return Optional.ofNullable(msgEntity).orElseGet(Test03::createMsgEntity2);
    }

    public static MsgEntity createMsgEntity(){
        return new MsgEntity(1, "Hi");
    }

    public static MsgEntity createMsgEntity2(){
        msgEntity = createMsgEntity();
        return msgEntity;
    }
}
