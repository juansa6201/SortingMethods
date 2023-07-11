package shellSort;

public class ShellSort {
    public void shellSort(int array[]) {
        // Guardamos el largo del array en una variable llamada 'n'.
        int n = array.length;
        // Dividimos la lista en (n/2) grupos de dos.
        // Clasificamos cada grupo por separado, comparando las parejas de elementos,
        // y si no estan ordenados, se intercambian.
        // Se divide nuevamente la lista en la mitad de grupos (n/4) y se vuelven a
        // clasificar los grupos por separado.
        // Asi susesivamente hasta que el tamaño del salto sea igual a 1.
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }
}
