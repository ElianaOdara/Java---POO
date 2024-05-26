package br.inatel.teoria.exercicio;

import java.util.Scanner;
import java.util.InputMismatchException;
import br.inatel.teoria.Exceptions.ValoresInvalidosExceptions;

public class Main {

    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        //vetor auxiliar de rede social
        RedeSocial[] redeSociais = new RedeSocial[2];

        //instanciando duas redes Sociais Para o usuario 1
        //criando(Instanciando) facebook
        Facebook fbUser1 = new Facebook();
        fbUser1.setSenha("senha123");
        fbUser1.setNumAmigos(13);

        //criando(Instanciando) Instagram
        Instagram instaUser1 = new Instagram();
        instaUser1.setSenha("123Senha");
        instaUser1.setNumAmigos(15);

        //alocando as redes sociais que serão do user 1 no vetor auxliar
        redeSociais[0] = fbUser1;
        redeSociais[1] = instaUser1;

        //criando usuario com as redes sociais
        Usuario user1 = new Usuario(redeSociais);
        user1.setEmail("Eliana@inatel.br");
        user1.setNome("Eliana");

        boolean controle = true;
        while (controle) {
            System.out.println("1- ver redes sociais do usuario:");
            System.out.println("2- sair");
            try {
                System.out.println("Informe a opção desejada:");
                int opcao = entradaDeDados.nextInt();
                if (opcao < 1 || opcao > 2) {
                    throw new ValoresInvalidosExceptions(); // Lançando a exceção
                }
                switch (opcao) {
                    case 1:
                        //mostra os métodos de cada uma das redes sociais do usuario
                        user1.mostrarInfos();
                        break;
                    case 2:
                        controle = false;
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor, informe um número inteiro, Letras não são aceitas.");
                // Limpar o buffer do Scanner para evitar loop infinito
                entradaDeDados.nextLine();
            } catch (ValoresInvalidosExceptions e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
