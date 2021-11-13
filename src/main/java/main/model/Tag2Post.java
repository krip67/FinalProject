package main.model;

import javax.persistence.*;

@Entity
@Table(name = "tag2post")
public class Tag2Post
{
    private int id;
    private int postId;
    private int tagId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "post_id", nullable = false)
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Column(name = "tag_id", nullable = false)
    public int getTagId() {
        return tagId;
    }
    public void setTagId(int tagId) {
        this.tagId = tagId;
    }
}
