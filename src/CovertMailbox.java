
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samson
 */
public class CovertMailbox extends MailBoxDecorator {
    
    public CovertMailbox(MailBox m){
           internalMailBox=m;
    }
    @Override
    public void add(Message m){
            internalMailBox.add(m);
    }
    @Override
    public List<Message> retrieve(){
        List<Message> mail2 = new ArrayList<Message>();
       List<Message> i = internalMailBox.retrieve();
        for(Message me : i){
           String s = "Hello, " + me.getContent();
           //my not very sophisticated embedded message
           //return the message
           Message t= new Message(me.getFrom(), s, me.getDate());
           //add the mail to it 
           mail2.add(t);
        }
        return mail2;
    }
}
