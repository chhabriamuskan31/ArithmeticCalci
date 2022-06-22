import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
class Calculator extends JFrame implements ActionListener
{

	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bclear,bdelete,bequal,bplus,bminus,bmultiply,bdivide,bsquare,breciprocal,bsqrt;
	JRadioButton r1,r2;
	JTextField t;
	JLabel label = new JLabel();
	//String s1,s2,s3,s4;
	int calculation;
	double number,answer;
    JFrame frame;//Creating object of JFrame class
	Calculator()//Creating constructor of the class
    {
		//JLabel label = new JLabel();
        b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		bdot=new JButton(".");
		bclear = new JButton("C");
        bdelete = new JButton("DEL");
		bequal = new JButton("=");
		bmultiply = new JButton("x");
		bdivide = new JButton("/");
		bplus = new JButton("+");
		bminus = new JButton("-");
		bsquare = new JButton("x2");
		breciprocal = new JButton("1/x");
		bsqrt = new JButton("Sqrt");
		r1 = new JRadioButton("ON");
		r2 = new JRadioButton("OFF");
		t=new JTextField("");
		
		
		r1.setBounds(10, 95, 60, 40);
		r2.setBounds(10, 120, 60, 40);
		b0.setBounds(10, 410, 130, 40);
		b1.setBounds(10, 350, 60, 40);
		b2.setBounds(80, 350, 60, 40);
		b3.setBounds(150, 350, 60, 40);
		b4.setBounds(10, 290, 60, 40);
		b5.setBounds(80, 290, 60, 40);
		b6.setBounds(150, 290, 60, 40);
		b7.setBounds(10, 230, 60, 40);
		b8.setBounds(80, 230, 60, 40);
		b9.setBounds(150, 230, 60, 40);
		bdot.setBounds(150, 410, 60, 40);
		bclear.setBounds(80, 110, 60, 40);
		bdelete.setBounds(150, 110, 60, 40);
		bequal.setBounds(220, 350, 60, 100);
		bmultiply.setBounds(220, 230, 60, 40);
		bdivide.setBounds(220, 110, 60, 40);
		bplus.setBounds(220, 290, 60, 40);
		bminus.setBounds(220, 170, 60, 40);
		bsquare.setBounds(80, 170, 60, 40);
		breciprocal.setBounds(150, 170, 60, 40);
		bsqrt.setBounds(10, 170, 60, 40);
		
		
		t.setBounds(10, 40, 270, 40);
		label.setBounds(250, 0, 50, 50);
		
		label.setForeground(Color.white);
		add(label);
		
		t.setFont(new Font("Arial", Font.BOLD, 20));
        t.setEditable(false);
		t.setHorizontalAlignment(SwingConstants.RIGHT);
        add(t);
		
		r1.setSelected(true);
        r1.setFont(new Font("Arial", Font.BOLD, 14));
        r1.setBackground(Color.black);
        r1.setForeground(Color.white);
        add(r1);
		
		r2.setSelected(false);
        r2.setFont(new Font("Arial", Font.BOLD, 14));
        r2.setBackground(Color.black);
        r2.setForeground(Color.white);
        add(r2);
		
		//Creating an object of button group and
           //adding both the radio buttons to that button group
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
		
		b7.setFont(new Font("Arial", Font.BOLD, 20));
        add(b7);
		
		b8.setFont(new Font("Arial", Font.BOLD, 20));
        add(b8);
		
		b9.setFont(new Font("Arial", Font.BOLD, 20));
        add(b9);
		
		b4.setFont(new Font("Arial", Font.BOLD, 20));
        add(b4);
		
		b5.setFont(new Font("Arial", Font.BOLD, 20));
        add(b5);
		
		b6.setFont(new Font("Arial", Font.BOLD, 20));
        add(b6);
		
		b1.setFont(new Font("Arial", Font.BOLD, 20));
        add(b1);
		
		b2.setFont(new Font("Arial", Font.BOLD, 20));
        add(b2);
		
		b3.setFont(new Font("Arial", Font.BOLD, 20));
        add(b3);
		
		b0.setFont(new Font("Arial", Font.BOLD, 20));
        add(b0);
		
		bdot.setFont(new Font("Arial", Font.BOLD, 20));
        add(bdot);
		
		bequal.setFont(new Font("Arial", Font.BOLD, 20));
        bequal.setBackground(new Color(239, 188, 2));
        add(bequal);
		
		bdivide.setFont(new Font("Arial", Font.BOLD, 20));
        bdivide.setBackground(new Color(239, 188, 2));
        add(bdivide);
		
		bsqrt.setFont(new Font("Arial", Font.BOLD, 18));
        add(bsqrt);
		
		bmultiply.setFont(new Font("Arial", Font.BOLD, 20));
        bmultiply.setBackground(new Color(239, 188, 2));
        add(bmultiply);
		
		bminus.setFont(new Font("Arial", Font.BOLD, 20));
        bminus.setBackground(new Color(239, 188, 2));
        add(bminus);
		
		bplus.setFont(new Font("Arial", Font.BOLD, 20));
        bplus.setBackground(new Color(239, 188, 2));
        add(bplus);
		
		bsquare.setFont(new Font("Arial", Font.BOLD, 20));
        add(bsquare);
		
		breciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        add(breciprocal);
		
		bdelete.setFont(new Font("Arial", Font.BOLD, 12));
        bdelete.setBackground(Color.red);
        bdelete.setForeground(Color.white);
        add(bdelete);
		
		bclear.setFont(new Font("Arial", Font.BOLD, 12));
        bclear.setBackground(Color.red);
        bclear.setForeground(Color.white);
        add(bclear);
		
		//Registering ActionListener to buttons
		r1.addActionListener(this);
        r2.addActionListener(this);
        bclear.addActionListener(this);
        bdelete.addActionListener(this);
        bdivide.addActionListener(this);
        bsqrt.addActionListener(this);
        bsquare.addActionListener(this);
        breciprocal.addActionListener(this);
        bminus.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bmultiply.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bplus.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bequal.addActionListener(this);
        b0.addActionListener(this);
        bdot.addActionListener(this);
			
    }
	
	
	public void actionPerformed(ActionEvent e)
	{
		//Object source = e.getSource();
        if (e.getSource()==r1) {
            enable();//Calling enable() function
        } else if (e.getSource()==r2) {
            disable();//Calling disable function
        } else if (e.getSource()==bclear) {
            //Clearing texts of label and text field
            label.setText("");
            t.setText("");
        } else if (e.getSource()==bdelete) {
            //Setting functionality for delete button(backspace)
            int length = t.getText().length();
            int number = length - 1;
 
 
            if (length > 0) {
                StringBuilder back = new StringBuilder(t.getText());
                back.deleteCharAt(number);
                t.setText(back.toString());
 
            }
            if (t.getText().endsWith("")) {
                label.setText("");
            }
        } else if (e.getSource()==b0) {
            if (t.getText().equals("0")) {
                return;
            } else {
                t.setText(t.getText() + "0");
            }
        } else if (e.getSource()==b1) {
            t.setText(t.getText() + "1");
        } else if (e.getSource()==b2) {
            t.setText(t.getText() + "2");
        } else if (e.getSource()==b3) {
            t.setText(t.getText() + "3");
        } else if (e.getSource()==b4) {
            t.setText(t.getText() + "4");
        } else if (e.getSource()==b5) {
            t.setText(t.getText() + "5");
        } else if (e.getSource()==b6) {
            t.setText(t.getText() + "6");
        } else if (e.getSource()==b7) {
            t.setText(t.getText() + "7");
        } else if (e.getSource()==b8) {
            t.setText(t.getText() + "8");
        } else if (e.getSource()==b9) {
            t.setText(t.getText() + "9");
        } else if (e.getSource()==bdot) {
            if (t.getText().contains(".")) {
                return;
            } else {
                t.setText(t.getText() + ".");
            }
 
        } else if (e.getSource()==bplus) {
            String str = t.getText();
            number = Double.parseDouble(t.getText());
            t.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (e.getSource()==bminus) {
            String str = t.getText();
            number = Double.parseDouble(t.getText());
            t.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (e.getSource()==bmultiply) {
            String str = t.getText();
            number = Double.parseDouble(t.getText());
            t.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (e.getSource()==bdivide) {
            String str = t.getText();
            number = Double.parseDouble(t.getText());
            t.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (e.getSource()==bsqrt) {
            number = Double.parseDouble(t.getText());
            Double sqrt = Math.sqrt(number);
            t.setText(Double.toString(sqrt));
 
        } else if (e.getSource()==bsquare) {
            String str = t.getText();
            number = Double.parseDouble(t.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                t.setText(string.replace(".0", ""));
            } else {
                t.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (e.getSource() == breciprocal) {
			String str = t.getText();
            number = Double.parseDouble(t.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                t.setText(string.replace(".0", ""));
            } else {
                t.setText(string);
            }
        } else if (e.getSource()==bequal) {
           //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(t.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        t.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        t.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(t.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        t.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        t.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(t.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        t.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        t.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(t.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        t.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        t.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
 
            }
        }
	}
	/*public class void enable() {
    r1.setEnabled(false);
    r2.setEnabled(true);
    t.setEnabled(true);
    label.setEnabled(true);
    bclear.setEnabled(true);
    bdelete.setEnabled(true);
    bdivide.setEnabled(true);
    bsqrt.setEnabled(true);
    bsquare.setEnabled(true);
    breciprocal.setEnabled(true);
    bminus.setEnabled(true);
    b7.setEnabled(true);
    b8.setEnabled(true);
    b9.setEnabled(true);
    bmultiply.setEnabled(true);
    b4.setEnabled(true);
    b5.setEnabled(true);
    b6.setEnabled(true);
    bplus.setEnabled(true);
    b1.setEnabled(true);
    b2.setEnabled(true);
    b3.setEnabled(true);
    bequal.setEnabled(true);
    b0.setEnabled(true);
    bdot.setEnabled(true);
 
    }
 
    public class void disable() {
    r1.setEnabled(true);
    r2.setEnabled(false);
    t.setText("");
    label.setText(" ");
    bclear.setEnabled(false);
    bdelete.setEnabled(false);
    bdivide.setEnabled(false);
    bsqrt.setEnabled(false);
    bsquare.setEnabled(false);
    breciprocal.setEnabled(false);
    bminus.setEnabled(false);
    b7.setEnabled(false);
    b8.setEnabled(false);
    b9.setEnabled(false);
    bmultiply.setEnabled(false);
    b4.setEnabled(false);
    b5.setEnabled(false);
    b6.setEnabled(false);
    bplus.setEnabled(false);
    b1.setEnabled(false);
    b2.setEnabled(false);
    b3.setEnabled(false);
    bequal.setEnabled(false);
    b0.setEnabled(false);
    bdot.setEnabled(false);
    }*/
}

class CalculatorTest
{
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		c.setTitle("CALCULATOR");//Setting title of the JFrame
		c.setSize(300,490);//Setting size
		//c.setLayout(null);
		c.getContentPane().setLayout(null);//Setting Layout
        c.getContentPane().setBackground(Color.black);//Setting Background Color
        c.setResizable(false);//Preventing window from resizing
		c.setLocationRelativeTo(null);//Setting location to the center of the screen
		//c.setLocation(100,20);
		c.setVisible(true);//Setting window's visibility
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
		
	}
}

