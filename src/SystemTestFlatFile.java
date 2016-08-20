/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samson
 */
import java.util.Date;
import java.util.List;
public class SystemTestFlatFile {
  


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samson
 */


    public static void main(String[] args) {
         MailBoxFactory f = new MailBoxFactory();
        String s = "Donny";
        String c = "Hi how are you?";
        Date d = new Date();
        String q = "Sandy";
        Message me = new Message(q, c, d);
        Message ma = new Message(s, c, d);
        MailBox m = f.createFlatFileBox();
        System.out.println();
        m.add(me);
        m.add(ma);
        List<Message> n = m.retrieve();
        for (Message y : n) {
            
            System.out.println(y.getFrom());
            System.out.println(y.getContent());
           System.out.println(y.getDate());
            
     
        }
  
    }
}
    
