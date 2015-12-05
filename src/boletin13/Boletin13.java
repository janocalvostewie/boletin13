package boletin13;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin13 {

    public static void main(String[] args) {

        int contador = 0;

        Academica primer = new Academica(JOptionPane.showInputDialog("Teclea el nombre:"), JOptionPane.showInputDialog("Teclea el teléfono:"), JOptionPane.showInputDialog("Teclea el email:"));
        Academica segundo = new Academica(JOptionPane.showInputDialog("Teclea el nombre:"), JOptionPane.showInputDialog("Teclea el teléfono:"), JOptionPane.showInputDialog("Teclea el email:"));
        Academica tercero = new Academica(JOptionPane.showInputDialog("Teclea el nombre:"), JOptionPane.showInputDialog("Teclea el teléfono:"), JOptionPane.showInputDialog("Teclea el email:"));

        primer.resumen();
        segundo.resumen();
        tercero.resumen();
    }

}
