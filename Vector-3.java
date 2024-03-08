/*Elemento máximo en un vector de enteros:*/
public class MaximoElemento {
    public static void main(String[] args) {
        int[] vector = {1, 5, 3, 7, 2};
        int maximo = vector[0];
  
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
  
        System.out.println("El elemento máximo es: " + maximo);
    }
  }