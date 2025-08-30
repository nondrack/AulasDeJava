import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero;
        for (Integer x=0; x<10; x++){
            do {
                System.out.printf("Digite um numero");
                numero = leitor.nextInt();
            }while (numero < 0);

    }   }
}
