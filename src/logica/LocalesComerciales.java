/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;

/**
 *
 * @author HP
 */
public class LocalesComerciales extends Construcciones{
    private float precio;
    private int superficie;
    private List<Inmueble> alquiler;

    public LocalesComerciales(float precio, int superficie, String tipo, String ubicacion, int espacioocupado) {
        super(tipo, ubicacion, espacioocupado);
        this.precio = precio;
        this.superficie = superficie;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public float getSuperficie() {
        return superficie;
    }
    
    public void setSuperficie() {
        this.superficie = superficie;
    }

    @Override
    public void muestra() {
        System.out.println("Esta local comercial esta ubicado en "+getUbicacion()+", tiene un precio de "+getPrecio()+" y es "+getTipo());
        System.out.println("ademas tiene un precio de: "+getPrecio());
    }
    
    public void alquilerInmueble(Inmueble inmueble){
        if(!alquiler.contains(inmueble)){
            alquiler.add(inmueble);
        }
    }
    
    public void localesSegundaMano(LocalesComerciales alquiler, int superficie){
        for (int i = 0; i < this.alquiler.size() ; i++) {
            if(alquiler.getTipo() == "segunda mano"){
                if(alquiler.getPrecio() < superficie){
                    alquiler.muestra();
                }
            }
            
        }
    }
}
