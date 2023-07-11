package mergeSort;

public class MergeSort {
    // Funcion de ordenamiento.
    public void merge(int arr[], int left, int middle, int right) {
        // Encontramos el tamaño de los sub-vectores para unirlos.
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Armamos los vectores temporales.
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        // Copiamos los datos a los vectores temporales.
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + j + 1];
        }

        /* Unimos los vectorestemporales. */

        // Instanciamos el indice inicial del primer y segundo sub-vector.
        int i = 0, j = 0;

        // Instanciamos el indice inicial del sub-vector arr[].
        int k = left;

        // Ordenamiento.
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        } // Fin del while.

        /* Si quedan elementos por ordenar */
        // Copiamos los elementos restantes de leftArray[].
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        // Copiamos los elementos restantes de rightArray[].
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Funcion de division
    public void sort(int arr[], int left, int right) {
        if (left < right) {
            // Encontramos el punto medio del vector.
            int middle = (left + right) / 2;

            // Dividimos la primera y segunda mitad (llamada recursiva).
            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            // Unimos las mitades.
            merge(arr, left, middle, right);
        }
    }
}
