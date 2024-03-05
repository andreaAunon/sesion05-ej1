package es.neesis.annotations.applications;

import es.neesis.annotations.services.*;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Menu {

    private IOperationService operationService;

    public int realizeOperation(int operando1, int operando2) {
        return operationService.realizeOperation(operando1, operando2);
    }

    public void showMenu() {
        System.out.println("Bienvenido a la calculadora, selecciona una operación:");
        System.out.println("Sumar");
        System.out.println("Restar");
        System.out.println("Multiplicar");
        System.out.println("Dividir");
        System.out.println("Salir");
        System.out.println("Seleccione una operación:");

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        if(!(operation.equals("Salir") || operation.equals("salir"))){
            System.out.println("Introduzca primer operando: ");
            int operando1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Introduzca segundo operando: ");
            int operando2 = Integer.parseInt(scanner.nextLine());

            createOperation(operation, operando1, operando2);
        }
    }

    private void createOperation(String operation, int operando1, int operando2){
        switch (operation){
            case "sumar":
                operationService = new AddService();
                break;
            case "restar":
                operationService = new SubService();
                break;
            case "multiplicar":
                operationService = new MulService();
                break;
            case "dividir":
                operationService = new DivService();
                break;
            default:
                break;
        }

        realizeOperation(operando1,operando2);
    }

}
