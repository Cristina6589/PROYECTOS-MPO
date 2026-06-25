import java.util.Scanner;

public class Ejercicio {

    private Scanner lectorTeclado;
   //La saco fuera del primer metodo porque es muy posible que la llame desde otros

    public void ejercicio1(){
    /*Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
    bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
    €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
    bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
    redondeada a 2 decimales.*/
    //¡Divide y vencerás! Hay que ver el programa a realizar en pequeñas porciones
        lectorTeclado = new Scanner(System.in);
    // 1 -> Pedir cosas por teclado
        System.out.println("¿Cuántas bebidas quieres? ");
        // 2-> Guardar cosas en varibles
        int bebidas = lectorTeclado.nextInt();
        System.out.println("¿Cuántos bocadillos quieres? ");
        int bocadillos = lectorTeclado.nextInt();
        System.out.println("Precio de cada bebida: ");
        double precioBebida = lectorTeclado.nextDouble();
        System.out.println("Precio de cada bocadillo: ");
        double precioBocadillo = lectorTeclado.nextDouble();
        System.out.println("¿Cuántas personas han realizado la compra? ");
        int numeroPersonas = lectorTeclado.nextInt();
    // 3 -> Realizar cálculos
        
    // 4 -> Mostrar información


        lectorTeclado.close();


    }
}
