package exercicios;

import java.util.Scanner;

public class Exercicio010 {
    public void executar(Scanner input) {
        String nomeUsuario;
        String senha;

        String usuarioAdmin = "admin";
        String usuarioAluno = "aluno";
        String usuarioProfessor = "professor";
        String senhaAdmin = "1234";
        String senhaAluno = "0000";
        String senhaProfessor = "4321";
        boolean usuarioAutenticado = false;
        int numeroTentativas = 0;
        int limiteTentativas = 3;

        while ((numeroTentativas < limiteTentativas)
                && (usuarioAutenticado == false)) {
            System.out.println("TENTATIVA " + numeroTentativas);
            System.out.println();
            System.out.println("SISTEMA DE LOGIN UNA");
            System.out.println(); // Insere uma linha em branco

            System.out.print("USUÁRIO: ");
            nomeUsuario = input.next();

            System.out.println();
            System.out.print("SENHA: ");
            senha = input.next();
            // if aninhado
            if (nomeUsuario.equalsIgnoreCase(usuarioAdmin)) {
                if (senha.equals(senhaAdmin)) {
                    System.out.println();
                    System.out.println("Bem-vindo, administrador");
                    usuarioAutenticado = true;
                } else {
                    System.out.println();
                    System.out.println("Senha incorreta");
                    numeroTentativas = numeroTentativas + 1;
//                    numeroTentativas+=1;
                }
            } else if (nomeUsuario.equalsIgnoreCase(usuarioAluno)) {
                if (senha.equals(senhaAluno)) {
                    System.out.println();
                    System.out.println("Bem-vindo, aluno");
                    usuarioAutenticado = true;
                } else {
                    System.out.println();
                    System.out.println("Senha incorreta");
                    numeroTentativas = numeroTentativas + 1;
                }
            } else if (nomeUsuario.equalsIgnoreCase(usuarioProfessor)) {
                if (senha.equals(senhaProfessor)) {
                    System.out.println();
                    System.out.println("Bem-vindo, professor");
                    usuarioAutenticado = true;
                } else {
                    System.out.println();
                    System.out.println("Senha incorreta");
                    numeroTentativas = numeroTentativas + 1;

                }
            } else {
                System.out.println();
                System.out.println("Usuário não encontrado");
                numeroTentativas = numeroTentativas + 1;
            }


        }

        if (numeroTentativas >= limiteTentativas)
            System.out.println("Acesso bloqueado. Tente novamente mais tarde.");


    }
}


//        if (nomeUsuario.equalsIgnoreCase(usuarioAdmin)
//                && (senha.equals(senhaAdmin))) {
//
//        } else if (nomeUsuario.equalsIgnoreCase(usuarioAluno)
//                && (senha.equals(senhaAdmin))) {
//
//        } else if (nomeUsuario.equalsIgnoreCase(usuarioProfessor)
//                && (senha.equals(senhaAdmin))) {
//
//        }