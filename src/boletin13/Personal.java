package boletin13;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Personal {

    private String telefono;
    private String email;

    //CONSTRUCTORES
    public Personal() {
    }

    //public ClasePersonal(String nom){nombre = nom;}

    public Personal(String tele, String maili) {

        telefono = tele;
        email = maili;

    }

    //SETTERS
    public void setTelefono(String tel) {
        telefono = tel;
    }

    ;
    public void setEmail(String mail) {
        email = mail;
    }

    ;
    
    //GETTERS
   
    public String getTelefono() {
        return telefono;
    }

    ;
    public String getEmail() {
        return email;
    }
;

}
