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
public class Pregunta {
    int codigo;
    String pregunta ;
    String descripcion;
    String estado ;
    
    public Pregunta() {
    }
    
    public Pregunta(int codigo, String pregunta, String descripcion, String estado ) {
        this.codigo = codigo;
        this.pregunta = pregunta;
        this.descripcion = descripcion;
        this.estado = estado; 
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
