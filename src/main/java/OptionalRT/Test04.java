package OptionalRT;


import java.util.Optional;

public class Test04 {
    public static void main(String[] args) {
        System.out.println(getMsg2());
    }

    public static String getMsg(){
        //优化前
        MsgEntity msgEntity = new MsgEntity(2, "HAVE A GOOD DAY!");
        if(msgEntity!=null){
            String str = msgEntity.MsgContent;
            if(str!=null){
                return str.toLowerCase();
            }
        }
        return null;
    }

    public static String getMsg2(){
        MsgEntity msgEntity = new MsgEntity(2, "HAVE A GOOD DAY!");
        return Optional.ofNullable(msgEntity).map(msg-> msg.MsgContent)
                .map(String::toLowerCase).get();
    }

}
