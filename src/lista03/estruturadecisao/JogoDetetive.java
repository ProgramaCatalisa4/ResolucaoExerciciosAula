package lista03.estruturadecisao;

import java.util.*;

public class JogoDetetive {
    public static void main(String[] args) {
        Scanner respostaUsuario = new Scanner(System.in);
        System.out.println("Telefonou para a vítima? S/N");
        String resposta1 = respostaUsuario.next();

        List<Integer> listaDeSim = new ArrayList<>();

        if (resposta1.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inválida, tente novamente");
            System.exit(0);
        }

        System.out.println("Esteve no local do crime? S/N");
        String resposta2 = respostaUsuario.next();

        if (resposta2.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inválida, tente novamente");
            System.exit(0);
        }

        System.out.println("Mora perto da vítima? S/N");
        String resposta3 = respostaUsuario.next();
        if (resposta3.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inválida, tente novamente");
            System.exit(0);
        }

        System.out.println("Devia para a vítima? S/N");
        String resposta4 = respostaUsuario.next();
        if (resposta4.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inválida, tente novamente");
            System.exit(0);
        }

        System.out.println("Já trabalhou com a vítima? S/N");
        String resposta5 = respostaUsuario.next();
        if (resposta5.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inválida, tente novamente");
            System.exit(0);
        }
        respostaUsuario.close();


        if (listaDeSim.size() == 5) {
            System.out.println("Você é o assassino");
        } else if ((listaDeSim.size() >= 3) && (listaDeSim.size() < 5)) {
            System.out.println("Você é cúmplice");
        } else if (listaDeSim.size() == 2) {
            System.out.println("Você é suspeito");
        } else {
            System.out.println("Você é inocente");
        }

    }
}
