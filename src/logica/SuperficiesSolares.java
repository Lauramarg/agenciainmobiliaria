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
public class SuperficiesSolares extends Superficies{
    private String zona;

    private List<Inmueble> venta;
    

    public SuperficiesSolares(String zona, float precio, String ubicacion, int espacioocupado) {
        super(precio, ubicacion, espacioocupado);
        this.zona = zona;
    }

    public List<Inmueble> getVenta() {
        return venta;
    }

    public void setVenta(List<Inmueble> venta) {
        this.venta = venta;
    }
    

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
    public void muestra(){
        System.out.println("Esta superficie esta en una zona " + getZona() + " y tiene un precio de: " + getPrecio());
    }
    public void ventaInmueble(Inmueble inmueble) {
        if(!venta.contains(inmueble)){
            venta.add(inmueble);
        }
    }

    public void venta(Superficies venta, float precio){
        for (int i = 0; i < this.venta.size() ; i++) {
            if(venta.getPrecio() < precio){
                venta.muestra();
            }
        }
    }
    
    public void localesSegundaMano(SuperficiesSolares venta){
        for (int i = 0; i < this.venta.size() ; i++) {
            if(venta.getZona()== "rustico"){
                venta.muestra();
            }
            
        }
    }
}
