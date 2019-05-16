/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author HP
 */
public abstract class Construcciones implements Inmueble{
    private String tipo;
    private String ubicacion;
    private int espacioocupado;
    
    public Construcciones(String tipo, String ubicacion, int espacioocupado) {
        this.ubicacion = ubicacion;
        this.espacioocupado = espacioocupado;
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEspacioocupado() {
        return espacioocupado;
    }

    public void setEspacioocupado(int espacioocupado) {
        this.espacioocupado = espacioocupado;
    }
    
    
    
    public abstract void muestra();
}
