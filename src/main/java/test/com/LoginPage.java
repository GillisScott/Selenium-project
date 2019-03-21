/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

/**
 *
 * @author Hashim
 */
public class LoginPage {
    String username;
    String password;
    String invPassword;

    @Override
    public String toString() {
        return "LoginPage{" + "username=" + username + ", password=" + password + '}';
    }

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
    
    public String getInvPassword() {
        return invPassword;
    }

    public void setInvPassword(String invPassword) {
        this.invPassword = invPassword;
    }
}
