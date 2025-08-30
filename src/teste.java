import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

public class teste {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de alunos :");
        Integer tamanho = leitor.nextInt();

        String[] nomes = new String[tamanho];
        Double[] notas = new Double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite os nomes do aluno :");
            nomes[i] = leitor.next();
            System.out.println("Digite a nota do aluno "+nomes[i]);
            notas[i]=leitor.nextDouble();
            System.out.println("Os alunos "+nomes[i]+" tiraram "+notas[i]);
        }

    }
}
