import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalculatorApp {

    private static JTextField display;
    public static JLabel label;

    public static double num,ans ;
    public static int operation;

    public static void arith_operation(){
        switch (operation){
            case 1:
                ans=num+Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;

            case 2:
                ans=num-Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;

            case 3:
                ans=num*Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;

            case 4:
                ans=num/Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;
        }
    }


    public static void main(String [] argv){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setLocation(500,250);
        frame.setSize(300,400);
        frame.setResizable(false);

        Font font = new Font("Tahoma",Font.BOLD,12);
        Font font2 = new Font("Tahoma",Font.BOLD,20);
        Font font3 = new Font("Tahoma",Font.BOLD,15);
        ImageIcon calc = new ImageIcon("img/img2.png");
        frame.setIconImage(calc.getImage());

        JPanel panel = new JPanel();
        panel.setLayout(null);

        display =new JTextField();
        display.setBounds(10,30,265,38);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(true);
        display.setText("");
        display.setFont(font2);
        panel.add(display);

        label=new JLabel();
        label.setBounds(230,10,40,15);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setText("");
        label.setFont(font);
        panel.add(label);

        JButton myB = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame nFrame = new JFrame();
                nFrame.setTitle("Empty Button");
                nFrame.setLocation(50, 250);
                nFrame.setSize(250, 250);
                nFrame.setResizable(false);
                JPanel nPanel = new JPanel();
                nPanel.setLayout(null);

                JTextArea text = new JTextArea();
                text.setBounds(0, 0, 245, 245);

                text.setEditable(false);
                text.append("Empty Button\nTry to add new Functionality");
                text.setFont(font);
                nPanel.add(text);

                nFrame.add(nPanel);
                nFrame.setVisible(true);
            }
        });
        myB.setBounds(3,85,65,45);
        myB.setText("*_*");
        myB.setFont(font);
        panel.add(myB);

        JButton buttonBS = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = display.getText().length();
                String newStr;

                if (length > 0) {
                    StringBuilder b = new StringBuilder(display.getText());
                    b.deleteCharAt(length - 1);
                    newStr = b.toString();
                    display.setText(newStr);
                }
            }
        });
        buttonBS.setBounds(80,95,60,35);
        buttonBS.setText("<--");
        buttonBS.setFont(font3);
        panel.add(buttonBS);

        JButton buttonC = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                num = 0;
                ans = 0;
                label.setText("");
            }
        });
        buttonC.setBounds(150,95,60,35);
        buttonC.setText("C");
        buttonC.setFont(font3);
        panel.add(buttonC);

        JButton buttonPlus = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(display.getText());
                operation = 1;
                display.setText("");
                label.setText(num + "+");
            }
        });
        buttonPlus.setBounds(220,95,60,35);
        buttonPlus.setText("+");
        buttonPlus.setFont(font3);
        panel.add(buttonPlus);


        JButton b7 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });
        b7.setBounds(5,160,53,33);
        b7.setText("7");
        b7.setFont(font);
        panel.add(b7);

        JButton b8 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });
        b8.setBounds(75,160,53,33);
        b8.setText("8");
        b8.setFont(font);
        panel.add(b8);

        JButton b9 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "9");
            }
        });
        b9.setBounds(145,160,53,33);
        b9.setText("9");
        b9.setFont(font);
        panel.add(b9);

        JButton bMinus = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(display.getText());
                operation = 2;
                display.setText("");
                label.setText(num + "-");
            }
        });
        bMinus.setBounds(220,160,60,33);
        bMinus.setText("-");
        bMinus.setFont(font3);
        panel.add(bMinus);

        JButton b4 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "4");
            }
        });
        b4.setBounds(5,220,53,33);
        b4.setText("4");
        b4.setFont(font);
        panel.add(b4);

        JButton b5 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });
        b5.setBounds(75,220,53,33);
        b5.setText("5");
        b5.setFont(font);
        panel.add(b5);

        JButton b6 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });
        b6.setBounds(145,220,53,33);
        b6.setText("6");
        b6.setFont(font);
        panel.add(b6);

        JButton bMulti = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(display.getText());
                operation = 3;
                display.setText("");
                label.setText(num + "*");
            }
        });
        bMulti.setBounds(220,220,60,33);
        bMulti.setText("*");
        bMulti.setFont(font3);
        panel.add(bMulti);

        JButton b1 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });
        b1.setBounds(5,275,53,33);
        b1.setText("1");
        b1.setFont(font);
        panel.add(b1);

        JButton b2 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "2");
            }
        });
        b2.setBounds(75,275,53,33);
        b2.setText("2");
        b2.setFont(font);
        panel.add(b2);

        JButton b3 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
            }
        });
        b3.setBounds(145,275,53,33);
        b3.setText("3");
        b3.setFont(font);
        panel.add(b3);

        JButton bDiv = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(display.getText());
                operation = 4;
                display.setText("");
                label.setText(num + "/");
            }
        });
        bDiv.setBounds(220,275,60,33);
        bDiv.setText("/");
        bDiv.setFont(font3);
        panel.add(bDiv);

        JButton b0 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
        b0.setBounds(5,325,53,33);
        b0.setText("0");
        b0.setFont(font);
        panel.add(b0);

        JButton bComma = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + ".");
            }
        });
        bComma.setBounds(75,325,53,33);
        bComma.setText(".");
        bComma.setFont(font);
        panel.add(bComma);

        JButton bEqual = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arith_operation();
                label.setText("");
            }
        });
        bEqual.setBounds(145,325,133,33);
        bEqual.setText("=");
        bEqual.setFont(font3);
        panel.add(bEqual);

        frame.add(panel);
        frame.setVisible(true);

    }

}
