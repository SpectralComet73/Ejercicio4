
//Carlos Alexis Rendon Sierra y Ethel Padilla Rodriguez 3BV2 05/05/2023

//Se crea la clase Matrices con sus atributos y metodos
//Se crea el constructor de la clase Matrices
//Tiene como atributos una matriz de tipo double llamada matriz de tamano filas y columnas dados por el usuario
public class Matrices {
    double[][] matriz;
    int filas;
    int columnas;

    public Matrices(int filas, int columnas) {
        matriz = new double[filas][columnas];
    }

    // Se llena la matriz con numeros aleatorios entre 0 y 100 con decimales
    public void llenarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (double) (Math.random() * 100);
            }
        }
    }

    // Se imprime la matriz utilizando un for each anidado para recorrer la matriz
    public void imprimirMatriz() {
        for (double[] x : matriz) {
            // La variable x representa cada fila de la matriz
            for (double y : x) {
                // Se imprime cada elemento de la matriz con un espacio entre ellos
                // La variable y es el elemento de la matriz
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    // Se crea el metodo obtener_elemento_maximo() que obtiene el elemento maximo de
    // la matriz
    // Esto se hace comparando el primer elemento de la matriz con los demas
    // elementos de la matriz
    // y guardando el mayor en la variable max
    // Por lo que en cada iteracion se compara el elemento maximo con el siguiente
    // elemento de la matriz
    // y se guarda el mayor en la variable max
    public void obtener_elemento_maximo() {
        double max = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        System.out.println("El elemento maximo es: " + max);
    }

    // Se crea el metodo obtener_elemento_minimo() que obtiene el elemento minimo de
    // la matriz
    // Esto se hace comparando el primer elemento de la matriz con los demas
    // elementos de la matriz
    // y guardando el menor en la variable min
    // Por lo que en cada iteracion se compara el elemento minimo con el siguiente
    // elemento de la matriz
    // y se guarda el menor en la variable min
    public void obtener_elemento_minimo() {
        double min = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        System.out.println("El elemento minimo es: " + min);
    }

    // Se devuelve el atributo matriz
    public double[][] devolverMatriz() {
        return matriz;
    }

    // Se crea el metodo sumar_dos_matrices que suma dos matrices de igual dimension
    // que se guardara en una nueva matriz
    // Esta nueva matriz se crea con las mismas dimensiones que las matrices que se
    // suman y se llena con la suma de los elementos con la misma posicion de las
    // matrices que se suman
    public double[][] sumar_dos_matrices(double[][] matriz1, double[][] matriz2) {
        double[][] matriz3 = new double[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[0].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matriz3;
    }

    // Se crea el metodo restar_dos_matrices que resta dos matrices de igual
    // dimension
    // que se guardara en una nueva matriz
    // Esta nueva matriz se crea con las mismas dimensiones que las matrices que se
    // restan y se llena con la resta de los elementos con la misma posicion de las
    // matrices que se restan

    public double[][] restar_dos_matrices(double[][] matriz1, double[][] matriz2) {
        double[][] matriz4 = new double[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz4.length; i++) {
            for (int j = 0; j < matriz4[0].length; j++) {
                matriz4[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return matriz4;
    }

    // Se crea el metodo multiplicar_dos_matrices que multiplica dos matrices de
    // igual dimension
    // que se guardara en una nueva matriz
    // Esta nueva matriz se crea con las mismas dimensiones que las matrices que se
    // multiplican y se llena con la multiplicacion de los elementos con la misma
    // posicion de las matrices que se multiplican
    public double[][] multiplicar_dos_matrices(double[][] matriz1, double[][] matriz2) {
        double[][] matriz5 = new double[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz5.length; i++) {
            for (int j = 0; j < matriz5[0].length; j++) {
                matriz5[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return matriz5;
    }

}
