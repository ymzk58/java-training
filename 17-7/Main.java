import java.io.*;
public class Main{
    public static void main (String[] args){
        FileWriter fw;
        try {
            fw = new FileWriter("data.txt");
            fw.write("hello");
        } catch(Exception e){
            System.out.println("何らかの例が発生しました");
        } finally{
            fw.close();
        }
    }
}