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
        Integer[] data;
        data = new Integer[30];
        
        int LimMax = 15;
        int LimInf = 0;
        
        // Se inicializa el array de enteros con números enteros generados de manera aleatoria entre [LimInf,LimMax]: 
        for(int i = 0;i < data.length;i++){
            data[i] = (int) Math.floor(Math.random()*(LimInf-LimMax+1)+LimMax); 
        }
        
        //Instanciamos un objeto de tipo Histogram que llamaremos histo al que se la pasa data.
        Histogram histo;
        histo = new Histogram(data);
        
        Map<Integer,Integer> histogr= histo.getHistogram();
        
        
        // Recorremos todos los elementos del mapa imprimiendo por consola cada clave 
        // con su valor correspondiente en el histograma
        histogr.keySet().stream().forEach((Integer key) -> {
            System.out.println(key+ "==>" + histogr.get(key));
        });
    }
    
    
}


