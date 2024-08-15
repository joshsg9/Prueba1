package ui;
import model.Calculator;
import java.util.Scanner;

public class Ejecutable {


    private Scanner reader;
    private Calculator cont;

    // Constructor
    public Ejecutable() {
        reader = new Scanner(System.in); // Scanner creado.
        cont = new Calculator();
    }

    public static void main(String[] args) {
        Ejecutable mainApp = new Ejecutable();
        ;
        mainApp.menu();
    }

    public void menu() {
        while (true) {
            System.out.println("Select one of the following menus: \n[1] Hacer suma. \n[2] Hacer resta. \n[3] Hacer multiplicacion. \n[4] Hacer division. \n[5] Exit the system.");
            int initialSelection = reader.nextInt();

            switch (initialSelection) {
                case 1:
                    hacerSuma();
                    break;
                case 2:
                    hacerResta();
                    break;
                case 3:
                    hacerMultiplicacion();
                    break;
                case 4:
                    hacerDivision();
                    break;
                case 5:
                    System.out.println("Thank you for using MY CALCULATOR!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option, please enter a correct option.");
                    break;
            }
        }
    }

    public void hacerSuma(){
        System.out.println("Ingrese el primer numero");
        int a = reader.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = reader.nextInt();
        int result = cont.suma(a, b);
        System.out.println(result);
    }

    public void hacerResta(){
        System.out.println("Ingrese el primer numero");
        int a = reader.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = reader.nextInt();
        int result = cont.resta(a, b);
        System.out.println(result);
    }

    public void hacerDivision(){
        System.out.println("Ingrese el primer numero");
        int a = reader.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = reader.nextInt();
        int result = cont.division(a, b);
        System.out.println(result);
    }

    public void hacerMultiplicacion(){
        System.out.println("Ingrese el primer numero");
        int a = reader.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = reader.nextInt();
        int result = cont.multiplicacion(a, b);
        System.out.println(result);
    }

}