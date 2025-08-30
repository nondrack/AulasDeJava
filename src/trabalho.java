import java.awt.image.DataBufferUShort;
import java.util.Scanner;

public class trabalho {
    public static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Insira a quantidade de alunos: ");
        Integer tamanho = leitor.nextInt();

        String[] nomes = new String[tamanho];
        Double[] prova1 = new Double[tamanho];
        Double[] prova2 = new Double[tamanho];
        Double[] trabalho = new Double[tamanho];


        for (int i = 0; i <tamanho; i++) {
            System.out.print("Digite o nome do aluno :");
            nomes[i] = leitor.next();
        }

        prova1 = recebeNotas(nomes,"Prova 1 ");
        prova2 = recebeNotas(nomes,"Prova 2 ");
        trabalho = recebeNotas(nomes,"Trabalho ");

        Double[] media = mediafinal(prova1,prova2,trabalho);
        for (int i = 0; i < nomes.length; i++) {
            String resultado;
            if (media[i] >= 7.0){
                resultado = "Aprovado";
            }else {
                resultado = "Reprovado";
            }
            System.out.println("O aluno" + nomes[i]+ "ficou com a media" + media[i]+ "e foi " +resultado );

        }

    }

    public static Double[] recebeNotas(String[] nomes,String tipo){
        int tamanho = nomes.length;
        Double[] notas = new Double[tamanho];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe a nota de " + tipo+"do aluno " + nomes[i] + ": ");
            notas[i] = leitor.nextDouble();
        }
        return notas;
    }
    public static Double[] mediafinal(Double[] prova1, Double[] prova2, Double[]trabalho){
        Double[] array = new Double[prova1.length];
        for (int i = 0; i < prova1.length; i++) {
            Double soma;
            soma = (prova1[i]+prova2[i]+trabalho[i])/3;
            array[i] = soma;
        }
        return array;

    }



}
