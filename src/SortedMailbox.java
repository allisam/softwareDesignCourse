
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samson
 */
public class SortedMailbox extends MailBoxDecorator{
  List<Message> mail = new ArrayList<Message>();
  public SortedMailbox(MailBox m){
           internalMailBox=m;
    }
    @Override
    public void add(Message m){
        
        internalMailBox.add(m);
    }
    @Override
    public List<Message> retrieve(){
        //for(Message q: internalMailBox)
        List l =internalMailBox.retrieve().subList(0, internalMailBox.retrieve().size());
        Collections.sort(l);
        
        return l;
    }
    
}
