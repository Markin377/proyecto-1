/*Eliminar claves de un HashMap con valor menor que un número dado:*/
import java.util.*;

public class EliminarClavesMenorNumero {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 5);
        mapa.put("D", 15);

        int numero = 10;

        for (Iterator<Map.Entry<String, Integer>> iterator = mapa.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < numero) {
                iterator.remove();
            }
        }

        System.out.println("Mapa después de eliminar claves menores que " + numero + ": " + mapa);
    }
}