
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
public class MemoryResidentBox implements MailBox{
List<Message> message = new ArrayList<Message>();
    @Override
    public void add(Message m) {
        message.add(m);
    }

    @Override
    public List<Message> retrieve() {
        return message;
    }
    
}
