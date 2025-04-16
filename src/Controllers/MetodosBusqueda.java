package Controllers;

import Models.Persona;
import Views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona [] people;

    public MetodosBusqueda(Persona [] personas){
        showConsole = new ShowConsole();
        this.people = personas;
        showPerson();
    }

    public int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void printArray (int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public String findPersonByName(String name){
        return "-1";
    }

    // public void showPersonByName(){
    //     String nameToFind = showConsole.inputName();
    //     String indexName = findPersonByName(nameToFind);
    //     if (indexName.eq()){
    //         showConsole.showMessage("Persona con nombre "+nameToFind+" encontrada en la posición "+indexName+ " -> ");
    //     }else{
    //         showConsole.showMessage("Personsa no encontrada.");
    //     }
    // }

    public void showPerson(){
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson > 0){
            showConsole.showMessage("Persona con código "+codeToFind+" encontrada en la posición "+indexPerson+ " -> ");
            showConsole.showMessage(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Personsa no encontrada.");
        }
    }
}
