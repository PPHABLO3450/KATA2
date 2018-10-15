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
        Map<Integer, Integer> histogram= new HashMap<>();
        int[] data;
        data = new int[30];
        
        int LimMax = 15;
        int LimInf = 0;
        
        // Se inicializa el array de enteros con números enteros generados de manera aleatoria entre [LimInf,LimMax]: 
        for(int i = 0;i < data.length;i++){
            data[i] = (int) Math.floor(Math.random()*(LimInf-LimMax+1)+LimMax); 
        }
       
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        // Recorremos todos los elementos del mapa imprimiendo por consola cada clave 
        // con su valor correspondiente en el histograma
        histogram.keySet().stream().forEach((Integer key) -> {
            System.out.println(key+ "==>" + histogram.get(key));
        });
    }
    
    
}


