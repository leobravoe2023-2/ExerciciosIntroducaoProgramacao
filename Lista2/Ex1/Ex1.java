public class SomaVetor {
    public static void main(String[] args) {
        int[] numeros = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos números no vetor é " + soma + ".");
    }
}