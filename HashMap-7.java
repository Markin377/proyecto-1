/* Promedio de calificaciones para cada estudiante:*/
import java.util.*;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Map<String, List<Integer>> calificaciones = new HashMap<>();
        calificaciones.put("Juan", Arrays.asList(80, 90, 85));
        calificaciones.put("María", Arrays.asList(70, 75, 80));

        for (Map.Entry<String, List<Integer>> entry : calificaciones.entrySet()) {
            String nombre = entry.getKey();
            List<Integer> listaCalificaciones = entry.getValue();
            double promedio = calcularPromedio(listaCalificaciones);
            System.out.println("El promedio de calificaciones de " + nombre + " es: " + promedio);
        }
    }

    public static double calcularPromedio(List<Integer> calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.size();
    }
}