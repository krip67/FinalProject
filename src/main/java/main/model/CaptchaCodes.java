package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "captcha_codes")
public class CaptchaCodes
{
    private int id;
    private Date time;
    private byte code;
    private byte secretCode;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false)
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

    @Column(nullable = false)
    public byte getCode() {
        return code;
    }
    public void setCode(byte code) {
        this.code = code;
    }

    @Column(name = "secret_code", nullable = false)
    public byte getSecretCode() {
        return secretCode;
    }
    public void setSecretCode(byte secretCode) {
        this.secretCode = secretCode;
    }
}
