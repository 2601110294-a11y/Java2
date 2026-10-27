package ai1027;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class LAB_RandomDice  extends JFrame {
    public LAB_RandomDice(){
        Random random = new Random();
        int rows = random.nextInt(10) + 1;
        int cols = random.nextInt(10) + 1;
        setLayout(new GridLayout(rows, cols, 2, 2));




        // 숫자에 따른 버튼 색상
        Color[] colors = {
                Color.RED,       // 1
                Color.GREEN,     // 2
                Color.BLUE,      // 3
                Color.YELLOW,    // 4
                Color.MAGENTA,   // 5
                Color.ORANGE     // 6
        };

        for (int i = 0; i < rows * cols; i++) {

            // 주사위 숫자 1~6
            int num = random.nextInt(6) + 1;

            JButton btn = new JButton("" + num);

            // 숫자에 맞는 색상 설정
            btn.setBackground(colors[num - 1]);
            btn.setOpaque(true);

            add(btn);
        }







        SetFrame.setFrame(this,"주사위숫자채우기",500,500);
    }



    public static void main(String[] args) {
        new LAB_RandomDice();
    }
}
