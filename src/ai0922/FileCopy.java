package ai0922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try{

            BufferedReader br = new BufferedReader(new FileReader("myData1.txt.txt"));

            FileWriter fw = new FileWriter("newFile.txt");

            String line = "";

            while(true){
                line = br.readLine();
                if(line == null)
                    break;

                fw.write(line+"\n");
            }


            System.out.println("myData1.txt.txt.file이 enw file.txt 파일로 복사 완료");


            fw.close();
            br.close();






        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
