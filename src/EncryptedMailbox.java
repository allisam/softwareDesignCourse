
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samson
 */
public class EncryptedMailbox extends MailBoxDecorator{
  
  int j;
  Encrypt y;
 
    public EncryptedMailbox(MailBox m, Encrypt e){
      internalMailBox=m;
     
          y=e;
     
      }
  
  @Override
    public void add(Message m){
       String c=y.encrypt(m.getContent());
       System.out.println(c);
       
        String f=y.encrypt(m.getFrom());
        System.out.println(f);
        Message n = new Message(f, c, m.getDate());
        internalMailBox.add(n);
    }
   
    @Override
    public List retrieve(){
        List<Message> newMail = new ArrayList<Message>();
        List<Message> mail= internalMailBox.retrieve();
        for(Message m: mail){
            System.out.println(m.getContent());
           String c= y.decrypt(m.getContent());
            System.out.println(c);
            System.out.println(m.getFrom());
           String f= y.decrypt(m.getFrom());
            System.out.println(f);
           Message me= new Message(f, c, m.getDate());    
           newMail.add(me);
        }
        return newMail;
    }
     
    
   /*
     List<Character> encrypted; 
        encrypted = new ArrayList<Character>();
        for (int i = 0; i < m.length(); i++) {
            encrypted.add(' ');
        }

        for (int i = 0; i < m.length(); i++) {

            if (i % 2 == 0) {
                if (i + 2 >= m.length()) {
                    j = 0;

                } else {
                    j = i + 2;
                }
                encrypted.set(j, m.charAt(i));
            } else {
                if (i % 2 != 0) {
                    if (i - 2 < 0) {

                        j = m.length() - 1;
                        if (j % 2 == 0) {
                            j -= 1;
                        }

                    } else {
                        j = i - 2;
                    }
                }
                encrypted.set(j, m.charAt(i));
            }
        }
          String toReturn="";
      for(Character i:encrypted){
          toReturn+=i;
      }
        //return encrypted.toString();



        //loop through the arrayList with a for loop, add each character to a String. then we can return that String.
        //that'll remove all the commas and brackets in the output.
        return toReturn;
    
    }
    
     public String decrypt(String decrypt) {

        List<Character> decrypted = new ArrayList<Character>();
        for (int i = 0; i < decrypt.length(); i++) {
            decrypted.add(' ');
        }
        for (int i = 0; i < decrypt.length(); i++) {

            if (i % 2 != 0) {
                if (i + 2 >= decrypt.length()) {
                    j = 1;

                } else {
                    j = i + 2;
                }
                decrypted.set(j, decrypt.charAt(i));

            } else {
                if (i % 2 == 0) {
                    if (i - 2 < 0) {
                        j = decrypt.length() - 1;
                        if (j % 2 != 0) {
                            j -= 1;
                        }
                    } else {

                        j = i - 2;
                    }

                    decrypted.set(j, decrypt.charAt(i));
                }
            }
        }
      String toReturn="";
      for(Character c : decrypted){
          toReturn+=c;
      }
      return toReturn;
    }
    * */
    
  
}
