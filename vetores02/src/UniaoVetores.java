import java.util.Scanner;

public class UniaoVetores {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o tamanho dos vetores (n): ");
        int n = leia.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];
     
        int[] Z = new int[2 * n]; 
        int contadorZ = 0;

        System.out.println("Preencha o vetor X:");
        for (int i = 0; i < n; i++) {
            X[i] = leia.nextInt();
        }

        System.out.println("Preencha o vetor Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = leia.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(Z, contadorZ, X[i])) {
                Z[contadorZ] = X[i];
                contadorZ++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(Z, contadorZ, Y[i])) {
                Z[contadorZ] = Y[i];
                contadorZ++;
            }
        }

        System.out.print("\nVetor União Z: ");
        for (int i = 0; i < contadorZ; i++) {
            System.out.print(Z[i] + " ");
        }
    }

    public static boolean existeNoVetor(int[] vetor, int tamanhoAtual, int valor) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
}