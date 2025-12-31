import java.awt.*;
import java.awt.event.*;

public class My_Calculator implements WindowListener, ActionListener{
    public int check;
    public double number;
    public String s3,s4,s5;
    public Frame fra;
    public Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bequal, bclear;
    public Panel p;
    public TextField tf;
    My_Calculator(){
        fra = new Frame("Calculator");
        p = new Panel();
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        badd = new Button("+");
        bsub = new Button("-");
        bmul = new Button("*");
        bdiv = new Button("/");
        bequal = new Button("=");
        bclear = new Button("Clear");
    }

    public void launchframe(){
        fra.setSize(200,180);
        fra.setVisible(true);
        fra.setBackground(Color.WHITE);
        fra.addWindowListener(this);
        fra.setLayout(new FlowLayout());
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bequal.addActionListener(this);
        bclear.addActionListener(this);
        tf = new TextField(10);
        fra.add(tf);
        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(badd);
        p.add(bsub);
        p.add(bmul);
        p.add(bdiv);
        p.add(bequal);
        p.add(bclear);
        p.setLayout(new GridLayout(6,4));
        fra.add(p);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b0){
            s3 = "0";
            tf.setText(s3);
        }
        if(e.getSource()==b1){
            s3 = "1";
            tf.setText(s3);
        }
        if(e.getSource()==b2){
            s3 = "2";
            tf.setText(s3);
        }
        if(e.getSource()==b3){
            s3 = "3";
            tf.setText(s3);
        }
        if(e.getSource()==b4){
            s3 = "4";
            tf.setText(s3);
        }
        if(e.getSource()==b5){
            s3 = "5";
            tf.setText(s3);
        }
        if(e.getSource()==b6){
            s3 = "6";
            tf.setText(s3);
        }
        if(e.getSource()==b7){
            s3 = "7";
            tf.setText(s3);
        }
        if(e.getSource()==b8){
            s3 = "8";
            tf.setText(s3);
        }
        if(e.getSource()==b9){
            s3 = "9";
            tf.setText(s3);
        }
        if(e.getSource()==badd){
            s4 = tf.getText();
            tf.setText("");
            check = 1;
        }
        if(e.getSource()==bsub){
            s4 = tf.getText();
            tf.setText("");
            check = 2;
        }
        if(e.getSource()==bmul){
            s4 = tf.getText();
            tf.setText("");
            check = 3;
        }
        if(e.getSource()==bdiv){
            s4 = tf.getText();
            tf.setText("");
            check = 4;
        }

        if(e.getSource()==bequal){
            s5 = tf.getText();
            if(check==1){
                number = Double.parseDouble(s4) + Double.parseDouble(s5);
                String.valueOf(number);
                tf.setText(s4 +"+" +s5 +"=" +number);
            }
            if(check==2){
                number = Double.parseDouble(s4) - Double.parseDouble(s5);
                String.valueOf(number);
                tf.setText(s4 +"-" +s5 +"=" +number);

            }
            if(check==3){
                number = Double.parseDouble(s4) * Double.parseDouble(s5);
                String.valueOf(number);
                tf.setText(s4 +"*" +s5 +"=" +number);
            }
            if(check==4){
                number = Double.parseDouble(s4) / Double.parseDouble(s5);
                String.valueOf(number);
                tf.setText(s4 +"/" +s5 +"=" +number);
            }
        }
        if(e.getSource()==bclear){
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        My_Calculator cal = new My_Calculator();
        cal.launchframe();
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    public void windowOpened(WindowEvent e) {

    }
    public void windowClosed(WindowEvent e) {

    }
    public void windowIconified(WindowEvent e) {

    }
    public void windowDeiconified(WindowEvent e) {

    }
    public void windowActivated(WindowEvent e) {

    }
    public void windowDeactivated(WindowEvent e) {

    }
}