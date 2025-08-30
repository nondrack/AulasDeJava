import java.util.Scanner;

public class RecebendoValores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe seu nome");
        String nome = leitor.nextLine();
        System.out.printf("Informe o nome ea idade "+nome+ " : ");
        Integer idade = leitor.nextInt();
        System.out.printf("o nome é " + nome);
    }
}
