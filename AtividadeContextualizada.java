/**
 * AtividadeContextualizada
 */
public class AtividadeContextualizada {

    public static int som(int x, int y){
        int soma = x + y;
        return soma;
    }

    public static int sub(int x, int y){
        int subtracao = x - y;
        return subtracao;
    }

    public static int mult(int x, int y){
        int resultado = x * y;
        return resultado;
    }


    public static float div(int x, int y){
        float resultado = x / y;
        return resultado;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int soma = som(a, b);
        int subtracao = sub(soma, b);
        int multiplicacao = mult(subtracao, b);
        float divisao = div(multiplicacao, b);

        System.out.println(divisao);
    }
}