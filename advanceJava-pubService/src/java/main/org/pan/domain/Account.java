package org.pan.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/2/29.
 */
@Entity
public class Account extends AbstractDomain {

    @Column
    private String username;
    @Column
    private String password;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
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

    public AccountHeaderImage getAccountHeaderImage() {
        return accountHeaderImage;
    }

    public void setAccountHeaderImage(AccountHeaderImage accountHeaderImage) {
        this.accountHeaderImage = accountHeaderImage;
    }
}
