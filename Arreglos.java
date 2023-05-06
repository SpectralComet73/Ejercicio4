
//Carlos Alexis Rendon Sierra y Ethel Padilla Rodriguez 3BV2 05/05/2023

//Se crea la clase Arreglos con sus atributos y metodos
//Se crea el constructor de la clase Arreglos
//Tiene como atributo un arreglo de tipo double llamado arreglo de tamano n dado por el usuario
public class Arreglos {
    double[] arreglo;

    public Arreglos(int n) {
        arreglo = new double[n];
    }

    // Se crea el metodo llenarArreglo() que llena el arreglo con numeros aleatorios
    // entre 0 y 100 con decimales
    public void llenarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (double) (Math.random() * 100);
        }
    }

    // Se crea el metodo imprimirArreglo() que imprime el arreglo
    public void imprimirArreglo() {
        for (double x : arreglo) {
            System.out.println("Elemento -> " + x);
        }
    }

    // Se crea el metodo devolverArreglo() que devuelve el atributo arreglo por lo
    // que actua como un getter
    public double[] devolverArreglo() {
        return arreglo;
    }

    // Se crea el metodo obtener_elemento_maximo() que obtiene el elemento maximo
    // del arreglo
    // Esto se hace comparando el primer elemento del arreglo con los demas
    // elementos del arreglo y guardando el mayor en la variable max
    // Por lo que en cada iteracion se compara el elemento maximo con el siguiente
    // elemento del arreglo y se guarda el mayor en la variable max
    public void obtener_elemento_maximo() {
        double max = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }
        System.out.println("El elemento maximo es: " + max);
    }

    // Se crea el metodo obtener_elemento_minimo() que obtiene el elemento minimo
    // del arreglo
    // Esto se hace comparando el primer elemento del arreglo con los demas
    // elementos del arreglo y guardando el menor en la variable min
    // Por lo que en cada iteracion se compara el elemento minimo con el siguiente
    // elemento del arreglo y se guarda el menor en la variable min
    public void obtener_elemento_minimo() {
        double min = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
        }
        System.out.println("El elemento minimo es: " + min);
    }

    // Se crea el metodo obtener_suma() que obtiene la suma de todos los elementos
    // del arreglo
    // Esto se hace sumando cada elemento del arreglo con el elemento siguiente y
    // guardando la suma en la variable suma
    // Por lo que en cada iteracion se suma el elemento del arreglo con el siguiente
    // elemento del arreglo y se guarda la suma en la variable suma
    public void obtener_suma() {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("La suma es: " + suma);
    }

    // Se crea el metodo sumar_dos_arreglos() que suma los elementos de cada arreglo
    // con la misma posicion y los guarda en un tercer arreglo
    // Esto se hace sumando cada elemento del arreglo1 con el elemento del arreglo2
    // con la misma posicion y guardando la suma en el arreglo3
    // Por lo que en cada iteracion se suma el elemento del arreglo1 con el elemento
    // del arreglo2 con la misma posicion y se guarda la suma en el arreglo3
    // Este metodo devuelve el arreglo3
    public double[] sumar_dos_arreglos(double[] arreglo1, double[] arreglo2) {
        double[] arreglo3 = new double[arreglo1.length];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo3[i] = arreglo1[i] + arreglo2[i];
        }
        return arreglo3;
    }

    // Se crea el metodo producto_punto() que calcula el producto punto de dos
    // arreglos
    // Esto se hace multiplicando cada elemento del arreglo1 con el elemento del
    // arreglo2 con la misma posicion y sumando los productos
    // Por lo que en cada iteracion se multiplica el elemento del arreglo1 con el
    // elemento del arreglo2 con la misma posicion y se suma el producto con el
    // producto de la iteracion anterior
    public double producto_punto(double[] arreglo1, double[] arreglo2, double resultado_producto_punto) {
        // El producto punto es la suma de los productos de los elementos de los
        // arreglos
        for (int i = 0; i < arreglo1.length; i++) {
            resultado_producto_punto += arreglo1[i] * arreglo2[i];
        }
        return resultado_producto_punto;

    }

    // Se crea el metodo ordenar_arreglo() que ordena los elementos del arreglo de
    // menor a mayor
    // Esto se hace usando el metodo sort de la clase Arrays de java que ordena los
    // elementos de un arreglo de menor a mayor
    public void ordenar_arreglo() {
        java.util.Arrays.sort(arreglo);
    }

    // Se crea el metodo media_arreglo() que calcula la media de los elementos del
    // arreglo
    // Esto se hace sumando cada elemento del arreglo y dividiendo la suma entre el
    // numero de elementos del arreglo
    // Por lo que en cada iteracion se suma el elemento del arreglo con la suma de
    // la iteracion anterior y se divide la suma entre el numero de elementos del
    // arreglo

    public void media_arreglo() {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("La media es: " + suma / arreglo.length);
    }

}
