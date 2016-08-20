
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samson
 */
public class FilteeredMailbox extends MailBoxDecorator{
  List mail;
  public FilteeredMailbox(MailBox m){
           internalMailBox=m;
    }
    @Override
    public void add(Message m){
        String c=m.getContent();
        if(c.contains("medical")==false ){
            internalMailBox.add(m);
        }
        else{
        return ;
    }
    }
    @Override
    public List<Message> retrieve(){
        return internalMailBox.retrieve();
    }
}
