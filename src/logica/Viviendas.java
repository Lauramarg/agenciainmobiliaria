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
public class Viviendas extends Construcciones{
    private float precio;
    private int habitaciones;
    private int piso;
    private List<Inmueble> venta;
    
    public Viviendas(float precio, int habitaciones, int piso, String tipo, String ubicacion, int espacioocupado) {
        super(tipo, ubicacion, espacioocupado);
        this.precio = precio;
        this.habitaciones = habitaciones;
        this.piso = piso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public void muestra() {
        System.out.println("Esta vivienda cuenta con "+getHabitaciones()+" habitaciones y tiene "+getPiso()+" pisos y es: "+getTipo());
        System.out.println("ademas tiene un precio de: "+getPrecio());
    }
    
    public void ventaInmueble(Inmueble inmueble) {
        if(!venta.contains(inmueble)){
            venta.add(inmueble);
        }
    }
    
    public void venta(Viviendas venta, float precio){
        for (int i = 0; i < this.venta.size() ; i++) {
            if(venta.getPrecio() < precio){
                venta.muestra();
            }
        }
    }
    
}
