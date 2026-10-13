
package ai1013;

import center.CenterFrame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FlowLayoutTest extends JFrame {

    ArrayList<JButton> list = new ArrayList<JButton>(5);

    Color[] colors = {
            Color.RED,
            Color.YELLOW,
            Color.GREEN,
            Color.BLUE,
            Color.PINK
    };

    boolean flag = true;

    public FlowLayoutTest() {
        setTitle("FlowLayout 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 15));

        for (int i = 0; i < 5; i++) {
            JButton btn = new JButton("버튼" + (i + 1));
            btn.setBackground(Color.LIGHT_GRAY);
            list.add(btn);
            add(btn);
            btn.addActionListener(btnListener);
        }

        int w = 250, h = 250;
        Point point = CenterFrame2.getLocation(w, h);
        setBounds(point.x, point.y, w, h);
        setVisible(true);
    }

    ActionListener btnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JButton selectedBtn = (JButton) e.getSource();

            switch (list.indexOf(selectedBtn)) {
                case 0:
                    if (flag) {
                        selectedBtn.setBackground(colors[0]);
                        flag = false;
                    } else {
                        selectedBtn.setBackground(Color.LIGHT_GRAY);
                        flag = true;
                    }
                    break;

                case 1:
                    if (flag) {
                        selectedBtn.setBackground(colors[1]);
                        flag = false;
                    } else {
                        selectedBtn.setBackground(Color.LIGHT_GRAY);
                        flag = true;
                    }
                    break;

                case 2:
                    if (flag) {
                        selectedBtn.setBackground(colors[2]);
                        flag = false;
                    } else {
                        selectedBtn.setBackground(Color.LIGHT_GRAY);
                        flag = true;
                    }
                    break;

                case 3:
                    if (flag) {
                        selectedBtn.setBackground(colors[3]);
                        flag = false;
                    } else {
                        selectedBtn.setBackground(Color.LIGHT_GRAY);
                        flag = true;
                    }
                    break;

                case 4:
                    if (flag) {
                        selectedBtn.setBackground(colors[4]);
                        flag = false;
                    } else {
                        selectedBtn.setBackground(Color.LIGHT_GRAY);
                        flag = true;
                    }
                    break;
            }
        }
    };

    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}
