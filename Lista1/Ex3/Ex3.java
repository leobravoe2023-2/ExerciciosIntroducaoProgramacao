import java.util.Scanner;

public class MediaTresNumeros {
    public static void main(String[] args) {
        double numero1, numero2, numero3, media;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        numero3 = input.nextDouble();

        media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média entre " + numero1 + ", " + numero2 + " e " + numero3 + " é " + media + ".");
    }
}