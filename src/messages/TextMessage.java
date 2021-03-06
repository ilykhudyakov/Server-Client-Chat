package messages;

import java.io.Serializable;


public class TextMessage implements Messages, Serializable {

    private long timestamp;
    private String sender;
    private String text;
    private int id;

    public TextMessage(int id, long timestamp, String sender, String text) {
        this.id = id;
        this.timestamp = timestamp;
        this.sender = sender;
        this.text = text;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "components.Message{" +
                "timestamp=" + timestamp +
                ", sender='" + sender + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}