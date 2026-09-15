package ai0915;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
    public static void main(String[] args) {
        try{
//            BufferedReader br = new BufferedReader(new FileReader("D:/FileIOTest/myData1.txt.txt"));//절대경로
            BufferedReader br = new BufferedReader(new FileReader("myData1.txt.txt"));//상대경로

            String line = "";


            line= br.readLine();
            System.out.println(line);

            line= br.readLine();
            System.out.println(line);

            line= br.readLine();
            System.out.println(line);

            //File의 끝까지 File에서 한 줄씩 읽어오기



            br.close();

    }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
}
}
