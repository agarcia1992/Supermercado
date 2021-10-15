/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author kyung
 */
public class Empresa {
    int codigo_empresa;
    String nombre;
    String direccion;
    int telefono;
    String correo;
    String mision;
    String vision;
    int codigo_ciudad;
    String estado;
        
    public Empresa(){
    
        }

    public Empresa(int codigo_empresa, String nombre, String direccion, int telefono, String correo, String mision, String vision, int codigo_ciudad) {
        this.codigo_empresa = codigo_empresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.mision = mision;
        this.vision = vision;
        this.codigo_ciudad = codigo_ciudad;
    }
    
    public int getCodigo_empresa() {
        return codigo_empresa;
    }

    public void setCodigo_empresa(int codigo_empresa) {
        this.codigo_empresa = codigo_empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public int getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(int codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
