public class AjusteSalario {
    public static void main(String[] args) {
        // Vetor de salários brutos
        double[] SalarioBruto = {1245.45, 1455.11, 1850.00};

        // Vetor para armazenar os salários líquidos
        double[] SalarioLiquido = new double[SalarioBruto.length];

        // Calcula os salários líquidos com desconto de 11%
        for (int i = 0; i < SalarioBruto.length; i++) {
            SalarioLiquido[i] = SalarioBruto[i] * (1 - 0.11);
        }

        // Exibe os salários líquidos
        System.out.println("Salários Líquidos:");
        for (double salario : SalarioLiquido) {
            System.out.printf("%.2f%n", salario);
        }
    }
}  