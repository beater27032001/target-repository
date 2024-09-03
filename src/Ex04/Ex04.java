package Ex04;

public class Ex04 {
    public static void main(String[] args) {
        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
        double[] faturamento = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

        double total = 0;

        // Calcula o total de faturamento
        for(double valor : faturamento){
            total += valor;
        }

        // Calcula e imprime o percentual de faturamento para cada estado
        for(int i =0; i < estados.length; i++){
            double percentual = (faturamento[i]/total) * 100;
            System.out.println(estados[i] + ": " + String.format("%.2f", percentual) + "%");
        }
    }
}
