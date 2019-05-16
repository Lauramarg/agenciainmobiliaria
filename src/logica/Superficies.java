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
public abstract class Superficies implements Inmueble{
    private float precio;
    private String ubicacion;
    private int espacioocupado;

    public Superficies(float precio, String ubicacion, int espacioocupado) {
        this.ubicacion = ubicacion;
        this.espacioocupado = espacioocupado;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
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
