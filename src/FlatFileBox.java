
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samson
 */
public class FlatFileBox implements MailBox {

    FileWriter file;
    Scanner f;

    public FlatFileBox() {
        try {
            file = new FileWriter(new File("FlatFile.txt"));
        } catch (Exception e) {
        }
    }

    @Override
    public void add(Message m) {
        String s = m.getContent() + " \n" + m.getFrom() + " \n" + m.getDate();
        //System.out.println(s);
        try {
            file.append(s);//, 0, s.length());
            file.flush();
        } catch (Exception e) {
        }


    }

    @Override
    public List<Message> retrieve() {
        List<Message> mail = new ArrayList<Message>();
        Date d;
        String t;
        String t1;
        String l;
        try {
            f = new Scanner(new File("FlatFile.txt"));
             while (f.hasNextLine()) {
            t = f.nextLine();
            //System.out.println(t);
            t1 = f.nextLine();
            //System.out.println(t1);
            d=new Date(f.nextLine());
              Message m = new Message(t1, t, d);
             mail.add(m);
             
             }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FlatFileBox.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mail;
       /* while (f.hasNextLine()) {
            t = f.nextLine();
            System.out.println(t);
            t1 = f.nextLine();
            System.out.println(t1);
            DateFormat df = new SimpleDateFormat();
            try {
                l=f.nextLine();
                d = df.parse(l);
                Message m = new Message(t1, t, d);
                mail.add(m);
            } catch (Exception e) {
            
            }*/

            // System.out.println(t);
            // temp=t.split(" :. ");
            //System.out.println(temp.toString());


        }




       

    }
