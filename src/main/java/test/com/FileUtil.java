/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author Hashim
 */
public class FileUtil {
    
    LoginPage login;
    SignupPage signup;
    
    public FileUtil() {
        loadFile();
    }
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
             
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public String getUsername(){
        return login.getUsername();
    }
    
    public String getPassword() {
        return login.getPassword();
    }
    
    public String getInvPassword() {
        return login.getInvPassword();
    }
       
}
