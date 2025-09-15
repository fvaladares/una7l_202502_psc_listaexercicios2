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
            } else {
                System.out.println();
                System.out.println("Senha incorreta");
            }
        } else if (nomeUsuario.equalsIgnoreCase(usuarioAluno)) {
            if (senha.equals(senhaAluno)) {
                System.out.println();
                System.out.println("Bem-vindo, aluno");
            } else {
                System.out.println();
                System.out.println("Senha incorreta");
            }
        } else if (nomeUsuario.equalsIgnoreCase(usuarioProfessor)) {
            if (senha.equals(senhaProfessor)) {
                System.out.println();
                System.out.println("Bem-vindo, professor");
            } else {
                System.out.println();
                System.out.println("Senha incorreta");
            }
        } else {
            System.out.println();
            System.out.println("Usuário não encontrado");
        }

        if ( nomeUsuario.equalsIgnoreCase(usuarioAdmin)
                && (senha.equals(senhaAdmin))) {

        }
    }
}
