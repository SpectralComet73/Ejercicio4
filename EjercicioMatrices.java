
//Carlos Alexis Rendon Sierra y Ethel Padilla Rodriguez 3BV2 05/05/2023

public class EjercicioMatrices {
    public static void main(String[] args) {
        // Se le pregunta al usuario el numero de filas y columnas de la matriz
        System.out.println("Ingrese el numero de filas de la matriz");
        int filas = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el numero de columnas de la matriz");
        int columnas = Integer.parseInt(System.console().readLine());
        // Se crean los objetos de la clase Matrices
        // Estas son matrices con filas y columnas dadas por el usuario
        // matriz1 y matriz2 son las matrices que se usaran para realizar las
        // operaciones
        // matriz3, matriz4 y matriz5 son las matrices que se usaran para guardar los
        // resultados de las operaciones realizadas de suma, resta y multiplicacion
        // respectivamente
        Matrices matriz1 = new Matrices(filas, columnas);
        Matrices matriz2 = new Matrices(filas, columnas);
        Matrices matriz3 = new Matrices(filas, columnas);
        Matrices matriz4 = new Matrices(filas, columnas);
        Matrices matriz5 = new Matrices(filas, columnas);
        // Se llama al metodo llenarMatriz() para llenar las matrices 1 y 2 con numeros
        // aleatorios entre 0 y 100 con decimales
        matriz1.llenarMatriz();
        matriz2.llenarMatriz();
        // Se imprimen las matrices 1 y 2 con el metodo imprimirMatriz()
        System.out.println("\nMatriz 1\n");
        matriz1.imprimirMatriz();
        System.out.println("\nMatriz 2\n");
        matriz2.imprimirMatriz();
        // Se obtienen los elementos maximos y minimos de las matrices 1 y 2 con los
        // metodos obtener_elemento_maximo() y obtener_elemento_minimo()
        System.out.println("\nElemento maximo de la matriz 1");
        matriz1.obtener_elemento_maximo();
        System.out.println("\nElemento maximo de la matriz 2");
        matriz2.obtener_elemento_maximo();
        System.out.println("\nElemento minimo de la matriz 1");
        matriz1.obtener_elemento_minimo();
        System.out.println("\nElemento minimo de la matriz 2");
        matriz2.obtener_elemento_minimo();
        // Se llama al metodo sumar_dos_matrices() para sumar las matrices 1 y 2 y se le asigna el resultado a la matriz 3
        System.out.println("\nSuma de las matrices\n");
        matriz3.matriz = matriz1.sumar_dos_matrices(matriz1.devolverMatriz(), matriz2.devolverMatriz());
        matriz3.imprimirMatriz();
        // Se llama al metodo restar_dos_matrices() para restar las matrices 1 y 2 y se le asigna el resultado a la matriz 4
        System.out.println("\nResta de las matrices\n");
        matriz4.matriz = matriz1.restar_dos_matrices(matriz1.devolverMatriz(), matriz2.devolverMatriz());
        matriz4.imprimirMatriz();
        // Se llama al metodo multiplicar_dos_matrices() para multiplicar las matrices 1 y 2 y se le asigna el resultado a la matriz 5
        System.out.println("\nMultiplicacion de las matrices\n");
        matriz5.matriz = matriz1.multiplicar_dos_matrices(matriz1.devolverMatriz(), matriz2.devolverMatriz());
        matriz5.imprimirMatriz();

    }
}
