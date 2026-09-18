package Fundamentos;

public class calculadora {

    private int op1;
    private int op2;

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op1 = op2;
    }

    public int suma() {
        return op1 + op2;
    }

    public int resta(){
        if (op1<op2){
            System.err.println("Error, el segundo operador debe de ser menor que el primero");
        }
        return op1 - op2;
    }

    public int multiplicacion(){
        return op1 * op2;
    }

    public int division(){
        if (op2 == 0){
            System.err.println("Error, no se puede dividir entre 0");
        }
        return op1 / op2;
    }

    public double raiz1(){
        return Math.sqrt(op1);
    }

    public double raiz2(){
        return Math.sqrt(op2);
    }

    public double potenciaBiblio(){
        return Math.pow(op1, op2);
    }

    public double potencia(){
        int resultado = 0;
        for (int i = 0; i<op2; i++){
        }
        return resultado *= op1;
    }
}
