package ai1006;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonTest extends JFrame {
    ImageIcon[] imageIcons;
    JLabel lbl;
    JRadioButton[] radios;
    int i;

    RadioButtonTest() {
        setTitle("라디오버튼 테스트");// super("프레임제목");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panNorth = new JPanel();// 작은 박스
        String[] entertainers = {"에스파", "아이브", "리센느"};

        radios = new JRadioButton[entertainers.length];
        imageIcons = new ImageIcon[entertainers.length];
        lbl = new JLabel();

        ButtonGroup group = new ButtonGroup(); // 추가

        i = 0;

        for (String entertainer : entertainers) {
            imageIcons[i] = new ImageIcon("imgs/img" + i + ".png");
            radios[i] = new JRadioButton(entertainer);

            group.add(radios[i]); // 추가
            radios[i].addItemListener(radioListener);

            panNorth.add(radios[i++]);
        }


        lbl.setIcon(imageIcons[0]);
        add("North", panNorth);
        add("Center", lbl);


        int w = 500, h = 500;
        int[] location = CenterFrame.getLocation(w, h);
        setBounds(location[0], location[1], w, h);//setLocation(x,y) + setSize(w,h)
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonTest();
    }

    ItemListener radioListener = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {

            JRadioButton selectRadio = (JRadioButton) e.getSource();

            if (selectRadio == radios[0])
                lbl.setIcon(imageIcons[0]);
            else if (selectRadio == radios[1])
                lbl.setIcon(imageIcons[1]);
            else
                lbl.setIcon(imageIcons[2]);

        }
    };

}