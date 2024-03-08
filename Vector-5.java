/*Eliminar elementos impares de una lista:*/
import java.util.*;

public class EliminarImpares {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listaPares = new ArrayList<>();

        for (int numero : lista) {
            if (numero % 2 == 0) {
                listaPares.add(numero);
            }
        }

        System.out.println("Lista sin elementos impares: " + listaPares);
    }
}