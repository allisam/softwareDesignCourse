/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samson
 */
public class MailBoxFactory {
    public static MailBox createMemoryResidentBox(){
        return new MemoryResidentBox();
    }
    public static MailBox createFlatFileBox(){
        return new FlatFileBox();    
    }
    public static MailBox createCovertMailBox(MailBox m){
        return new CovertMailbox(m);
                
    }
    public static MailBox createEncryptMailBox(MailBox m, Encrypt type){
        return new EncryptedMailbox(m, type);
    }
    public static MailBox createSortedMailbox(MailBox m){
        return new SortedMailbox(m);
    }
    public static MailBox createFilteeredMailbox(MailBox m){
        return new FilteeredMailbox(m);
    }
}
