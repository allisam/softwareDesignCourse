
import java.util.ArrayList;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samson
 */
public class Caesar implements Encrypt {

    private Character ch;
    private char c;
    private int h;
    private ArrayList<Character> alpha = new ArrayList<Character>(26);
    private ArrayList<Character> encrypted;
    private ArrayList<Character> decrypted;
    private String alphab = "abcdefghaijklmnopqrstuvwxyz";

    @Override
    public String encrypt(String encrypt) {

        for (int y = 0; y < alphab.length(); y++) {
            alpha.add(y, alphab.charAt(y));
        }
        encrypted = new ArrayList<Character>(encrypt.length());

        for (int j = 0; j < encrypt.length(); j++) {
            c = encrypt.charAt(j);
            if (ch.isUpperCase(c) == true) {
                c = ch.toLowerCase(c);
            } else if (ch.isLetter(c) == false) {
                encrypted.add(j, c);
            } else {
                //for (int i = 0; i < encrypt.length(); i++) {
                if (ch.isSpaceChar(c) == true) {
                    encrypted.add(j, c);
                } else {
                    for (int k = 0; k < 26; k++) {
                        if (c == alpha.get(k)) {
                            h = k;
                        }
                    }
                    h = h + 15;
                    h = h % 26;
                    c = alpha.get(h);
                    encrypted.add(c);//add letter to the array
                }
                //}
            }
        }
        String toReturn = "";
        for (Character f : encrypted) {
            toReturn += f;
        }
        return toReturn;
    }

    @Override
    public String decrypt(String decrypt) {

        for (int y = 0; y < alphab.length(); y++) {
            alpha.add(y, alphab.charAt(y));
        }

        decrypted = new ArrayList<Character>(decrypt.length());

        for (int j = 0; j < decrypt.length(); j++) {
            c = decrypt.charAt(j);
            if (ch.isUpperCase(c) == true) {
                c = ch.toLowerCase(c);
            } else if (ch.isLetter(c) == false) {
                decrypted.add(j, c);
            } else {
                //for (int i = 0; i < decrypt.length(); i++) {
                if (ch.isSpaceChar(c) == true) {
                    decrypted.add(j, c);
                } else {
                    for (int k = 0; k < 26; k++) {
                        if (c == alpha.get(k)) {
                            h = k;
                        }
                    }
                    h = h + 11;
                    h = h % 26;
                    c = alpha.get(h);
                    decrypted.add(c);//add letter to the array
                }
                //}
            }
        }

        String toReturn = "";
        for (Character f : decrypted) {
            toReturn += f;
        }
        return toReturn;
    }
}