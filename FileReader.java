import java.util.HashMap;
import java.io.*;
/**
 * Write a description of class FileReader here.
 *
 * @author (호즈미요시아키(2018315054),야마모토 요시카(2018315051))
 * @version (2019/10/7)
 */
public class FileReader
{
    public static void main(String[] args){
        FileReader fin = new FileReader("c:\temp\inputData20191007.txt");
        try{
            fin = new FileReader("c:\temp\inputData20191007.txt");
            int c;
            while((c = fin.read()) != -1){
                System.out.print((char)c);
            }
            fin.close();
        }
        catch(IOException e){
            System.out.println("입출력 오류");
        }
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        
    }
}
