
/**
 * Write a description of class Calculadora2 here.
 * 
 * @author Roberto Salazar Márquez
 * @version 3.0
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora3 extends JFrame
{
    // instance variables - replace the example below with your own
    private JButton b1, b2, b3, b4, b5, b6,b7, b8, b9, b10;
    private JButton b11, b12, b13, b14, b15, b16, b17;
    private JTextField display;
    private JPanel teclado, displ;
    private boolean punto = true, op = true;
    private char c = ' ';
    private double num1 = 0.0, num2 = 0.0, res = 0.0;


    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora3()
    {
        // initialise instance variables
        b1 = new JButton("1"); b2 = new JButton("2");
        b3 = new JButton("3"); b4 = new JButton("4");
        b5 = new JButton("5"); b6 = new JButton("6");
        b7 = new JButton("7"); b8 = new JButton("8");
        b9 = new JButton("9"); b10 = new JButton("0");
        b11 = new JButton("+"); b12 = new JButton("-");
        b13 = new JButton("*"); b14 = new JButton("/");
        b15 = new JButton("="); b16 = new JButton(".");
        b17 = new JButton("C");
        
        b1.addActionListener(new BotonNumerico());
        b2.addActionListener(new BotonNumerico());
        b3.addActionListener(new BotonNumerico());
        b4.addActionListener(new BotonNumerico());
        b5.addActionListener(new BotonNumerico());
        b6.addActionListener(new BotonNumerico());
        b7.addActionListener(new BotonNumerico());
        b8.addActionListener(new BotonNumerico());
        b9.addActionListener(new BotonNumerico());
        b10.addActionListener(new BotonNumerico());
        b11.addActionListener(new BotonOpera());
        b12.addActionListener(new BotonOpera());
        b13.addActionListener(new BotonOpera());
        b14.addActionListener(new BotonOpera());
        b15.addActionListener(new BotonIgual());
        b16.addActionListener(new BotonPunto());
        b17.addActionListener(new BotonC());        
        
        
        display = new JTextField("0");
        teclado = new JPanel();
        displ = new JPanel();
        
        teclado.setLayout(new GridLayout(4, 4, 2, 2));
        teclado.add(b7);
        teclado.add(b8);
        teclado.add(b9);
        teclado.add(b14);
        teclado.add(b4);
        teclado.add(b5);
        teclado.add(b6);
        teclado.add(b13);
        teclado.add(b1);
        teclado.add(b2);
        teclado.add(b3);
        teclado.add(b12);
        teclado.add(b15);
        teclado.add(b10);
        teclado.add(b16);
        teclado.add(b11);
        
        displ.setLayout(new BorderLayout());
        displ.add(b17, "East");
        displ.add(display, "Center");
        
        add(displ,"North");
        add(teclado, "Center");
        
        addWindowListener(new WC());
        
        setSize(350, 350);
        setVisible(true);
        
    }
    
    private class WC extends WindowAdapter
    {
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
        }
    }
    
    private class BotonC implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            display.setText("0");
            punto = true;
            op = true;
            num1 = num2 = 0.0;
        }
    }
    
    
    private class BotonNumerico implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            String displaynum;
            displaynum = display.getText();
            if(displaynum.equals("0"))
                displaynum = "";
            displaynum = displaynum + e.getActionCommand();
            display.setText(displaynum);
        }
    }
    
    private class BotonIgual implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            num2 = Double.parseDouble(display.getText());
            switch(c) {
                case '+': res = num1 + num2; break;
                case '-': res = num1 - num2; break;
                case '*': res = num1 * num2; break;
                case '/': res = num1 / num2; break;
            }
            display.setText(String.valueOf(res));
            op = punto = true;
        }
    }
    
    private class BotonOpera implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            String sign;
            if(op) {
                        sign = new String(e.getActionCommand());
                        c = sign.charAt(0);
                        num1 = Double.parseDouble(display.getText());
                        display.setText("0");
                        op = false;
                        punto = true;
                    }
        }
    }
    
    private class BotonPunto implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            String displaynum;
            if(punto) {
                displaynum = display.getText();
                displaynum = displaynum + ".";
                display.setText(displaynum);
                punto = false;
            }
        }
    }
    
    
    public static void main(String Args[])
    {
        
    }

}


