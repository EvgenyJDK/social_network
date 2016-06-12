package org.social_network.models;

import java.util.List;
import java.util.Set;

/**
 * Created by Админ on 07.06.2016.
 */
public class Friend {

    private int idFriend;
    private List<Message> messages;
    private Set<Profile> profiles;
    private boolean status;


    public Friend(int idFriend, List<Message> messages, Set<Profile> profiles, boolean status) {
        setIdFriend(idFriend);
        setMessages(messages);
        setProfiles(profiles);
        setStatus(status);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "idFriend=" + idFriend +
                ", messages=" + messages +
                ", profiles=" + profiles +
                ", status=" + status +
                '}';
    }

    public int getIdFriend() { return idFriend; }
    public void setIdFriend(int idFriend) { this.idFriend = idFriend; }

    public List<Message> getMessages() { return messages; }
    public void setMessages(List<Message> messages) { this.messages = messages; }

    public Set<Profile> getProfiles() { return profiles; }
    public void setProfiles(Set<Profile> profiles) { this.profiles = profiles; }

    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }
}

