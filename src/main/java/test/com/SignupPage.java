/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

/**
 * This class holds the user information related to the SignUp Page
 * 
 * @author Hashim
 */
public class SignupPage {
    String newusername;
    String newpassword;

    /**
     *
     * @return
     */
    public String getNewusername() {
        return newusername;
    }

    /**
     *
     * @param newusername
     */
    public void setNewusername(String newusername) {
        this.newusername = newusername;
    }

    /**
     *
     * @return
     */
    public String getNewpassword() {
        return newpassword;
    }

    /**
     *
     * @param newpassword
     */
    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    @Override
    public String toString() {
        return "SignupPage{" + "newusername=" + newusername + ", newpassword=" + newpassword + '}';
    }

   
  }
