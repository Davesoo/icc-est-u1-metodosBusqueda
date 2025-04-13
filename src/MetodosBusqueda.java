public class MetodosBusqueda {

    public int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i; // Retorna la posición donde se encontró el valor
            }
        }
        return -1; // Si no se encuentra
    }
}
