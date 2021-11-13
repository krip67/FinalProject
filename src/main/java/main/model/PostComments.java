package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_comments")
public class PostComments
{
    private int id;
    private int parentId;
    private int postId;
    private int userId;
    private Date time;
    private String text;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "parent_id")
    public int getParentId() {
        return parentId;
    }
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Column(name = "post_id", nullable = false)
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(nullable = false)
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

    @Column(columnDefinition = "text", nullable = false)
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
