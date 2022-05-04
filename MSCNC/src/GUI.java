import javax.sound.midi.Soundbank;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;

public class GUI {
    private static JLabel label;
    private static JLabel label1;
    private static JLabel label2;
    private static JLabel label3;
    private static JLabel label4;
    private static JLabel label5;
    private static JLabel success;
    private static JTextField userText;
    private static JTextField userText1;
    private static JTextField userText2;
    private static JTextField userText3;
    private static JTextField userText4;
    private static JTextField userText5;
    private static Choice choiceSelect;


    public GUI () throws URISyntaxException {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("主程序生成器 Main Program Generator");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("logo.jpg"));
        frame.setIconImage(img.getImage());

        /*
        label = new JLabel("Start Row");
        label.setBounds(10, 50, 80, 25);
        panel.add(label);

        userText = new JTextField();
        userText.setBounds(100, 50, 165, 25);
        panel.add(userText);

        label1 = new JLabel("Start Column");
        label1.setBounds(10, 80, 80, 25);
        panel.add(label1);

        userText1 = new JTextField();
        userText1.setBounds(100, 80, 165, 25);
        panel.add(userText1);
         */

        label2 = new JLabel("工位 Work");
        label2.setBounds(10, 40, 150, 25);
        panel.add(label2);

        /*
        userText2 = new JTextField();
        userText2.setBounds(180, 40, 165, 25);
        panel.add(userText2);
         */

        choiceSelect = new Choice();
        choiceSelect.add("G54");
        choiceSelect.add("G55");
        choiceSelect.add("G56");
        choiceSelect.add("G57");
        choiceSelect.add("G58");
        choiceSelect.add("G59");
        choiceSelect.add("G54.1P1");
        choiceSelect.add("G54.1P2");
        choiceSelect.add("G54.1P3");
        choiceSelect.add("G54.1P4");
        choiceSelect.add("G54.1P5");
        choiceSelect.add("G54.1P6");
        choiceSelect.add("G54.1P7");
        choiceSelect.add("G54.1P8");
        choiceSelect.add("G54.1P9");
        choiceSelect.add("G54.1P10");
        choiceSelect.add("G54.1P11");
        choiceSelect.add("G54.1P12");
        choiceSelect.add("G54.1P13");
        choiceSelect.add("G54.1P14");
        choiceSelect.add("G54.1P15");
        choiceSelect.add("G54.1P16");
        choiceSelect.add("G54.1P17");
        choiceSelect.add("G54.1P18");
        choiceSelect.add("G54.1P19");
        choiceSelect.add("G54.1P20");
        choiceSelect.add("G54.1P21");
        choiceSelect.add("G54.1P22");
        choiceSelect.add("G54.1P23");
        choiceSelect.add("G54.1P24");
        choiceSelect.add("G54.1P25");
        choiceSelect.add("G54.1P26");
        choiceSelect.add("G54.1P27");
        choiceSelect.add("G54.1P28");
        choiceSelect.add("G54.1P29");
        choiceSelect.add("G54.1P30");
        choiceSelect.setBounds(180,40,165,25);
        panel.add(choiceSelect);

        label3 = new JLabel("刀数/程序 Tool/Program");
        label3.setBounds(10, 10, 150, 25);
        panel.add(label3);

        userText3 = new JTextField();
        userText3.setBounds(180, 10, 165, 25);
        panel.add(userText3);

        label4 = new JLabel("DestName");
        label4.setBounds(10, 70, 150, 25);
        panel.add(label4);

        userText4 = new JTextField();
        userText4.setBounds(180, 70, 165, 25);
        panel.add(userText4);

        /*
        label5 = new JLabel("SourceName");
        label5.setBounds(10, 20, 80, 25);
        panel.add(label5);
         */

        /*
        userText5 = new JTextField();
        userText5.setBounds(100, 20, 165, 25);
        panel.add(userText5);


        JButton chooseSourceFile = new JButton("Choose File");
        chooseSourceFile.setBounds(300,20,120,25);
        ChooseSourceFileListener cSFL = new ChooseSourceFileListener();
        chooseSourceFile.addActionListener(cSFL);
        panel.add(chooseSourceFile);

         */



        JButton chooseFile = new JButton("Choose File");
        chooseFile.setBounds(375,70,120,25);
        ChooseFileListener cFL = new ChooseFileListener();
        chooseFile.addActionListener(cFL);
        panel.add(chooseFile);




        JButton button = new JButton("生成 Generate");
        button.setBounds(180, 110, 165, 35);
        Button listener = new Button();
        button.addActionListener(listener);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 230, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    public static void main(String[] args) throws URISyntaxException {
        new GUI();
    }

    private class ChooseSourceFileListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            jfc.setDialogTitle("Select CSV File");
            jfc.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV File", "csv");
            jfc.addChoosableFileFilter(filter);

            int returnValue = jfc.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                String f = jfc.getSelectedFile().getPath();
                userText5.setText(f);
            }

        }

        }


    private class ChooseFileListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            jfc.setDialogTitle("Choose a directory to save your file: ");
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int returnValue = jfc.showSaveDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                if (jfc.getSelectedFile().isDirectory()) {
                    File f = jfc.getSelectedFile();
                    String s = f.toString();
                    userText4.setText(s);
                }
            }

        }
        }



    private class Button implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            /*
            String startFile = userText5.getText();
            String sR = userText.getText();
            Integer sRI = Integer.parseInt(sR);
            String sC = userText1.getText();
            Integer sCI = Integer.parseInt(sC);
             */
            int indexChoice = choiceSelect.getSelectedIndex() + 1;
            int eRI = 3 + indexChoice * 2;
            String eC = userText3.getText();
            Integer eCI = Integer.parseInt(eC);
            String endFile = userText4.getText();
            Data d = new Data();
            try {
                d.readFile("startFile");
                d.writeFile(1, 1, eRI, eCI, endFile);
                success.setText("Successfully wrote to file");
            } catch (FileNotFoundException a) {
                System.out.println(a);
                success.setText("Please Enter Correct FileName!");
            } catch (IOException b) {
                //System.out.println(b);
                success.setText("Error!");
            }
        }
    }
}




