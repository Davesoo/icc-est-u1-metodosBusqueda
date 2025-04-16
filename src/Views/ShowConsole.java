package Views;
import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner;
    public ShowConsole(){
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner (){
        System.out.println("|------------------------------ Métodos de busqueda ------------------------------|");
        
    }

    public int inputCode(){
        System.out.print("Ingrese un código: ");
        System.out.println();
        int code = scanner.nextInt();
        return code;
    }

    public String inputName(){
        System.out.print("Ingrese un nombre: ");
        System.out.println();
        String name = scanner.next();
        return name;
    }

    public void showMessage (String message){
        System.out.println(message);
    }
}
