package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_comments")
public class PostComments
{
    private int id;
    private int parentId;
    private Posts postId;
    private Users userId;
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "posts_id")
    public Posts getPostId() {
        return postId;
    }
    public void setPostId(Posts postId) {
        this.postId = postId;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    public Users getUserId() {
        return userId;
    }
    public void setUserId(Users userId) {
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
