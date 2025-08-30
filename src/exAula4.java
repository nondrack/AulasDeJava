import java.util.ArrayList;

public class exAula4 {
    public static void main(String[] args) {
        ArrayList <String> frutas = new ArrayList<String>();
        Boolean contemMaça = false;
        frutas.add("manga");
        frutas.add("banana");
        frutas.add("laranja");
        System.out.println("Lista inicial "+frutas);

        frutas.add(2,"Morango");
        frutas.remove("laranja");
        System.out.println("Lista auterada "+frutas + " e o tamanho da lista é "+frutas.size());

        for (int i = 0; i <frutas.size() ; i++) {
            if (frutas.get(i) == "maça"){
                contemMaça = true;
            }
        }
            if (contemMaça == true){
                System.out.println(" o array contem maça !!!!");
            }else {
                System.out.println(" o array list não contem maça !!!");
            }
            for(String fruta : frutas){
                System.out.println(fruta);
            }

    }

}
