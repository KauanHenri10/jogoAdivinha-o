import java.util.Scanner;
import java.util.Random;

public class Alunos {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(50) + 1;
        System.out.println("Um Número Aleatório foi gerado entre 1 e 100.");
        Scanner entrada = new Scanner(System.in);
        int tentativas = 0;
        int palpite = 0;
        boolean acertou = false;
        final int MAX_TENTATIVAS = 5;
        final int LIMITE_INFERIOR = 1;
        final int LIMITE_SUPERIOR = 50;
        System.out.println("Você tem " + MAX_TENTATIVAS + " tentativas para adivinhar o número. Boa sorte!");
        while (tentativas < MAX_TENTATIVAS && !acertou) {
            int tentativasRestantes = MAX_TENTATIVAS - tentativas;
            System.out.println("Digite seu palpite (" + LIMITE_INFERIOR + " a " + LIMITE_SUPERIOR + "): ");
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            palpite = entrada.nextInt();
            tentativas++;
            if (palpite < LIMITE_INFERIOR || palpite > LIMITE_SUPERIOR) {
                System.out.println("Por favor, insira um número entre " + LIMITE_INFERIOR + " e " + LIMITE_SUPERIOR + ".");
                continue;
            }
            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }
        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número era: " + numeroAleatorio);
        }
        entrada.close();
    }
}
