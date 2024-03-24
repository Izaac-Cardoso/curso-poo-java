package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name, email; 
    private Date birthDay;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Client(String user, String mail, Date birth) {      
       name = user;
       email = mail;
       birthDay = birth;
    }
  
    @Override
    public String toString() {
       return name + " (" + sdf.format(birthDay) + ") - " + email;
    }
}
