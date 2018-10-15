/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2_histograma;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author pablo
 */
public class Kata2_Histograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        //Instanciamos un objeto de tipo Histogram que llamaremos histo al que se la pasa data.
        Histogram histo;
        histo = new Histogram(data);
        
        Map<String,Integer> histogr= histo.getHistogram();
        
        
        // Recorremos todos los elementos del mapa imprimiendo por consola cada clave 
        // con su valor correspondiente en el histograma
        histogr.keySet().stream().forEach((String key) -> {
            System.out.println(key+ "==>" + histogr.get(key));
        });
    }
    
    
}


