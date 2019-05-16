/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Aplicacion {
    public static void main(String[] args) {
        List<Inmueble> superficiesSolares = new ArrayList<Inmueble>();
        List<Inmueble> plazasdeGarage = new ArrayList<Inmueble>();
        List<Inmueble> viviendas = new ArrayList<Inmueble>();
        List<Inmueble> localesComerciales = new ArrayList<Inmueble>();
        
        SuperficiesSolares solar1 = new SuperficiesSolares("rustica", 5000000, "Calle 12. cr. 5", 120);
        SuperficiesSolares solar2 = new SuperficiesSolares("urbano", 2500000, "Calle 34. cr. 8", 120);
        SuperficiesSolares solar3 = new SuperficiesSolares("rustico", 7500000, "Calle 53. cr. 13", 120);
        superficiesSolares.add(solar1);
        superficiesSolares.add(solar2);
        superficiesSolares.add(solar3);
        
        
        PlazasdeGarage garage1 = new PlazasdeGarage("publico", 5600, "Cll 34 #3-45", 75);
        PlazasdeGarage garage2 = new PlazasdeGarage("privado", 7500, "Cll 23 Cr. 35", 90);
        PlazasdeGarage garage3 = new PlazasdeGarage("publico", 5800, "Cll 34 #48-25", 115);
        plazasdeGarage.add(garage1);
        plazasdeGarage.add(garage2);
        plazasdeGarage.add(garage3);
        
        LocalesComerciales lComercial1 = new LocalesComerciales(58000000, 70, "nuevo", "Cll 34 #48-25", 170);
        LocalesComerciales lComercial2 = new LocalesComerciales(12000000, 50, "nuevo", "Cll 56 #4-125", 100);
        LocalesComerciales lComercial3 = new LocalesComerciales(5000000, 92, "segunda mano", "Cll 86 #8-50", 70);
        localesComerciales.add(lComercial1);
        localesComerciales.add(lComercial2);
        localesComerciales.add(lComercial3);
        
        Viviendas vivienda1 = new Viviendas(30000000, 2, 2, "nuevo", "Calle 12. cr. 5", 130);
        Viviendas vivienda2 = new Viviendas(45000000, 3, 1, "segunda mano", "Cll 34 #3-45", 130);
        Viviendas vivienda3 = new Viviendas(300000000, 4, 3, "nuevo", "Cll 34 #48-25", 130);
        viviendas.add(vivienda1);
        viviendas.add(vivienda2);
        viviendas.add(vivienda3);
        
        
        solar1.muestra();
        garage1.muestra();
        lComercial1.muestra();
        lComercial3.muestra();
        vivienda1.muestra();
        vivienda2.muestra();
                
        
    }
}
