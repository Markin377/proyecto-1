/*Producto de elementos pares:*/
public class ProductoElementosPares {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};
        int producto = 1;
  
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                producto *= vector[i];
            }
        }
  
        System.out.println("El producto de los elementos pares es: " + producto);
    }
  }
