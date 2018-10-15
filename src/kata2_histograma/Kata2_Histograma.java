/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2_histograma;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;


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
        
        int LimMax = 9;
        int LimInf = 0;
        
        // Se inicializa el array de enteros con números enteros generados de manera aleatoria entre [LimInf,LimMax]: 
        for(int i = 0;i < data.length;i++){
            data[i] = (int) Math.floor(Math.random()*(LimInf-LimMax+1)+LimMax); 
        }
        //prueba
        //Se recorre el array data:
        for(int i = 0;i < data.length;i++){
            if(histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
        }
       
        // Recorremos todos los elementos del mapa imprimiendo por consola cada clave 
        // con su valor correspondiente en el histograma
        histogram.keySet().stream().forEach((Integer key) -> {
            System.out.println(key+ "==>" + histogram.get(key));
        });
    }
    
}


