
package cambio;

/**
 *
 * @author Pablo
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Cambio extends Frame{  
    
Label lb1,lb2,lb3;
TextField txt1,txt2,txt3;
Button btn1,btn2;
Choice cambios, monedas;
String pesos;

public Cambio (String nombre)
{


super(nombre);
// el gestionador de diseño es el BorderLayout
setLayout(new FlowLayout());
// Añadimos las componentes propias de la interfaz

 pesos = JOptionPane.showInputDialog( "Escriba la taza de cambio en numeros $" );

cambios = new Choice();
cambios.add("Pesos Mexicanos");
cambios.add("Dolares Americanos");
cambios.add("Euros");

monedas = new Choice();
monedas.add("Pesos Mexicanos");
monedas.add("Dolares Americanos");
monedas.add("Euros");

lb1= new Label("Cantidad");
lb2= new Label("a");
lb3 = new Label("Taza de cambio");
txt1=new TextField(12);

txt2=new TextField(pesos,12);
txt3=new TextField(12);


 
add(lb3);
add(txt2);

add(lb1);
add(txt1);

add(cambios);
add(lb2);

add(monedas);
add(txt3);

addWindowListener(new listaWindowListener());
monedas.addItemListener(new ListaEscucha());

 setSize(500,400);
 

}


class listaWindowListener implements WindowListener
{

 public void windowClosing(WindowEvent e) 
{    
dispose(); 
System.exit(0); 
}

        @Override
        public void windowOpened(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosed(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
 
}


class ListaEscucha implements ItemListener{
public void itemStateChanged(ItemEvent ie)
        {
            int indice = ((Integer) ie.getItem()).intValue();
            if  (indice == 0){ }
        }
}


 
 
} 




