
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samson
 */
public class Substitution implements Encrypt {

    private HashMap<Character, Character> cipher;
    private HashMap<Character, Character> cipher1;
    private ArrayList<Character> encrypted;
    private ArrayList<Character> decrypted;
    private char c;
    private char d;
    private Character ch;
    

    @Override
    public String encrypt(String encrypt) {
        c = ' ';
        encrypted = new ArrayList<Character>(encrypt.length());
        cipher = new HashMap<Character, Character>();
        cipher.put('a', 'o');
        cipher.put('b', 'b');
        cipher.put('c', 'j');
        cipher.put('d', 'g');
        cipher.put('e', 'a');
        cipher.put('f', 'd');
        cipher.put('g', 'f');
        cipher.put('h', 'p');
        cipher.put('i', 'c');
        cipher.put('j', 'k');
        cipher.put('k', 'i');
        cipher.put('l', 'm');
        cipher.put('m', 's');
        cipher.put('n', 'r');
        cipher.put('o', 't');
        cipher.put('p', 'n');
        cipher.put('q', 'v');
        cipher.put('r', 'h');
        cipher.put('s', 'l');
        cipher.put('t', 'e');
        cipher.put('u', 'x');
        cipher.put('v', 'w');
        cipher.put('w', 'q');
        cipher.put('x', 'z');
        cipher.put('y', 'u');
        cipher.put('z', 'y');


        encrypt = encrypt.toLowerCase();
        for (int j = 0; j < encrypt.length(); j++) {
            c = cipher.get(encrypt.charAt(j));
            
            //c = encrypt.charAt(j);
            if (ch.isLetter(c) == false) {
                encrypted.add(c);
            } 
            else if (ch.isUpperCase(c) == true) {
                c = ch.toLowerCase(c);
            }else {
                //for (int i = 0; i < encrypt.length(); i++) {
                if (ch.isSpaceChar(c) == true) {
                    encrypted.add(j, c);
                } else {
                    //d = cipher.get(c);
                    encrypted.add(c);//add letter to the array
                }
            }
            //   }
        }
        
      String toReturn="";
      for(Character f:encrypted){
          toReturn+=f;
      }
      return toReturn;
    }

    @Override
    public String decrypt(String decrypt) {
        decrypted = new ArrayList<Character>(decrypt.length());
        
        for (int i = 0; i < decrypt.length(); i++) {
            decrypted.add(null);
        }
        
        cipher1 = new HashMap<Character, Character>();
        cipher1.put('o', 'a');
        cipher1.put('b', 'b');
        cipher1.put('j', 'c');
        cipher1.put('g', 'd');
        cipher1.put('a', 'e');
        cipher1.put('d', 'f');
        cipher1.put('f', 'g');
        cipher1.put('p', 'h');
        cipher1.put('c', 'i');
        cipher1.put('i', 'k');
        cipher1.put('k', 'j');
        cipher1.put('m', 'l');
        cipher1.put('s', 'm');
        cipher1.put('r', 'n');
        cipher1.put('t', 'o');
        cipher1.put('n', 'p');
        cipher1.put('v', 'q');
        cipher1.put('h', 'r');
        cipher1.put('l', 's');
        cipher1.put('e', 't');
        cipher1.put('x', 'u');
        cipher1.put('w', 'v');
        cipher1.put('q', 'w');
        cipher1.put('z', 'x');
        cipher1.put('u', 'y');
        cipher1.put('y', 'z');

        decrypt.toLowerCase();
        for (int j = 0; j < decrypt.length(); j++) {
            System.out.println(decrypt.charAt(j));
            c = cipher1.get(decrypt.charAt(j));
            System.out.println(c);

            if (ch.isLetter(c) == false) {
                //decrypted.remove(decrypted.size() - 1);
                decrypted.add(c);  
            }
            else if (ch.isUpperCase(c) == true) {
                c = ch.toLowerCase(c);
            } else {
                
                
            }
            //for (int i = 0; i < decrypt.length(); i++) {
            //else{
                if (ch.isSpaceChar(c) == true) {
                    decrypted.add(j, c);
                } else {
                    //d = cipher1.get(c);
                    decrypted.add(j, c);
                }
            //}
            //}
        }
        
        for (int i = 0; i < decrypted.size(); i++) {
            if (decrypted.get(i) == null) {
                decrypted.remove(i);
                i--;
            }
        }
      String toReturn="";
      for(Character f:decrypted){
          toReturn+=f;
      }
      return toReturn;
        //loop through the arrayList with a for loop, add each character to a String. then we can return that String.
        //that'll remove all the commas and brackets in the output.
        //for(int s=0;s<decrypted.size();s++){
      //      toReturn=toReturn.concat(decrypted.get(s).toString());
      //  }
     //   return toReturn;

    }
}
