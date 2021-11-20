package main.model;



import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class Users
{
    private int id;
    private byte isModerator;
    private Date regTime;
    private String name;
    private String email;
    private String password;
    private String code;
    private String photo;
    @OneToMany (mappedBy="moderatorId", fetch=FetchType.EAGER)
    private List<Posts> moderatedPosts;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "is_moderator", nullable = false, columnDefinition = "TINYINT")
    public byte getIs_moderator() {
        return isModerator;
    }
    public void setIs_moderator(byte isModerator) {
        this.isModerator = isModerator;
    }

    @Column(name = "reg_time", nullable = false)
    public Date getReg_time() {
        return regTime;
    }
    public void setReg_time(Date regTime) {
        this.regTime = regTime;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    @Column(columnDefinition = "text")
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
