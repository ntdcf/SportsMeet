package com.luohao.sportmeet.Model;

/**
 * Created by luogkme on 2017/1/19.
 */

public class UserModel {
    private String username;
    private String usernumber;
    private String password;
    private int usertype;

    private int usercollege;
    private int usermajor;
    private int usergradeclass;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public int getUsercollege() {
        return usercollege;
    }

    public void setUsercollege(int usercollege) {
        this.usercollege = usercollege;
    }

    public int getUsermajor() {
        return usermajor;
    }

    public void setUsermajor(int usermajor) {
        this.usermajor = usermajor;
    }

    public int getUsergradeclass() {
        return usergradeclass;
    }

    public void setUsergradeclass(int usergradeclass) {
        this.usergradeclass = usergradeclass;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "username='" + username + '\'' +
                ", usernumber='" + usernumber + '\'' +
                ", password='" + password + '\'' +
                ", usertype=" + usertype +
                ", usercollege=" + usercollege +
                ", usermajor=" + usermajor +
                ", usergradeclass=" + usergradeclass +
                '}';
    }
}
