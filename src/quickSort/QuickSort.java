package quickSort;

public class QuickSort {
    public void quicksort(int array[], int izq, int der) {

        // Tomamos el primer elemento como pivote.
        // Realizamos la busqueda de izquierda a derecha y luego de derecha a izquierda.
        int pivote = array[izq];
        int i = izq;
        int j = der;
        int aux;

        // Mientras no se crucen las busquedas, buscamos el elemento mayor que pivote,
        // luego buscamos el elemento menor que pivote.
        // Si no se han cruzado, los intercambiamos.
        while (i < j) {
            while (array[i] <= pivote && i < j)
                i++;
            while (array[j] > pivote)
                j--;
            if (i < j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }

        // Colocamos el pivote en su lugar de forma que tendremos los menores a su
        // izquierda y los mayores a su derecha.
        array[izq] = array[j];
        array[j] = pivote;

        // Ordenamos subarray izquierdo y subarray derecho.
        if (izq < j - 1)
            quicksort(array, izq, j - 1);
        if (j + 1 < der)
            quicksort(array, j + 1, der);

    }
}
