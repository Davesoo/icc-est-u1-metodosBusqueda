public class App {
    MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App();
        int[] datos = {10, 20, 30, 40, 50};
        int valorABuscar = 30;

        int resultado = app.metodosBusqueda.busquedaLineal(datos, valorABuscar);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}