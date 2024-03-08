import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1: Verificación de Año Bisiesto
        System.out.println("Ejercicio 1: Verificación de Año Bisiesto");
        System.out.print("Ingresa un año: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        // Ejercicio 2: Juego de Piedra, Papel o Tijeras
        System.out.println("\nEjercicio 2: Juego de Piedra, Papel o Tijeras");
        System.out.print("Elige Piedra, Papel o Tijeras: ");
        String usuario = scanner.next().toLowerCase();
        String[] opciones = { "piedra", "papel", "tijeras" };
        Random random = new Random();
        int index = random.nextInt(3);
        String computadora = opciones[index];
        System.out.println("La computadora eligió: " + computadora);
        if (usuario.equals(computadora)) {
            System.out.println("Empate!");
        } else if ((usuario.equals("piedra") && computadora.equals("tijeras")) ||
                (usuario.equals("papel") && computadora.equals("piedra")) ||
                (usuario.equals("tijeras") && computadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        // Ejercicio 3: Conversión de Moneda
        System.out.println("\nEjercicio 3: Conversión de Moneda");
        System.out.print("Ingresa la cantidad de dinero en la moneda actual: ");
        double cantidad = scanner.nextDouble();
        System.out.print("Ingresa la tasa de cambio a la otra moneda: ");
        double tasaCambio = scanner.nextDouble();
        double resultado = cantidad * tasaCambio;
        System.out.println("El resultado de la conversión es: " + resultado);

        // Ejercicio 4: Cálculo de Intereses Compuestos
        System.out.println("\nEjercicio 4: Cálculo de Intereses Compuestos");
        System.out.print("Ingresa la cantidad inicial invertida: ");
        double cantidadInicial = scanner.nextDouble();
        System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
        double tasaInteres = scanner.nextDouble();
        System.out.print("Ingresa el número de años: ");
        int numAnios = scanner.nextInt();
        double montoFinal = cantidadInicial * Math.pow(1 + (tasaInteres / 100), numAnios);
        System.out.println("El monto final después de " + numAnios + " años es: " + montoFinal);

        // Ejercicio 5: Suma de Dígitos
        System.out.println("\nEjercicio 5: Suma de Dígitos");
        System.out.print("Ingresa un número entero positivo: ");
        int num = scanner.nextInt();
        int sumaDigitos = 0;
        while (num > 0) {
            sumaDigitos += num % 10;
            num /= 10;
        }
        System.out.println("La suma de los dígitos es: " + sumaDigitos);

        // Ejercicio 6: Generación de Patrón de Asteriscos
        System.out.println("\nEjercicio 6: Generación de Patrón de Asteriscos");
        System.out.print("Ingresa un número entero positivo: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Ejercicio 7: Ordenamiento de Números
        System.out.println("\nEjercicio 7: Ordenamiento de Números");
        System.out.println("Ingresa tres números enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int menor, intermedio, mayor;
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                intermedio = num2;
                mayor = num3;
            } else {
                intermedio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                intermedio = num1;
                mayor = num3;
            } else {
                intermedio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                intermedio = num1;
                mayor = num2;
            } else {
                intermedio = num2;
                mayor = num1;
            }
        }
        System.out.println("Números ordenados: " + menor + ", " + intermedio + ", " + mayor);

        // Ejercicio 8: Generación de Números Aleatorios con Suma
        System.out.println("\nEjercicio 8: Generación de Números Aleatorios con Suma");
        int numAleatorio1 = random.nextInt(10) + 1;
        int numAleatorio2 = random.nextInt(10) + 1;
        System.out.print("Cuál es la suma de " + numAleatorio1 + " y " + numAleatorio2 + "?: ");
        int sumaUsuario = scanner.nextInt();
        int sumaCorrecta = numAleatorio1 + numAleatorio2;
        if (sumaUsuario == sumaCorrecta) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La suma es: " + sumaCorrecta);
        }

        // Ejercicio 9: Cálculo de Máximo Común Divisor (MCD)
        System.out.println("\nEjercicio 9: Cálculo de Máximo Común Divisor (MCD)");
        System.out.print("Ingresa dos números enteros positivos: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int mcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                mcd = i;
            }
        }
        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);

        // Ejercicio 10: Cálculo de Dígitos Repetidos en un Número
        System.out.println("\nEjercicio 10: Cálculo de Dígitos Repetidos en un Número");
        System.out.print("Ingresa un número entero positivo: ");
        int numRepetir = scanner.nextInt();
        System.out.print("Ingresa el dígito a buscar: ");
        int digitoBuscar = scanner.nextInt();
        int contador = 0;
        while (numRepetir > 0) {
            int digito = numRepetir % 10;
            if (digito == digitoBuscar) {
                contador++;
            }
            numRepetir /= 10;
        }
        System.out.println("El dígito " + digitoBuscar + " aparece " + contador + " veces.");

        scanner.close();
    }
}
