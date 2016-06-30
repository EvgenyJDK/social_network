package org.social_network.models;

import javax.persistence.*;

@Entity
@Table(name = "message", schema = "socials_db")
public class Message {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "MESSAGE_ID")
    private int id;

    @Basic
    @Column(name = "MESSAGE_BODY")
    private String message;

    @ManyToOne
    @JoinColumn(name = "SENDER_ID")
    private User sender;
//    private int sender;

    @ManyToOne
    @JoinColumn(name = "RECEIVER_ID")
    private User receiver;

    @Basic
    @Column(name = "CHECK_STATUS")
    private boolean read;              // boolean Q




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message that = (Message) o;

        if (id != that.id) return false;
        if (sender != that.sender) return false;
        if (receiver != that.receiver) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
//        if (read != null ? !read.equals(that.read) : that.read != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
//        result = 31 * result + (message != null ? message.hashCode() : 0);
//        result = 31 * result + sender;
//        result = 31 * result + receiver;
//        result = 31 * result + (read != null ? read.hashCode() : 0);
        return result;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }
    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }
    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public boolean getRead() {
        return read;
    }
    public void setRead(boolean read) {
        this.read = read;
    }

}
