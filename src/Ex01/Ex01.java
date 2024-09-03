package Ex01;

public class Ex01 {
    public static void main(String[] args) {
        int INDICIE = 13;
        int SOMA = 0;
        int K = 0;

        // Estrutura de repetição para realizar a soma
        while (K < INDICIE){
            K += 1;
            SOMA += K;
            System.out.println(SOMA);
        }
    }
}
