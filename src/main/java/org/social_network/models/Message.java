package org.social_network.models;

import java.util.Set;

/**
 * Created by Админ on 07.06.2016.
 */
public class Message {

    private int messageId;
    private String messageBody;
    private Set<User> usersSenders;
    private Set<User> usersReceivers;
    private boolean checkStatus;


    public Message() {
    }

    public Message(int messageId, String messageBody, Set<User> usersSenders, Set<User> usersReceivers, boolean checkStatus) {
        setMessageId(messageId);
        setMessageBody(messageBody);
        setUsersSenders(usersSenders);
        setUsersReceivers(usersReceivers);
        setCheckStatus(checkStatus);
    }


    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", usersSenders=" + usersSenders +
                ", checkStatus=" + checkStatus +
                '}';
    }


    public int getMessageId() { return messageId; }
    public void setMessageId(int messageId) { this.messageId = messageId; }

    public String getMessageBody() { return messageBody; }
    public void setMessageBody(String messageBody) { this.messageBody = messageBody; }

    public Set<User> getUsersReceivers() { return usersReceivers; }
    public void setUsersReceivers(Set<User> usersReceivers) { this.usersReceivers = usersReceivers; }

    public Set<User> getUsersSenders() { return usersSenders; }
    public void setUsersSenders(Set<User> usersSenders) { this.usersSenders = usersSenders; }

    public boolean isCheckStatus() { return checkStatus; }
    public void setCheckStatus(boolean checkStatus) { this.checkStatus = checkStatus;  }
}
