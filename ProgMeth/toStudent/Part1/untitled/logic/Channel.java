package logic;

import java.util.ArrayList;

public class Channel {
    private String name;
    private ArrayList<Message> messagesList;

    public Channel(String name) {
        setName(name);
        ArrayList<Message> messageList = new ArrayList<Message>();

    }

    public void addMessage(Message message) {
        messagesList.add(message);
    }

    public void setName(String name) {
        if (name.isBlank()) {
            this.name = "off-topic";
        } else {
            this.name = name;
        }
    }

    public int getMessageCount() {
        return messagesList.size();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Message> getMessagesList() {
        return messagesList;
    }
}
