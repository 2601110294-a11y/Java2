
package ai1013;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoximageTest extends JFrame {

    JLabel lbl = new JLabel();

    public ComboBoximageTest() {
        setTitle("문자열 입력 컴포넌트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] items = {"강아지", "고양이", "토끼", "미어캣", "코알라"};
        JComboBox comboBox = new JComboBox(items);

        comboBox.addItemListener(comboListener);

        add(comboBox);
        add(lbl);

        int w = 350, h = 350;
        int[] locations = CenterFrame.getLocation(w, h);
        setBounds(locations[0], locations[1], w, h);
        setVisible(true);
    }

    ItemListener comboListener = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {

            if (e.getStateChange() == ItemEvent.SELECTED) {

                ImageIcon icon = null;
                String selectedItem = (String) e.getItem();

                switch (selectedItem) {
                    case "강아지":
                        icon = new ImageIcon("imgs/dog2.icon.jpeg");
                        break;

                    case "고양이":
                        icon = new ImageIcon("imgs/cat.jpeg");
                        break;

                    case "토끼":
                        icon = new ImageIcon("imgs/rabbit.jpeg");
                        break;

                    case "미어캣":
                        icon = new ImageIcon("imgs/cat2.jpeg");
                        break;

                    case "코알라":
                        icon = new ImageIcon("imgs/animal.jpeg");
                        break;
                }
               

                lbl.setIcon(icon);
            }
        }
    };

    public static void main(String[] args) {
        new ComboBoximageTest();
    }
}
