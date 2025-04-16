package Controllers;
import Controllers.MetodosBusqueda;
import Models.Persona;
import Views.ShowConsole;

public class MetodoBinario {
    private ShowConsole mostrar; 
    private Persona [] people;


    public MetodoBinario(Persona[] people){
        mostrar = new ShowConsole();
        MetodosBusqueda mB = new MetodosBusqueda(people);
        this.people = people;
        mostrar.showMessage("|-------------------------------- Métodos Binario --------------------------------|");
    }

    private int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length-1;
        while (alto >= bajo) {
            int central = (alto+bajo)/2;
            if (people[central].getCode()==code){
                return central;
            }
            if (people[central].getCode()>code){
                alto = central - 1;
            }else{
                bajo = central +1;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFind = mostrar.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0){
            mostrar.showMessage("Persona con código "+codeToFind+" encontrada en la posición "+indexPerson+ " -> "+people[indexPerson].toString());
        }else{
            mostrar.showMessage("Personsa no encontrada.");
        }
    }

    public static void ordenamiento(Persona [] people){
        for (int i=0; i < people.length; i++){
            int aux = i;
            for (int j = i + 1; j < people.length; j++){
                if (people[j].getName().compareToIgnoreCase(people[aux].getName()) < 0) {
                    aux=j;                    
                }
            }

            if (aux != i){
                Persona temp = people[i];
                people [i] = people [aux];
                people[aux] = temp;
            }
        }
    }

    public void showPersonByName1(){
        String nametoFind = mostrar.inputName();
        int indexName = findPersonByName(nametoFind);
        if (indexName <= 0){
            mostrar.showMessage("Persona con nombre "+nametoFind+" encontrada en la posición "+indexName+ " -> "+people[indexName].toString());
        }else{
            mostrar.showMessage("Personsa no encontrada.");
        }
    }

    public void printArray (Persona[] people){
        for (int i = 0; i < people.length; i++){
            System.out.print(people[i] + " ");
        }
        System.out.println();
    }

    private int findPersonByName(String name){
        ordenamiento(people);
        printArray(people);
        int bajo = 0;
        int alto = people.length-1;
        while (alto >= bajo) {
            int central = (alto+bajo)/2;
            if (people[central].getName().equalsIgnoreCase(name)){
                return central;
            }
            if (people[central].getName().compareTo(name)>0){
                alto = central - 1;
            }else{
                bajo = central +1;
            }
        }
        return -1;
    }
}
