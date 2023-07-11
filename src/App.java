import mergeSort.MergeSort;
import quickSort.QuickSort;
import shellSort.ShellSort;

public class App {
    // Funcion para medir el tiempo de ejecucion de otra.
    public static void timeFunc(Runnable func) {
        long startTime = System.nanoTime();
        func.run();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
    }

    // Funcion para imprimir el array con espacios entre caracteres.
    public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    // Funcion main.
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos a 'Taller de Algoritmos y Estructura de Datos I'");

        /* Ejecutamos los metodos de ordemaniento uno por uno. */
        // Inicializamos siempre el mismo array para comparar la diferencia de tiempo
        // entre los diferentes metodos.

        // ShellSort.
        System.out.println("Ordenamiento por el metodo 'ShellSort'");

        // Instanciamos el array
        int[] shellSortArray = { 26, 40, 32, 7, 5, 61, 4, 11 };

        // Guardamos el largo del array en una variable llamada 'largoShellSortArray'.
        int largoShellSortArray = shellSortArray.length;

        // Instanciamos la clase.
        ShellSort shellsort = new ShellSort();

        // Imprimimos el array.
        System.out.println("Array a utilizar:");
        printArray(shellSortArray);
        timeFunc(() -> {
            shellsort.shellsort(shellSortArray, largoShellSortArray);
        });
        printArray(shellSortArray);

        // MergeSort.
        System.out.println("Ordenamiento por el metodo 'MergeSort'");
        int[] mergeSortArray = { 26, 40, 32, 7, 5, 61, 4, 11 };
        int largoMergeSortArray = mergeSortArray.length;
        MergeSort mergeshort = new MergeSort();
        System.out.println("Array a utilizar:");
        printArray(mergeSortArray);
        timeFunc(() -> {
            mergeshort.sort(mergeSortArray, 0, largoMergeSortArray - 1);
        });
        printArray(mergeSortArray);

        // QuickSort
        System.out.println("Ordenamiento por el metodo 'QuickSort'");
        int[] quickSortArray = { 26, 40, 32, 7, 5, 61, 4, 11 };
        int largoQuickSortArray = mergeSortArray.length;
        QuickSort quicksort = new QuickSort();
        System.out.println("Array a utilizar:");
        printArray(quickSortArray);
        timeFunc(() -> {
            quicksort.quicksort(quickSortArray, 0, largoQuickSortArray - 1);
        });
        printArray(quickSortArray);
    }
}
