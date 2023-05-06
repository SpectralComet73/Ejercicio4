
//Carlos Alexis Rendon Sierra y Ethel Padilla Rodriguez 3BV2 05/05/2023

public class EjemploArreglos{
    public static void main(String[] args) {
        // Se crea le pide al usuario el tamaño de los arreglos que se usaran en el programa
        // Se crean los objetos de la clase Arreglos
        //arr1 y arr2 son los arreglos que se usaran para realizar las operaciones
        //arr3 es el arreglo que se usara para guardar la suma de los elementos de los arreglos 1 y 2
        //resultado_producto_punto es la variable que se usara para guardar el resultado del producto punto
        System.out.println("\nIngrese el tamaño del arreglo: \n");
        int tam = Integer.parseInt(System.console().readLine());
        Arreglos arr1 = new Arreglos(tam);
        Arreglos arr2 = new Arreglos(tam);
        Arreglos arr3 = new Arreglos(tam);
        double resultado_producto_punto = 0;

        //Se llama a los metodos de la clase Arreglos
        //El metodo llenarArreglo() se usa para llenar los arreglos 1 y 2
        arr1.llenarArreglo();
        arr2.llenarArreglo();

        //Se imprimen los arreglos 1 y 2
        System.out.println("\nArreglo 1\n");
        arr1.imprimirArreglo();
        System.out.println("\nArreglo 2\n");
        arr2.imprimirArreglo();

        //Se imprimen los elementos maximos y minimos de los arreglos 1 y 2
        System.out.println("\nElemento maximo del arreglo 1\n");
        arr1.obtener_elemento_maximo();
        System.out.println("\nElemento minimo del arreglo 1\n");
        arr1.obtener_elemento_minimo();

        //Se imprimen los elementos maximos y minimos de los arreglos 1 y 2
        System.out.println("\nElemento maximo del arreglo 2\n");
        arr2.obtener_elemento_maximo();
        System.out.println("\nElemento minimo del arreglo 2\n");
        arr2.obtener_elemento_minimo();

        //Se imprimen las sumas de los elementos de los arreglos 1 y 2
        System.out.println("\nSuma de los elementos de los elementos del arreglo1\n");
        arr1.obtener_suma();
        System.out.println("\nSuma de los elementos de los elementos del arreglo2\n");
        arr2.obtener_suma();

        //Se imprime el arreglo formado por la suma de los elementos con la misma posicion en dos arreglos
        System.out.println("\nArreglo formado por la suma de los elementos con la misma posicion en dos arreglos\n");
        arr3.arreglo = arr1.sumar_dos_arreglos(arr1.arreglo, arr2.arreglo);
        arr3.imprimirArreglo();
        
        //Se imprime el producto punto de los arreglos 1 y 2
        System.out.println("\nProducto punto de dos arreglos\n");
        resultado_producto_punto = arr1.producto_punto(arr1.arreglo, arr2.arreglo,resultado_producto_punto);
        System.out.println("El producto punto es: " + resultado_producto_punto);

        //Se imprime el arreglo 1 ordenado
        System.out.println("\nArreglo 1 ordenado \n");
        arr1.ordenar_arreglo();
        arr1.imprimirArreglo();

        //Se imprime el arreglo 2 ordenado
        System.out.println("\nArreglo 2 ordenado \n");
        arr2.ordenar_arreglo();
        arr2.imprimirArreglo();

        //Se imprime la media de los arreglos 1 y 2
        System.out.println("\nMedia del arreglo 1\n");
        arr1.media_arreglo();
        System.out.println("\nMedia del arreglo 2\n");
        arr2.media_arreglo();



        

    }
}
    