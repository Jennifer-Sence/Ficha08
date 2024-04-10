package Ex_06;

public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora( int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int adicao(){
        int resultado = num1 + num2;
        return resultado;
    }

    public int subtracao(){
        int resultado = num1 - num2;
        return resultado;
    }

    public int multiplicacao(){
        int resultado = num1 * num2;
        return resultado;
    }

    public int divisao(){
        int resultado = num1 / num2;
        return resultado;
    }
}
