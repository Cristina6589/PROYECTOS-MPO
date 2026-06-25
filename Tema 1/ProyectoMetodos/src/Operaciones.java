public class Operaciones {

    public void sumar(int operando1, int operando2){
        int resultado = operando1 + operando2;
        System.out.println("El resultado de la suma es: "+resultado);
    }

    public void restar(int operando1, int operando2){
        int resultado = operando1 - operando2;
        System.out.println("El resultado de la resta es: "+resultado);
    }

    public int multiplicacion(int operando1, int operando2){
        int resultado = operando1 * operando2;
        System.out.println("El resultado de la multiplicacion es: "+resultado);
        // Al final del metodo, en la última línea, tengo que decir que retorna
        return resultado;
    }

    public boolean validarNumero(int numero){
        return numero>10;

    }
}
