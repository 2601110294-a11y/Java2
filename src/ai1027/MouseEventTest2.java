package ai1027;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest2 extends JFrame {
    JLabel lbl = new JLabel();


    public MouseEventTest2(){
        JPanel panel = new JPanel();
        JButton btnRed = new JButton("레드");
        JButton btnBlue = new JButton("블루");
        JButton btnYellow = new JButton("엘로우");
        lbl.setOpaque(true);


        panel.add(btnRed);panel.add (btnBlue);panel.add(btnYellow);
        add(panel);
        add("South",lbl);

        btnRed.addMouseListener(btnMouseLister);
        btnBlue.addMouseListener(btnMouseLister);
        btnYellow.addMouseListener(btnMouseLister);


        SetFrame.setFrame(this,"MouseEvent Programming",300,300);
    }

    MouseListener btnMouseLister = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton eBtn = (JButton)e.getSource();
            Color color = null;

            System.out.println("버튼에 마우스가 클릭됨");
            lbl.setText("버튼에 마우스가 클릭됨");

            switch (eBtn.getText()) {
                case "레드":
                    color = Color.RED;
                    break;
                case "블루":
                    color = Color.BLUE;
                    break;
                case "엘로우":
                    color = Color.YELLOW;
                    break;
            }

            lbl.setBackground(color);

        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("버튼에 마우스가 눌러짐");
            lbl.setText("버튼에 마우스가 눌러짐");

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("버튼에 마우스가 해제됨");
            lbl.setText("버튼에 마우스가 해제됨");

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("버튼에 마우스가 들어옴");
            lbl.setText("버튼에 마우스가 들어옴");

        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("버튼에 마우스가 나감");
            lbl.setText("버튼에 마우스가 나감");

        }
    };



    public static void main(String[] args) {
        new MouseEventTest2();

    }
}
