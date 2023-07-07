package referenceRT;

public class MsgEntity {
    int MsgId;
    String MsgContent;

    @Override
    public String toString() {
        return "MsgEntity{" +
                "MsgId=" + MsgId +
                ", MsgContent='" + MsgContent + '\'' +
                '}';
    }
}
