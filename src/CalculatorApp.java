import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalculatorApp {

    private static JFrame frame;
    private static JPanel panel;
    private static JTextField display;
    private static JButton myB,buttonBS,buttonC,buttonPlus;
    private static JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15;
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
        frame=new JFrame();
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

        panel=new JPanel();
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

        myB=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame nFrame=new JFrame();
                nFrame.setTitle("Empty Button");
                nFrame.setLocation(50,250);
                nFrame.setSize(250,250);
                nFrame.setResizable(false);
                JPanel nPanel=new JPanel();
                nPanel.setLayout(null);

                JTextField text =new JTextField();
                text.setBounds(0,0,245,245);
                text.setHorizontalAlignment(SwingConstants.CENTER);
                text.setEditable(false);
                text.setText("Empty Button\nTry to add new Functionality");
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

        buttonBS=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = display.getText().length();
                String newStr;

                if(length>0){
                    StringBuilder b=new StringBuilder(display.getText());
                    b.deleteCharAt(length-1);
                    newStr=b.toString();
                    display.setText(newStr);
                }
            }
        });
        buttonBS.setBounds(80,95,58,35);
        buttonBS.setText("<--");
        buttonBS.setFont(font3);
        panel.add(buttonBS);

        buttonC=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                num=0;
                ans=0;
                label.setText("");
            }
        });
        buttonC.setBounds(150,95,58,35);
        buttonC.setText("C");
        buttonC.setFont(font3);
        panel.add(buttonC);

        buttonPlus=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(display.getText());
                operation=1;
                display.setText("");
                label.setText(num+"+");
            }
        });
        buttonPlus.setBounds(220,95,58,35);
        buttonPlus.setText("+");
        buttonPlus.setFont(font3);
        panel.add(buttonPlus);


        B1=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"7");
            }
        });
        B1.setBounds(5,160,53,33);
        B1.setText("7");
        B1.setFont(font);
        panel.add(B1);

        B2=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"8");
            }
        });
        B2.setBounds(75,160,53,33);
        B2.setText("8");
        B2.setFont(font);
        panel.add(B2);

        B3=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"9");
            }
        });
        B3.setBounds(145,160,53,33);
        B3.setText("9");
        B3.setFont(font);
        panel.add(B3);

        B4=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(display.getText());
                operation=2;
                display.setText("");
                label.setText(num+"-");
            }
        });
        B4.setBounds(220,160,58,33);
        B4.setText("-");
        B4.setFont(font3);
        panel.add(B4);

        B5=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"4");
            }
        });
        B5.setBounds(5,220,53,33);
        B5.setText("4");
        B5.setFont(font);
        panel.add(B5);

        B6=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"5");
            }
        });
        B6.setBounds(75,220,53,33);
        B6.setText("5");
        B6.setFont(font);
        panel.add(B6);

        B7=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"6");
            }
        });
        B7.setBounds(145,220,53,33);
        B7.setText("6");
        B7.setFont(font);
        panel.add(B7);

        B8=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(display.getText());
                operation=3;
                display.setText("");
                label.setText(num+"*");
            }
        });
        B8.setBounds(220,220,58,33);
        B8.setText("*");
        B8.setFont(font3);
        panel.add(B8);

        B9=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"1");
            }
        });
        B9.setBounds(5,275,53,33);
        B9.setText("1");
        B9.setFont(font);
        panel.add(B9);

        B10=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"2");
            }
        });
        B10.setBounds(75,275,53,33);
        B10.setText("2");
        B10.setFont(font);
        panel.add(B10);

        B11=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"3");
            }
        });
        B11.setBounds(145,275,53,33);
        B11.setText("3");
        B11.setFont(font);
        panel.add(B11);

        B12=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(display.getText());
                operation=4;
                display.setText("");
                label.setText(num+"/");
            }
        });
        B12.setBounds(220,275,58,33);
        B12.setText("/");
        B12.setFont(font3);
        panel.add(B12);

        B13=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"0");
            }
        });
        B13.setBounds(5,325,53,33);
        B13.setText("0");
        B13.setFont(font);
        panel.add(B13);

        B14=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+".");
            }
        });
        B14.setBounds(75,325,53,33);
        B14.setText(".");
        B14.setFont(font);
        panel.add(B14);

        B15=new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arith_operation();
                label.setText("");
            }
        });
        B15.setBounds(145,325,133,33);
        B15.setText("=");
        B15.setFont(font3);
        panel.add(B15);

        frame.add(panel);
        frame.setVisible(true);

    }

}
