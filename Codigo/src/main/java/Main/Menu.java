package Main;
import org.example.Camion;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

    static Scanner sn = new Scanner(System.in);


    public static void iniciar() {
        Camion camion = new Camion();
        int aux=10;
        while (aux != 0) {
            System.out.println("Ingrese el numero correspondiente a lo que desea hacer:\n1.-Mostrar datos del Camion.\n2.-Cambiar datos del Camion\n0.-Salir");
            aux = sn.nextInt();
            if (Objects.requireNonNull(aux) == 1) {
                System.out.println("Datos del camion:\nChofer: "+camion.getChofer()+"\nPatente: "+camion.getPatente()+"\n");
            } else if (aux == 2) {
                System.out.println("Ingrese los nuevos datos del camion\nNombre del Chofer: ");
                camion.setChofer(sn.next());
                System.out.println("Nueva Patente:");
                camion.setPatente(sn.next());
            } else if (aux==0){
                System.out.println("Adios!!");
            } else {
                System.out.println("Se ha ingresado un valor no correspondiente");
            }
        }
    }

    public static void validarIniciar() {
        try {
            iniciar();
        }catch (InputMismatchException e){
            System.out.println("Se ingresó un valor no correspondiente\nPor favor, intentelo nuevamente");
        }
    }
}
