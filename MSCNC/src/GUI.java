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
    private static JLabel label2P;
    private static JLabel label3;
    private static JLabel label3P;
    private static JLabel label4;
    private static JLabel label4P;
    private static JLabel label6;
    private static JLabel label6P;
    private static JLabel label5;
    private static JLabel success;
    private static JLabel successP;
    private static JTextField userText;
    private static JTextField userText1;
    private static JTextField userText2;
    private static JTextField userText3;
    private static JTextField userText3P;
    private static JTextField userText4;
    private static JTextField userText4P;
    private static JTextField userText5;
    private static Choice choiceSelect;
    private static Choice choiceSelectEnd;
    private static Choice choiceSelectP;
    private static Choice choiceSelectPEnd;



    public GUI () throws URISyntaxException {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("主程序生成器 Main Program Generator");
        JPanel moreCutterP = new JPanel();
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("一个程序多把刀 One Program More Cutter", moreCutterP);
        tabbedPane.addTab("一个程序一把刀 One Program One Cutter", panel);
        frame.setSize(600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.add(panel);
        frame.add(tabbedPane);

        panel.setLayout(null);
        moreCutterP.setLayout(null);

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

        label2 = new JLabel("工位开始 Work Start");
        label2.setBounds(10, 40, 150, 25);
        panel.add(label2);

        label6 = new JLabel("工位终止 Work End");
        label6.setBounds(10, 70, 150, 25);
        panel.add(label6);

        label2P = new JLabel("工位开始 Work Start");
        label2P.setBounds(10, 40, 150, 25);
        moreCutterP.add(label2P);

        label6P = new JLabel("工位终止 Work End");
        label6P.setBounds(10, 70, 150, 25);
        moreCutterP.add(label6P);

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

        choiceSelectEnd = new Choice();
        choiceSelectEnd.add("G54");
        choiceSelectEnd.add("G55");
        choiceSelectEnd.add("G56");
        choiceSelectEnd.add("G57");
        choiceSelectEnd.add("G58");
        choiceSelectEnd.add("G59");
        choiceSelectEnd.add("G54.1P1");
        choiceSelectEnd.add("G54.1P2");
        choiceSelectEnd.add("G54.1P3");
        choiceSelectEnd.add("G54.1P4");
        choiceSelectEnd.add("G54.1P5");
        choiceSelectEnd.add("G54.1P6");
        choiceSelectEnd.add("G54.1P7");
        choiceSelectEnd.add("G54.1P8");
        choiceSelectEnd.add("G54.1P9");
        choiceSelectEnd.add("G54.1P10");
        choiceSelectEnd.add("G54.1P11");
        choiceSelectEnd.add("G54.1P12");
        choiceSelectEnd.add("G54.1P13");
        choiceSelectEnd.add("G54.1P14");
        choiceSelectEnd.add("G54.1P15");
        choiceSelectEnd.add("G54.1P16");
        choiceSelectEnd.add("G54.1P17");
        choiceSelectEnd.add("G54.1P18");
        choiceSelectEnd.add("G54.1P19");
        choiceSelectEnd.add("G54.1P20");
        choiceSelectEnd.add("G54.1P21");
        choiceSelectEnd.add("G54.1P22");
        choiceSelectEnd.add("G54.1P23");
        choiceSelectEnd.add("G54.1P24");
        choiceSelectEnd.add("G54.1P25");
        choiceSelectEnd.add("G54.1P26");
        choiceSelectEnd.add("G54.1P27");
        choiceSelectEnd.add("G54.1P28");
        choiceSelectEnd.add("G54.1P29");
        choiceSelectEnd.add("G54.1P30");
        choiceSelectEnd.setBounds(180,70,165,25);
        panel.add(choiceSelectEnd);


        choiceSelectP = new Choice();
        choiceSelectP.add("G54");
        choiceSelectP.add("G55");
        choiceSelectP.add("G56");
        choiceSelectP.add("G57");
        choiceSelectP.add("G58");
        choiceSelectP.add("G59");
        choiceSelectP.add("G54.1P1");
        choiceSelectP.add("G54.1P2");
        choiceSelectP.add("G54.1P3");
        choiceSelectP.add("G54.1P4");
        choiceSelectP.add("G54.1P5");
        choiceSelectP.add("G54.1P6");
        choiceSelectP.add("G54.1P7");
        choiceSelectP.add("G54.1P8");
        choiceSelectP.add("G54.1P9");
        choiceSelectP.add("G54.1P10");
        choiceSelectP.add("G54.1P11");
        choiceSelectP.add("G54.1P12");
        choiceSelectP.add("G54.1P13");
        choiceSelectP.add("G54.1P14");
        choiceSelectP.add("G54.1P15");
        choiceSelectP.add("G54.1P16");
        choiceSelectP.add("G54.1P17");
        choiceSelectP.add("G54.1P18");
        choiceSelectP.add("G54.1P19");
        choiceSelectP.add("G54.1P20");
        choiceSelectP.add("G54.1P21");
        choiceSelectP.add("G54.1P22");
        choiceSelectP.add("G54.1P23");
        choiceSelectP.add("G54.1P24");
        choiceSelectP.add("G54.1P25");
        choiceSelectP.add("G54.1P26");
        choiceSelectP.add("G54.1P27");
        choiceSelectP.add("G54.1P28");
        choiceSelectP.add("G54.1P29");
        choiceSelectP.add("G54.1P30");
        choiceSelectP.setBounds(180,40,165,25);
        moreCutterP.add(choiceSelectP);

        choiceSelectPEnd = new Choice();
        choiceSelectPEnd.add("G54");
        choiceSelectPEnd.add("G55");
        choiceSelectPEnd.add("G56");
        choiceSelectPEnd.add("G57");
        choiceSelectPEnd.add("G58");
        choiceSelectPEnd.add("G59");
        choiceSelectPEnd.add("G54.1P1");
        choiceSelectPEnd.add("G54.1P2");
        choiceSelectPEnd.add("G54.1P3");
        choiceSelectPEnd.add("G54.1P4");
        choiceSelectPEnd.add("G54.1P5");
        choiceSelectPEnd.add("G54.1P6");
        choiceSelectPEnd.add("G54.1P7");
        choiceSelectPEnd.add("G54.1P8");
        choiceSelectPEnd.add("G54.1P9");
        choiceSelectPEnd.add("G54.1P10");
        choiceSelectPEnd.add("G54.1P11");
        choiceSelectPEnd.add("G54.1P12");
        choiceSelectPEnd.add("G54.1P13");
        choiceSelectPEnd.add("G54.1P14");
        choiceSelectPEnd.add("G54.1P15");
        choiceSelectPEnd.add("G54.1P16");
        choiceSelectPEnd.add("G54.1P17");
        choiceSelectPEnd.add("G54.1P18");
        choiceSelectPEnd.add("G54.1P19");
        choiceSelectPEnd.add("G54.1P20");
        choiceSelectPEnd.add("G54.1P21");
        choiceSelectPEnd.add("G54.1P22");
        choiceSelectPEnd.add("G54.1P23");
        choiceSelectPEnd.add("G54.1P24");
        choiceSelectPEnd.add("G54.1P25");
        choiceSelectPEnd.add("G54.1P26");
        choiceSelectPEnd.add("G54.1P27");
        choiceSelectPEnd.add("G54.1P28");
        choiceSelectPEnd.add("G54.1P29");
        choiceSelectPEnd.add("G54.1P30");
        choiceSelectPEnd.setBounds(180,70,165,25);
        moreCutterP.add(choiceSelectPEnd);


        label3 = new JLabel("程序数量 Program Qty");
        label3.setBounds(10, 10, 150, 25);
        panel.add(label3);

        label3P = new JLabel("程序数量 Program Qty");
        label3P.setBounds(10, 10, 150, 25);
        moreCutterP.add(label3P);

        userText3 = new JTextField();
        userText3.setBounds(180, 10, 165, 25);
        panel.add(userText3);

        userText3P = new JTextField();
        userText3P.setBounds(180, 10, 165, 25);
        moreCutterP.add(userText3P);

        label4 = new JLabel("存放位置 DestName");
        label4.setBounds(10, 100, 150, 25);
        panel.add(label4);

        label4P = new JLabel("存放位置 DestName");
        label4P.setBounds(10, 100, 150, 25);
        moreCutterP.add(label4P);

        userText4 = new JTextField();
        userText4.setBounds(180, 100, 165, 25);
        panel.add(userText4);

        userText4P = new JTextField();
        userText4P.setBounds(180, 100, 165, 25);
        moreCutterP.add(userText4P);

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



        JButton chooseFile = new JButton("选择文件 Choose File");
        chooseFile.setBounds(375,100,150,25);
        ChooseFileListener cFL = new ChooseFileListener();
        chooseFile.addActionListener(cFL);
        panel.add(chooseFile);

        JButton chooseFileP = new JButton("选择文件 Choose File");
        chooseFileP.setBounds(375,100,150,25);
        ChooseFileListener cFLP = new ChooseFileListener();
        chooseFileP.addActionListener(cFLP);
        moreCutterP.add(chooseFileP);




        JButton button = new JButton("生成 Generate");
        button.setBounds(180, 140, 165, 35);
        Button listener = new Button();
        button.addActionListener(listener);
        panel.add(button);

        JButton buttonP = new JButton("生成 Generate");
        buttonP.setBounds(180, 140, 165, 35);
        ButtonP listenerP = new ButtonP();
        buttonP.addActionListener(listenerP);
        moreCutterP.add(buttonP);

        success = new JLabel("");
        success.setBounds(10, 220, 300, 25);
        panel.add(success);

        successP = new JLabel("");
        successP.setBounds(10, 220, 300, 25);
        moreCutterP.add(successP);

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
                    userText4P.setText(s);
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
            int indexChoice = choiceSelectEnd.getSelectedIndex() + 1;
            int indexChoiceStart = choiceSelect.getSelectedIndex();
            int sRI = indexChoiceStart * 2 + 3;
            int eRI = 3 + indexChoice * 2;
            String eC = userText3.getText();
            Integer eCI = Integer.parseInt(eC);
            String endFile = userText4.getText();
            File file = new File(endFile + "\\One Cutter.txt");
            Data d = new Data();
            try {
                d.readFile("startFile");
                d.writeFile(sRI, 1, eRI, eCI, endFile);
                Desktop desktop = Desktop.getDesktop();
                if (file.exists()) {
                    desktop.open(file);
                }
                success.setText("成功生成 Successfully wrote to file");
            } catch (FileNotFoundException a) {
                System.out.println(a);
                success.setText("Please Enter Correct FileName!");
            } catch (IOException b) {
                //System.out.println(b);
                success.setText("Error!");
            }
        }
    }

        private class ButtonP implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
            /*
            String startFile = userText5.getText();
            String sR = userText.getText();
            Integer sRI = Integer.parseInt(sR);
            String sC = userText1.getText();
            Integer sCI = Integer.parseInt(sC);
             */
                int indexChoice = choiceSelectPEnd.getSelectedIndex() + 1;
                int indexChoiceStart = choiceSelectP.getSelectedIndex() + 1;
                int sRI = indexChoiceStart;
                int eRI = indexChoice;
                String eC = userText3P.getText();
                Integer eCI = Integer.parseInt(eC) + 1;
                String endFile = userText4P.getText();
                File file = new File(endFile + "\\More Cutter.txt");
                MoreCutter d = new MoreCutter();
                try {
                    d.readFile("startFile");
                    d.writeFile(1, sRI, eCI, eRI, endFile);
                    Desktop desktop = Desktop.getDesktop();
                    if (file.exists()) {
                        desktop.open(file);
                    }
                    successP.setText("成功生成 Successfully wrote to file");
                } catch (FileNotFoundException a) {
                    System.out.println(a);
                    successP.setText("Please Enter Correct FileName!");
                } catch (IOException b) {
                    //System.out.println(b);
                    successP.setText("Error!");
                }
            }
    }
}




