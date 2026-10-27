package ai1027;

import center.CenterFrame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderTest extends JFrame {

    public BorderTest() {
        super("Border Layout 연습");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 1. 버튼객체 생성
        JButton btn1 = new JButton("북쪽");
        JButton btn2 = new JButton("남쪽");
        JButton btn3 = new JButton("동쪽");
        JButton btn4 = new JButton("서쪽");
        JButton btn5 = new JButton("중앙");

        // 2. JFrame의 각 위치에 추가
        setLayout(new BorderLayout());

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);
        add(btn3, BorderLayout.EAST);
        add(btn4, BorderLayout.WEST);
        add(btn5, BorderLayout.CENTER);

        // 3. 버튼 이벤트 연결
        btn1.addActionListener(btnListener);
        btn2.addActionListener(btnListener);
        btn3.addActionListener(btnListener);
        btn4.addActionListener(btnListener);
        btn5.addActionListener(btnListener);

        int w = 250, h = 250;
        Point point = CenterFrame2.getLocation(w, h);
        setBounds(point.x, point.y, w, h);
        setVisible(true);
    }

    ActionListener btnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton eBtn = (JButton) e.getSource();

            JOptionPane.showMessageDialog(null, eBtn.getText() + "버튼이 선택되었습니다.");
        }
    };

    public static void main(String[] args) {
        new BorderTest();
    }
}