
/**
 * Write a description of class Calculadora here.
 * 
 * @author Roberto Salazar Márquez
 * @version 1.0
 */

import java.awt.*;

public class Calculadora extends Frame
{
    // instance variables - replace the example below with your own
    private Button b1, b2, b3, b4, b5, b6,b7, b8, b9, b10;
    private Button b11, b12, b13, b14, b15, b16, b17;
    private TextField display;
    private Panel teclado, displ;


    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        b1 = new Button("1"); b2 = new Button("2");
        b3 = new Button("3"); b4 = new Button("4");
        b5 = new Button("5"); b6 = new Button("6");
        b7 = new Button("7"); b8 = new Button("8");
        b9 = new Button("9"); b10 = new Button("0");
        b11 = new Button("+"); b12 = new Button("-");
        b13 = new Button("="); b16 = new Button(".");
        b15 = new Button("*"); b14 = new Button("/");
        b17 = new Button("C");
        
        display = new TextField("0");
        teclado = new Panel();
        displ = new Panel();
        
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
        
    }
    
    
    public static void main(String Args[])
    {
        Calculadora calc = new Calculadora();
        calc.resize(350,350);
        calc.show();
    }

}



