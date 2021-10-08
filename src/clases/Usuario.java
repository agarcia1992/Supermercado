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
public class Usuario {
    public int codigo_usuario;
    public String usuario;
    public String contrasena_usuario;
    public String estado_usuario;
    public int codigo_rol;
    
    public Usuario() {
    }
    
    public Usuario(int codigo_usuario, String usuario, String contrasena_usuario, String estado_usuario,int codigo_rol) {
        this.codigo_usuario = codigo_usuario;
        this.usuario = usuario;
        this.contrasena_usuario = contrasena_usuario;
        this.estado_usuario = estado_usuario;
        this.codigo_rol = codigo_rol;
    }
    
    public int getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getContrasena_usuario() {
        return contrasena_usuario;
    }

    public void setContrasena_usuario(String contrasena_usuario) {
        this.contrasena_usuario = contrasena_usuario;
    }
    
    public String getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }
    
    public int getCodigo_rol() {
        return codigo_rol;
    }

    public void setCodigo_rol(int codigo_rol) {
        this.codigo_rol = codigo_rol;
    }
}
