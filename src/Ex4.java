
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {
    public static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> pecasEmEstoque = new ArrayList<String>();
        pecasEmEstoque.add("Filtro de ar");
        pecasEmEstoque.add("Pastilha de freio");
        pecasEmEstoque.add("Vela de inguinição");
        pecasEmEstoque.add("Oleo de motor");
        System.out.println("Essa são as peças atuais : "+pecasEmEstoque);
        pecasEmEstoque.add("Amortecedor");
        System.out.println("Chegou a peça nova :"+pecasEmEstoque);
        pecasEmEstoque.remove("Filtro de ar");
        System.out.println("O filtro de ar foi vendido" + pecasEmEstoque);
        System.out.println(pecasEmEstoque);

        System.out.println("Peça que deseja adicionar : ");
        pecasEmEstoque.add(leitor.next());
        System.out.println(pecasEmEstoque);
        System.out.println("Peças que eseja Remover");
        pecasEmEstoque.remove(leitor.next());

        System.out.println(pecasEmEstoque);
        System.out.println("Qual peça deseja remover ? ");
        Integer posicao = leitor.nextInt();
        System.out.println("Peça que deseja substituir : ");
        String substituir = pecasEmEstoque.set(posicao, leitor.next());
        System.out.println(pecasEmEstoque);



        Boolean estoque = pecasEmEstoque.contains("Pastilha de freio");
        if (estoque == true){
            System.out.println("Pastilha de frio esta disponivel em estoque !!!");
        }else {
            System.out.println("Pastilha de freio esgotada !!!");
        }
        if (pecasEmEstoque.contains("Correia dentada")){
            System.out.println("Correia dentada esta disponivel em estoque !!!");
        }else {
            System.out.println("Correia dentada esgotada !!!");
        }
        for(String peca : pecasEmEstoque){
            System.out.println(peca);
        }
        System.out.println("O numero de peças em estoque é : " +pecasEmEstoque.size()+ " Peças ");
        }


    }

