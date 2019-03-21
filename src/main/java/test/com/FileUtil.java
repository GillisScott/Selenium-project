/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * File Utility to extract user information from a file.
 * 
 * @author Hashim
 */
public class FileUtil {
    
    LoginPage login;
    SignupPage signup;
    
    /**
     *  Constructor to invoke load file
     */
    public FileUtil() {
        loadFile();
    }
    
    /**
     *  Method to extract user credentials from a file
     * 
     *  @exception File not found, IO Exception
     */   
    private void loadFile() {
        try {
            FileReader fr = new FileReader("C:\\data\\itexpsdata.txt");
            BufferedReader br = new BufferedReader(fr);
            
            //username
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, "=");
            st.nextToken();
            String username = (String)st.nextToken();
            System.out.println("username=="+username);
            //password
            line = br.readLine();
            st = new StringTokenizer(line, "=");
            st.nextToken();
            String password = (String)st.nextToken();
            
            //invalid password
            line = br.readLine();
            st = new StringTokenizer(line, "=");
            st.nextToken();
            String invpassword = (String)st.nextToken();
            
            //new Signup username
            line = br.readLine();
            st = new StringTokenizer(line, "=");
            st.nextToken();
            String newusername = (String)st.nextToken();
            
            //new Signup username
            line = br.readLine();
            st = new StringTokenizer(line, "=");
            st.nextToken();
            String newpassword = (String)st.nextToken();
            
            //populate values
            login = new LoginPage();
            login.setUsername(username);
            login.setPassword(password);
            login.setInvPassword(invpassword);
            
            signup = new SignupPage();
            signup.setNewusername(newusername);  
            signup.setNewpassword(newpassword);
            
            //print object
            System.out.println(login);
            System.out.println(signup);
             
            //close file
            br.close();
            fr.close();
             
        } catch (FileNotFoundException e) {
             e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    /**
     *
     * @return username
     */
    public String getUsername(){
        return login.getUsername();
    }
    
    /**
     *
     * @return password 
     */
    public String getPassword() {
        return login.getPassword();
    }
    
    /**
     *
     * @return invalid password
     */
    public String getInvPassword() {
        return login.getInvPassword();
    }
       
}
