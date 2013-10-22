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
public class UsuarioReporta {
    private String documento_usuario_reporta;

    public String getDocumento_usuario_reporta() {
        return documento_usuario_reporta;
    }

    public void setDocumento_usuario_reporta(String documento_usuario_reporta) {
        this.documento_usuario_reporta = documento_usuario_reporta;
    }
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Direccion;
    private String Telefono;
    private String Correo;

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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "UsuarioReporta{" + "documento_usuario_reporta=" + documento_usuario_reporta + ", Nombre=" + Nombre + ", Apellido1=" + Apellido1 + ", Apellido2=" + Apellido2 + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Correo=" + Correo + '}';
    }

    
}
