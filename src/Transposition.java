
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samson
 */
public class Transposition implements Encrypt {

    private int j;
    private Character c;
    private ArrayList<Character> encrypted;
    private ArrayList<Character> decrypted;
   

    @Override
    public String encrypt(String encrypt) {
        encrypted = new ArrayList<Character>();
        for (int i = 0; i < encrypt.length(); i++) {
            encrypted.add(' ');
        }

        for (int i = 0; i < encrypt.length(); i++) {

            if (i % 2 == 0) {
                if (i + 2 >= encrypt.length()) {
                    j = 0;

                } else {
                    j = i + 2;
                }
                encrypted.set(j, encrypt.charAt(i));
            } else {
                if (i % 2 != 0) {
                    if (i - 2 < 0) {

                        j = encrypt.length() - 1;
                        if (j % 2 == 0) {
                            j -= 1;
                        }

                    } else {
                        j = i - 2;
                    }
                }
                encrypted.set(j, encrypt.charAt(i));
            }
        }
          String toReturn="";
      for(Character c:encrypted){
          toReturn+=c;
      }
        //return encrypted.toString();



        //loop through the arrayList with a for loop, add each character to a String. then we can return that String.
        //that'll remove all the commas and brackets in the output.
        return toReturn;
    }

    @Override
    public String decrypt(String decrypt) {

        decrypted = new ArrayList<Character>();
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
}
