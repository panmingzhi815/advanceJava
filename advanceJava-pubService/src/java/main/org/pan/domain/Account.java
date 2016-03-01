package org.pan.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by Administrator on 2016/2/29.
 */
@Entity
public class Account extends AbstractDomain {

    @Column
    private String username;
    @Column
    private String password;
    @OneToOne(mappedBy = "account")
    private AccountHeaderImage accountHeaderImage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
