
import java.util.Comparator;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samson
 */
public class Message implements Comparable{
    
    String from;
    String content;
    Date date;
    public Message(String f, String c, Date d){
        from=f;
        content=c;
        date=d;
    }
   public String getFrom(){
       return from; 
    }
   public String getContent(){
       return content;
   }
   public Date getDate(){
       return date;
   }


    @Override
    public int compareTo(Object t) {
        Message ne=(Message)t;
        return from.compareTo(ne.getFrom());
    }
  
   
}
