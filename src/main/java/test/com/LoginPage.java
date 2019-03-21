/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

/**
 * This class holds the user information related to the Login Page
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

    /**
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     *
     * @return invPassword
     */
    public String getInvPassword() {
        return invPassword;
    }

    /**
     *
     * @param invPassword
     */
    public void setInvPassword(String invPassword) {
        this.invPassword = invPassword;
    }
}
