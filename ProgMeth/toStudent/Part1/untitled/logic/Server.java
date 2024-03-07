package logic;

import java.util.ArrayList;

public class Server {
    private String name;
    private User owner;
    private ArrayList<Channel> channelList;
    private ArrayList<User> memberList;

    public Server(String name, User owner, TemplateType template) {
        setOwner(owner);
        memberList = new ArrayList<User>();
        channelList = new ArrayList<>();

        addUser(owner);
        owner.addJoinedServersList(this);

        setName(name);

        if (template == TemplateType.BASIC) {
            addChannel(owner, "general");
        } else if (template == TemplateType.GAMING) {
            addChannel(owner, "gaming");
        } else if (template == TemplateType.STUDY) {
            addChannel(owner, "homework-help");
        }
    }

    public Channel addChannel(User user, String channelName) {
        if (user.equals(getOwner())) {
            Channel newChannel = new Channel(channelName);
            channelList.add(newChannel);
            return newChannel;
        } else {
            return null;
        }
    }

    public User addUser(User user) {
        if (!getMemberList().contains(user)) {
            memberList.add(user);
            user.addJoinedServersList(this);
            return user;
        } else {
            return null;
        }
    }

    public boolean kickUser(User kicker, User kicked) throws Exception{
        if (!kicker.equals(getOwner())) {
            throw new Exception();
        } else if (kicker.equals(getOwner()) && (!getMemberList().contains(kicked))) {
            return false;
        } else {
            kicked.getJoinedServersList().remove(this);
            memberList.remove(kicked);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            this.name = getOwner() + " home";
        } else {
            this.name = name;
        }
    }
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public ArrayList<Channel> getChannelList() {
        return channelList;
    }

    public void setChannelList(ArrayList<Channel> channelList) {
        this.channelList = channelList;
    }

    public ArrayList<User> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<User> memberList) {
        this.memberList = memberList;
    }
}
