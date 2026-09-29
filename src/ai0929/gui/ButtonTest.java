package ai0929.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest  extends JFrame {
    ButtonTest(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSizeDim = toolkit.getScreenSize();

        int sw = screenSizeDim.width;
        int sh = screenSizeDim.height;

        setLayout(new FlowLayout());
        setTitle("Button 컴포넌트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btn = new JButton("메세지 대화상자 보이기");



        add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"대화상자를 선택하셨네요");
            }
        });

        // 윈도우 창 크기
        int w = 500;
        int h = 200;

        setSize(w, h);

        // 화면 정중앙 위치 계산
        int x = sw / 2 - w / 2;
        int y = sh / 2 - h / 2;

        // 윈도우 창을 화면 정중앙으로 이동
        setLocation(x, y);

        setVisible(true);





        setSize(500, 200);
        setVisible(true);
    }





    public static void main(String[] args) {
        new ButtonTest();
    }
}
