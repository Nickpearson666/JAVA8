package OptionalRT;

public class MsgEntity {
    int MsgId;
    String MsgContent;

    public MsgEntity(int msgId, String msgContent) {
        MsgId = msgId;
        MsgContent = msgContent;
    }

    @Override
    public String toString() {
        return "MsgEntity{" +
                "MsgId=" + MsgId +
                ", MsgContent='" + MsgContent + '\'' +
                '}';
    }
}
