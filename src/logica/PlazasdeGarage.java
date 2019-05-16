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
public class PlazasdeGarage extends Superficies{
    private String tipo;
    private List<Inmueble> alquiler;
    
    public PlazasdeGarage(String tipo,  float precio, String ubicacion, int espacioocupado) {
        super(precio, ubicacion, espacioocupado);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void muestra() {
        System.out.println("Este garage es " + getTipo() + " y tiene un precio de: " + getPrecio());
    }
    
    public void alquilerInmueble(Inmueble inmueble){
        if(!alquiler.contains(inmueble)){
            alquiler.add(inmueble);
        }
    }
    
}
