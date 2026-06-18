public class Entrada {
    public static void main(String[] args) {
        System.out.println("Ejecución de métodos");
        saludar("Cristina");
        saludar("Mariana");
        saludar("Imperio");
        despedir();
    }

    public static void saludar(String data){
        System.out.println("Hola "+data);
        System.out.println("Buenos días");
        System.out.println("¿Qué tal estás?");
        System.out.println("¿Quieres un café?");
        System.out.println("Este método se va a repetir en el saludo");
    }

    public static void despedir(){
        System.out.println("Hasta luego");
        System.out.println("Por hoy ya hemos terminado");
        System.out.println("Vamos a cerrar la clase");
    }
}