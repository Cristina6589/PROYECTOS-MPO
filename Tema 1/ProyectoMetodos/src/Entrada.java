public class Entrada {

    public static void main(String[] args) {
        System.out.println("Ejecución de métodos\n");
        saludar("Cristina");

        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(4,5);
        operacionesMatematicas.restar(9,3);
        operacionesMatematicas.multiplicacion(5,6);
        System.out.println("¿El número es válido? "+operacionesMatematicas.validarNumero(114));

        despedir();

    }

    public static void saludar(String data){
        System.out.println("Hola "+data);
        System.out.println("Buenos días");
        System.out.println("¿Qué tal estás?");
        System.out.println("¿Quieres un café?");
        System.out.println("Hoy vamos a realizar operaciones");
    }

    public static void despedir(){
        System.out.println("Hasta luego");
        System.out.println("Por hoy ya hemos terminado");
        System.out.println("Vamos a cerrar la clase");
    }
}