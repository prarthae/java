import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class file1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name : ");
        String fileName = sc.next();

        FileOutputStream fos = new FileOutputStream(fileName);
        System.out.println("Enter the text to insert");
        String text = sc.next();
        fos.write(text.getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);
        byte[] b = new byte[fis.available()];
        fis.read(b);
        fis.close();

        String content = new String(b);
        System.out.println("Content \n" + fileName);
        System.out.println(content);
    }
}
