package Ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra para ser invertida:");
        String palavra = scan.nextLine();

        String textoInvertido = reverseString(palavra);
        System.out.println("String invertida: " + textoInvertido);
    }

    public static String reverseString(String str){
        //Cria um array de caracteres com o tamanho da string
        char[] chars = new char[str.length()];
        int length = str.length();

        // Preenche o array com os caracteres da string em ordem inversa
        for(int i =0; i < length; i++){
            chars[i] = str.charAt(length - 1 -i);
        }

        // Converte o array de caracteres para uma string
        String reversed = "";
        for(char c: chars){
            reversed += c;
        }

        return reversed;
    }

}
