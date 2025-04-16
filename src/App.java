import Controllers.MetodoBinario;
import Controllers.MetodosBusqueda;
import Models.Persona;
 
public class App {
    public static void main(String[] args) {
        Persona[] personas = new Persona[7];
        personas [0] = new Persona(101, "Juan");
        personas [1] = new Persona(102, "Maria");
        personas [2] = new Persona(103, "Carlos");
        personas [3] = new Persona(104, "Ana");
        personas [4] = new Persona(105, "Luis");
        personas [5] = new Persona(106, "Sofia");
        personas [6] = new Persona(107, "Pedro");
        MetodosBusqueda mB = new MetodosBusqueda(personas);
        MetodoBinario mN = new MetodoBinario(personas);
        mN.showPersonByName1();
        // App app = new App();

        // int[] datos = {10, 20, 30, 40, 50};
        // int valorABuscar = 30;

        // int resultado = app.mB.busquedaLineal(datos, valorABuscar);
        // app.mB.printArray(datos);

        // if (resultado != -1) {
        //     System.out.println("Elemento encontrado en la posición: " + resultado);
        // } else {
        //     System.out.println("Elemento no encontrado.");
        // }
    }
}