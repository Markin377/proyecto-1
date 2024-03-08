/*Suma de elementos:*/
public class SumaElementos {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};
        int suma = 0;
  
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
  
        System.out.println("La suma de los elementos es: " + suma);
    }
  }