
import java.util.Date;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samson
 */
public class SystemTest {

    public static void main(String[] args) {
  
       

        //Test Memory Resident Box
        MailBoxFactory f = new MailBoxFactory();
        String s = "Donny";
        String c = "Hi how are you?";
        Date d = new Date();
        String q = "Sandy";
        Message me = new Message(q, c, d);
        Message ma = new Message(s, c, d);
        MailBox m = f.createMemoryResidentBox();
        m.add(me);
       m.add(ma);
       List<Message> n = m.retrieve();
    for (Message y : n) {
          System.out.println(y.getDate());
           System.out.println(y.getFrom());
           System.out.println(y.getContent());
        }


        //Test 2 Filtered Mail Box 

       String nat = "Nathan";
        String med = "medical alert: Did you take your medicine?";
        Date ne = new Date();
        Message shiloh = new Message(nat, med, ne);
        m = f.createFilteeredMailbox(m);
        m.add(shiloh);
        m.add(me);
        n = m.retrieve();
        for (Message pi : n) {
            System.out.println(pi.getDate());
            System.out.println(pi.getFrom());
            System.out.println(pi.getContent());
        }


      //test 3 Sorted
        
         
  m = f.createSortedMailbox(m);
        m.add(ma);
        m.add(me);
        m.add(ma);

        n = m.retrieve();
        for (Message pt : n) {
            System.out.println(pt.getDate());
            System.out.println(pt.getFrom());
            System.out.println(pt.getContent());
        }
        
        //test 4 covert
        
        m=f.createCovertMailBox(m);
        
        m.add(me);
        n = m.retrieve();
        for (Message pi : n) {
            System.out.println(pi.getDate());
            System.out.println(pi.getFrom());
            System.out.println(pi.getContent());
        }


    }
}
