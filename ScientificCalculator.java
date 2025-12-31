import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ScientificCalculator extends JFrame implements ActionListener {
    JTextField tf;
    double num1, num2, result, func;
    int  x = 1,check;
    JButton butt0,butt1, butt2, butt3, butt4, butt5, butt6, butt7, butt8, butt9, clr, pow2, pow3, exp,
            fac, butt_plus, butt_min, butt_div, log, rec, butt_mul, eq, dot,
            butt_sqrt, butt_sin, butt_cos, butt_tan;
    Container container;
    JPanel tp, bp;

    public ScientificCalculator() {
        setTitle("ScientificCalculator");
        container = getContentPane();
        container.setLayout(new BorderLayout());
        tp = new JPanel();
        tf = new JTextField(20);
        tp.add(tf);
        bp = new JPanel();
        bp.setLayout(new GridLayout(8, 4, 2, 2));
        butt0 = new JButton("0");
        bp.add(butt0);
        butt0.addActionListener(this);
        butt1 = new JButton("1");
        bp.add(butt1);
        butt1.addActionListener(this);
        butt2 = new JButton("2");
        bp.add(butt2);
        butt2.addActionListener(this);
        butt3 = new JButton("3");
        bp.add(butt3);
        butt3.addActionListener(this);
        butt4 = new JButton("4");
        bp.add(butt4);
        butt4.addActionListener(this);
        butt5 = new JButton("5");
        bp.add(butt5);
        butt5.addActionListener(this);
        butt6 = new JButton("6");
        bp.add(butt6);
        butt6.addActionListener(this);
        butt7 = new JButton("7");
        bp.add(butt7);
        butt7.addActionListener(this);
        butt8 = new JButton("8");
        bp.add(butt8);
        butt8.addActionListener(this);
        butt9 = new JButton("9");
        bp.add(butt9);
        butt9.addActionListener(this);
        butt_plus = new JButton("+");
        bp.add(butt_plus);
        butt_plus.addActionListener(this);
        butt_min = new JButton("-");
        bp.add(butt_min);
        butt_min.addActionListener(this);
        butt_mul = new JButton("*");
        bp.add(butt_mul);
        butt_mul.addActionListener(this);
        butt_div = new JButton("/");
        butt_div.addActionListener(this);
        bp.add(butt_div);
        dot = new JButton(".");
        bp.add(dot);
        dot.addActionListener(this);
        eq = new JButton("=");
        bp.add(eq);
        eq.addActionListener(this);
        rec = new JButton("1/x");
        bp.add(rec);
        rec.addActionListener(this);
        butt_sqrt = new JButton("Sqrt");
        bp.add(butt_sqrt);
        butt_sqrt.addActionListener(this);
        log = new JButton("log");
        bp.add(log);
        log.addActionListener(this);
        butt_sin = new JButton("SIN");
        bp.add(butt_sin);
        butt_sin.addActionListener(this);
        butt_cos = new JButton("COS");
        bp.add(butt_cos);
        butt_cos.addActionListener(this);
        butt_tan = new JButton("TAN");
        bp.add(butt_tan);
        butt_tan.addActionListener(this);
        pow2 = new JButton("x^2");
        bp.add(pow2);
        pow2.addActionListener(this);
        pow3 = new JButton("x^3");
        bp.add(pow3);
        pow3.addActionListener(this);
        exp = new JButton("Exp");
        exp.addActionListener(this);
        bp.add(exp);
        fac = new JButton("n!");
        fac.addActionListener(this);
        bp.add(fac);
        clr = new JButton("CLR");
        bp.add(clr);
        clr.addActionListener(this);
        container.add("Center", bp);
        container.add("North", tp);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==butt0) {
            if (x == 0) {
                tf.setText(tf.getText() + "0");
            } else {
                tf.setText("0");
                x = 0;
            }
        }
        if (e.getSource()==butt1) {
            if (x == 0) {
                tf.setText(tf.getText() + "1");
            } else {
                tf.setText("1");
                x = 0;
            }
        }
        if (e.getSource()==butt2) {
            if (x == 0) {
                tf.setText(tf.getText() + "2");
            } else {
                tf.setText("2");
                x = 0;
            }
        }
        if (e.getSource()==butt3) {
            if (x == 0) {
                tf.setText(tf.getText() + "3");
            } else {
                tf.setText("3");
                x = 0;
            }
        }
        if (e.getSource()==butt4) {
            if (x == 0) {
                tf.setText(tf.getText() + "4");
            } else {
                tf.setText("4");
                x = 0;
            }
        }
        if (e.getSource()==butt5) {
            if (x == 0) {
                tf.setText(tf.getText() + "5");
            } else {
                tf.setText("5");
                x = 0;
            }
        }
        if (e.getSource()==butt6) {
            if (x == 0) {
                tf.setText(tf.getText() + "6");
            } else {
                tf.setText("6");
                x = 0;
            }
        }
        if (e.getSource()==butt7) {
            if (x == 0) {
                tf.setText(tf.getText() + "7");
            } else {
                tf.setText("7");
                x = 0;
            }
        }
        if (e.getSource()==butt8) {
            if (x == 0) {
                tf.setText(tf.getText() + "8");
            } else {
                tf.setText("8");
                x = 0;
            }
        }
        if (e.getSource()==butt9) {
            if (x == 0) {
                tf.setText(tf.getText() + "9");
            } else {
                tf.setText("9");
                x = 0;
            }
        }

        if (e.getSource()==clr) {
            tf.setText("");
        }
        if (e.getSource()==log) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                func = Math.log(Double.parseDouble(tf.getText()));
                tf.setText(String.valueOf(func));
            }
        }
        if (e.getSource()==rec) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                func = 1 / Double.parseDouble(tf.getText());
                tf.setText(String.valueOf(func));
            }
        }
        if (e.getSource()==exp) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                func = Math.exp(Double.parseDouble(tf.getText()));
                tf.setText(String.valueOf(func));
            }
        }
        if (e.getSource()==pow2) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                func = Math.pow(Double.parseDouble(tf.getText()), 2);
                tf.setText(String.valueOf(func));
            }
        }
        if (e.getSource()==pow3) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                func = Math.pow(Double.parseDouble(tf.getText()), 3);
                tf.setText(String.valueOf(func));
            }
        }
        if (e.getSource()==dot) {
                tf.setText(tf.getText() + ".");
        }
        if (e.getSource()==butt_plus) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                num1 = Double.parseDouble(tf.getText());
                tf.setText("");
                check=1;
            }
        }
        if (e.getSource()==butt_min) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");

            } else {
                num1 = Double.parseDouble(tf.getText());
                tf.setText("");
                check=2;
            }
        }
        if (e.getSource()==butt_mul) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                num1 = Double.parseDouble(tf.getText());
                tf.setText("");
                check=3;
            }
        }
        if (e.getSource()==butt_div) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                num1 = Double.parseDouble(tf.getText());
                tf.setText("");
                check=4;
            }
        }

        if (e.getSource()==butt_sqrt) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                func = Math.sqrt(Double.parseDouble(tf.getText()));
                tf.setText(String.valueOf(func));
            }
        }
        if (e.getSource()==butt_sin) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                func = Math.sin(Double.parseDouble(tf.getText()));
                tf.setText(String.valueOf(func));
            }
        }
        if (e.getSource()==butt_cos) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                func = Math.cos(Double.parseDouble(tf.getText()));
                tf.setText(String.valueOf(func));
            }
        }
        if (e.getSource()==butt_tan) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                func = Math.tan(Double.parseDouble(tf.getText()));
                tf.setText(String.valueOf(func));
            }
        }
        if (e.getSource()==eq) {
            if (tf.getText().equals("")) {
                tf.setText("Please Enter Input");
            } else {
                num2 = Double.parseDouble(tf.getText());
                if(check==1){
                    result = num1 + num2;
                }
                else if(check==2){
                    result = num1 - num2;
                }
                else if(check==3){
                    result = num1 * num2;
                }
                else if(check==4){
                    result = num1 / num2;
                }
                tf.setText(String.valueOf(result));
            }
        }
        if (e.getSource()==fac) {
            if (tf.getText().equals("")) {
                tf.setText("");
            } else {
                func = factorialFinding(Double.parseDouble(tf.getText()));
                tf.setText(String.valueOf(func));
            }
        }
    }

    double factorialFinding(double n) {
        if (n < 0) {
            return 0;
        }
        else {
            double i, facto = 1;
            for (i = 1; i <= n; i = i + 1.0) {
                facto = facto * i;
            }
            return facto;
        }
    }

    public static void main(String args[]) {
        ScientificCalculator f = new ScientificCalculator();
    }
}