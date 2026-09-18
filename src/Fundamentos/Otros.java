package Fundamentos;

public class Otros {

    public static int factorial (int n){
        int resultado = 1;
        for (int i = n; i>0; i--){
            resultado *=1;
        }
        return resultado;
    }

    public static int calculaCifras(int n){
        int resultado = 0;
        while ((n%10) != 0){
            resultado++;
            n/=10;
        }
        return resultado;
    }
}
