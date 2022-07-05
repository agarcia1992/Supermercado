/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author agarc
 */
public class Reclamo {
    public int codigo_reclamo;
    public int codigo_tipo;
    public String descripcion_reclamo;
    public int codigo_estado;
    public int codigo_cliente;
    
    public Reclamo (){
        
    }

    public Reclamo(int codigo_reclamo, int codigo_tipo, String descripcion_reclamo, int codigo_estado, int codigo_cliente) {
        this.codigo_reclamo = codigo_reclamo;
        this.codigo_tipo = codigo_tipo;
        this.descripcion_reclamo = descripcion_reclamo;
        this.codigo_estado = codigo_estado;
        this.codigo_cliente = codigo_cliente;
    }

    public int getCodigo_reclamo() {
        return codigo_reclamo;
    }

    public void setCodigo_reclamo(int codigo_reclamo) {
        this.codigo_reclamo = codigo_reclamo;
    }

    public int getCodigo_tipo() {
        return codigo_tipo;
    }

    public void setCodigo_tipo(int codigo_tipo) {
        this.codigo_tipo = codigo_tipo;
    }

    public String getDescripcion_reclamo() {
        return descripcion_reclamo;
    }

    public void setDescripcion_reclamo(String descripcion_reclamo) {
        this.descripcion_reclamo = descripcion_reclamo;
    }

    public int getCodigo_estado() {
        return codigo_estado;
    }

    public void setCodigo_estado(int codigo_estado) {
        this.codigo_estado = codigo_estado;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    
}
