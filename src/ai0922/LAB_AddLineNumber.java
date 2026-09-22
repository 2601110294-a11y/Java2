package ai0922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LAB_AddLineNumber {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("TestNote.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        int num = 1;

        while ((line = br.readLine()) != null) {
            System.out.println(num + " : " + line);
            num++;
        }

        br.close();
        fr.close();
    }
}