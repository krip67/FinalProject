package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Posts
{
    private int id;
    private byte isActive;
    @Enumerated(EnumType.STRING)
    @Column(name = "moderation_status", nullable = false, columnDefinition = "enum")
    private ModerationStatus moderationStatus;
    private int moderatorId;
    private int userId;
    private Date time;
    private String title;
    private String text;
    private int viewCount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "is_active", nullable = false, columnDefinition = "TINYINT")
    public byte getIsActive() {
        return isActive;
    }
    public void setIsActive(byte isActive) {
        this.isActive = isActive;
    }


    public ModerationStatus getModerationStatus() {
        return moderationStatus;
    }
    public void setModerationStatus(ModerationStatus moderationStatus) {
        this.moderationStatus = moderationStatus;
    }

    @Column(name = "moderator_id")
    public int getModeratorId() {
        return moderatorId;
    }
    public void setModeratorId(int moderatorId) {
        this.moderatorId = moderatorId;
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

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(columnDefinition = "text", nullable = false)
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    @Column(name = "view_count", nullable = false)
    public int getViewCount() {
        return viewCount;
    }
    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
