package ai0922;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgCopy {
    public static void main(String[] args) {

        try {
            FileInputStream fIn = new FileInputStream("fireplay.jpeg");
            FileOutputStream fOut = new FileOutputStream("C:fireplayCopy.jpeg");

            int data;

            while ((data = fIn.read()) != -1) {
                fOut.write((byte) data);
            }

            fIn.close();
            fOut.close();

            System.out.println("이미지 복사 완료");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}