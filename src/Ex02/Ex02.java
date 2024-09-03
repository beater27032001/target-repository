package Ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scan.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(numero)){
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        }else{
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }


    }

    //Método para verificar se um número pertence à sequência de Fibonacci.
    public static boolean isFibonacci(int num){
        int a = 0;
        int b = 1;

        if(num == a || num == b) return true;

        // Calcula os próximos números da sequência até que o valor ultrapasse o número fornecido
        int next = a + b;
        while (next <= num){
            if(next == num) return true;
            a = b;
            b = next;
            next = a + b;
        }

        return false;
    }

}
