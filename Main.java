import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário quantos preços ele deseja somar
        System.out.print("Quantos preços você deseja somar? ");
        int quantidadeDePrecos = scanner.nextInt();

        // chama o método para somar os preços
        double total = somarPrecos(quantidadeDePrecos);

        // Imprime o total na tela
        System.out.println("O total dos preços é: " + total);

        scanner.close();
    }

    // Método para somar os preços
    public static double somarPrecos(int quantidade) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        // Lê e soma os preços
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o preço #" + i + ": ");
            double preco = scanner.nextDouble();
            total += preco;
        }

        // Retorna o total dos preços
        return total;
    }
}