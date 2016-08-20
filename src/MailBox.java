
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samson
 */
public interface MailBox {
    public void add(Message m);
    public List retrieve();
    
}
