package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_votes")
public class PostVotes
{
    private int id;
    private int userId;
    private int postId;
    private Date time;
    private byte value;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "post_id", nullable = false)
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Column(nullable = false)
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

    @Column(nullable = false, columnDefinition = "TINYINT")
    public byte getValue() {
        return value;
    }
    public void setValue(byte value) {
        this.value = value;
    }
}
