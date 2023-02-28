package codes;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageReader {
    Locale locale ;
    ResourceBundle rb;    
    
    public MessageReader(Locale locale){
        this.locale = locale;
        rb=  ResourceBundle.getBundle("messages", locale);
    }

    public String getMessage(String key){
        return rb.getString(key);
    }
}
