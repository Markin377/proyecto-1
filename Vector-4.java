/*Eliminar duplicados de una lista:*/
import java.util.*;

public class EliminarDuplicados {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        Set<Integer> conjunto = new LinkedHashSet<>(lista);
        lista.clear();
        lista.addAll(conjunto);

        System.out.println("Lista sin duplicados: " + lista);
    }
}