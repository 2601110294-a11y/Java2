
package ai1103;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MenuTest extends JFrame {
    JTextArea textArea = new JTextArea();
    JFileChooser fileChooser = new JFileChooser();

    String[] iconFileNames = {"first", "new", "second"};
    Color[] colorNames = {Color.WHITE, Color.BLUE, Color.MAGENTA};
    JButton[] btns = new JButton[6];

    public MenuTest() {
        JScrollPane scrollPane = new JScrollPane(
                textArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        JToolBar toolBar = new JToolBar();
        add("North", toolBar);

        String[] commands = {
                "New", "Open", "Close",
                "White", "Blue", "Magenta"
        };

        for (int i = 0; i < btns.length; i++) {
            if (i < 3) {
                btns[i] = new JButton(
                        new ImageIcon("toolbar/" + iconFileNames[i] + ".png"));
                btns[i].addActionListener(fileListener);
            } else {
                btns[i] = new JButton("");
                btns[i].setBackground(colorNames[i - 3]);
                btns[i].setOpaque(true);
                btns[i].addActionListener(backgroundListener);
            }

            btns[i].setActionCommand(commands[i]);

            btns[i].setPreferredSize(new Dimension(50, 50));
            btns[i].setMinimumSize(new Dimension(50, 50));
            btns[i].setMaximumSize(new Dimension(50, 50));

            toolBar.add(btns[i]);
        }

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save"); // 추가
        JMenuItem closeMenuItem = new JMenuItem("Close");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem); // 추가
        fileMenu.add(closeMenuItem);

        JMenuItem whiteMenuItem = new JMenuItem("White");
        JMenuItem blueMenuItem = new JMenuItem("Blue");
        JMenuItem magentaMenuItem = new JMenuItem("Magenta");

        editMenu.add(whiteMenuItem);
        editMenu.add(blueMenuItem);
        editMenu.add(magentaMenuItem);

        newMenuItem.addActionListener(fileListener);
        openMenuItem.addActionListener(fileListener);
        saveMenuItem.addActionListener(fileListener); // 추가
        closeMenuItem.addActionListener(fileListener);

        whiteMenuItem.addActionListener(backgroundListener);
        blueMenuItem.addActionListener(backgroundListener);
        magentaMenuItem.addActionListener(backgroundListener);

        SetFrame.setFrame(this, "메뉴만들기", 500, 500);
    }

    ActionListener fileListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            File selectedFile;

            switch (e.getActionCommand()) {
                case "New":
                    textArea.setText("");
                    break;

                case "Open":
                    if (fileChooser.showOpenDialog(MenuTest.this)
                            == JFileChooser.APPROVE_OPTION) {
                        selectedFile = fileChooser.getSelectedFile();
                        textArea.setText(readFile(selectedFile));
                    }
                    break;

                // Save 기능 추가
                case "Save":
                    if (fileChooser.showSaveDialog(MenuTest.this)
                            == JFileChooser.APPROVE_OPTION) {
                        selectedFile = fileChooser.getSelectedFile();
                        saveFile(selectedFile);
                    }
                    break;

                case "Close":
                    System.exit(0);
                    break;
            }
        }
    };

    ActionListener backgroundListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Color color = null;

            switch (e.getActionCommand()) {
                case "White":
                    color = Color.WHITE;
                    break;
                case "Blue":
                    color = Color.BLUE;
                    break;
                case "Magenta":
                    color = Color.MAGENTA;
                    break;
            }

            textArea.setBackground(color);
        }
    };

    public String readFile(File selectedFile) {
        String totalLines = "";

        try {
            String line = "";
            FileReader fr = new FileReader(selectedFile);
            BufferedReader br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                totalLines += line + "\n";
            }

            br.close();

        } catch (FileNotFoundException e) {
            return "File not found";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return totalLines;
    }

    // Save 파일 저장 기능 추가
    public void saveFile(File selectedFile) {
        try {
            FileWriter fw = new FileWriter(selectedFile);
            fw.write(textArea.getText());
            fw.close();

            JOptionPane.showMessageDialog(this, "파일 저장 완료");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "파일 저장 실패");
        }
    }

    public static void main(String[] args) {
        new MenuTest();
    }
}
