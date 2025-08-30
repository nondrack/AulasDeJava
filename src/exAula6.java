import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class exAula6 {
    public static void main(String[] args) {
        String anotacoes = "Revisar Java para a prova de amanhã. Estudar sobre equals e for-each.";
        String palavraChave = "equals";
        Boolean contem = anotacoes.contains("equals");
        System.out.println("A anotação tem a palavra 'equals'? " + contem);
        System.out.println("---------------------------------------------------------");
        String senhaCorreta = "MinhaSenha123";
        String senhaDigitada = new String("MinhaSenha123");

        if (senhaCorreta == senhaDigitada){
            System.out.println("Senha correta");
        }else {
            System.out.println("Senha errada");
        }


        if (senhaCorreta.equals(senhaDigitada)){
            System.out.println("Senha correta");
        }else {
            System.out.println("Senha errada");
        }
        System.out.println("-------------------------------------------------------------");

        ArrayList<String> minhasMaterias = new ArrayList<String>();
        ArrayList<String> materiasDoAmigo = new ArrayList<String>();
        minhasMaterias.addAll(Arrays.asList( "Matemática", "Português", "História"));
        materiasDoAmigo.addAll(Arrays.asList("Matemática", "Português", "História"));

        if (minhasMaterias.equals(materiasDoAmigo)){
            System.out.println(" Os dois tem as mesmas materias ");
        }else {
            System.out.println("Possui materias diferentes ");
        }
        System.out.printf("-----------------------------------------");
        System.out.printf("*****************");
    }
}
