/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.entidades;

/**
 *
 * @author BRAYAM
 */
public class Administrador {
    private String Login;
    private String Clave;
    private int  Numero_Documento;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public int getNumero_Documento() {
        return Numero_Documento;
    }

    public void setNumero_Documento(int Numero_Documento) {
        this.Numero_Documento = Numero_Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    @Override
    public String toString() {
        return "Administrador{" + "Login=" + Login + ", Clave=" + Clave + ", Numero_Documento=" + Numero_Documento + ", Nombre=" + Nombre + ", Apellido1=" + Apellido1 + ", Apellido2=" + Apellido2 + '}';
    }
    
}
