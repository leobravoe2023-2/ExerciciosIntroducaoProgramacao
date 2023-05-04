import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + resultado + ".");
    }
}



