
package ai1013;

import center.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelJButtonimageTest extends JFrame {

    boolean flag = true;

    public JLabelJButtonimageTest() {
        setTitle("ImageIcon설정 컴포넌트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon btnIcon = new ImageIcon("imgs/dog.icon.png");
        JButton btn = new JButton("Click Here~", btnIcon);

        ImageIcon lblIcon = new ImageIcon("imgs/dog2.icon.jpeg");
        JLabel lbl = new JLabel();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag) {
                    lbl.setIcon(lblIcon);
                    flag = false;
                } else {
                    lbl.setIcon(new ImageIcon());
                    flag =true;
                }

                flag = !flag;
            }
        });

        add("North", btn);
        add("Center", lbl);

        int w = 250, h = 250;
        int[] locations = CenterFrame.getLocation(w, h);

        setBounds(locations[0], locations[1], w, h);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelJButtonimageTest();
    }
}
