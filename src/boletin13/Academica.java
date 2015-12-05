package boletin13;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Academica {

    public int numReferencia;
    private static int ref;
    private String nombre;
    private Personal alumno;
    public float notaTeorica;
    public float notaPractica;
    public float boletines;

    //CONSTRUCTORES
    public Academica(String nombre, String tel, String mail) {
        ref=++ref;
        numReferencia = ref;
        this.nombre = nombre;
        alumno = new Personal(tel, mail);
        notaTeorica = Float.parseFloat(JOptionPane.showInputDialog("Nota Teórica"));
        notaPractica = Float.parseFloat(JOptionPane.showInputDialog("Nota Práctica"));
        boletines = Float.parseFloat(JOptionPane.showInputDialog("Boletines"));

    }

    //SETTERS
    //GETTERS
    public int getNumRef() {
        return numReferencia;
    }

    ;
    public float getNP() {
        return notaPractica;
    }

    ;
    public float getNT() {
        return notaTeorica;
    }

    ;
    public float getBoletines() {
        return boletines;
    }

    ;
    public String getNombre() {
        return nombre;
    }

    ;
    
    //MÉTODOS
    public float calculaNota() {
        float nfinal = (float) ((notaTeorica * 0.4) + (notaPractica * 0.4) + (boletines * 0.2));
        return nfinal;
    }

    public void resumen() {
        JOptionPane.showMessageDialog(null, "Número de alumno: " + numReferencia + "\nNombre: " + nombre + "\nTeléfono: " + alumno.getTelefono() + "\nEmail: " + alumno.getEmail() + "\nNota Teórica: " + notaTeorica + "\nNota Práctica: " + notaPractica + "\nBoletines: " + boletines + "\nMedia Final: " + calculaNota());
    }
}
