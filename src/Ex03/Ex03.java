package Ex03;

public class Ex03 {
    public static void main(String[] args) {
        double[] faturamentoDiario = {200, 300, 400, 500, 0, 0, 700}; // Exemplo de valores
        double menorValor = Double.MAX_VALUE;
        double maiorValor = 0;
        double soma = 0;
        int diasComFaturamento = 0;

        // Loop para determinar o menor, maior faturamento e somar os valores
        for (double faturamento : faturamentoDiario){
            if(faturamento > 0){
                diasComFaturamento++;
                soma += faturamento;

                // Verifica se o faturamento atual é o menor já encontrado
                if (faturamento < menorValor){
                    menorValor = faturamento;
                }

                // Verifica se o faturamento atual é o maior já encontrado
                if(faturamento > maiorValor){
                    maiorValor = faturamento;
                }
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        // Loop para contar quantos dias tiveram faturamento acima da média
        for(double faturamento : faturamentoDiario){
            if(faturamento > media){
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorValor);
        System.out.println("Maior valor de faturamento: " + maiorValor);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
