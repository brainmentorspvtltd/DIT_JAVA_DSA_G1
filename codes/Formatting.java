package codes;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Formatting {
    private Locale locale;
    public Formatting(Locale locale){
        this.locale = locale;
    }
    public String doDateFormat(){
        Date date = new Date(); // System current Date
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        return df.format(date);
       // return date.toString();
    }
    public String doCurrencyFormat(double val){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(val);
    }
}
