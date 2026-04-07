import java.util.Scanner;

public class InverterVetor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do vetor (n): ");
        int n = leia.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            X[i] = leia.nextInt();
        }

        for (int i = 0; i < n; i++) {
            Y[i] = X[n - 1 - i];
        }

        System.out.print("\nVetor Y (Inverso): ");
        for (int i = 0; i < n; i++) {
            System.out.print(Y[i] + " ");
        }
    }
}