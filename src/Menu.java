
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.GapContent;


public class Menu {
    public static void main(String[] args) {

        int choice = 0;
        Scanner keyboard = new Scanner(System.in);

        ArrayList<student> students = new ArrayList<student>();

        // Menu
        while (choice != 3) {
            System.out.println("<------------------------->");
            System.out.println("Menu");
            System.out.println("<------------------------->");
            System.out.println("1 - InserirAluno");
            System.out.println("2 - Mostrar Alunos");
            System.out.println("3 - Sair");
            choice = keyboard.nextInt();

            // Escolha graduado ou pos
            switch (choice) {
                case 1:

                    int choiceStudent = 0;
                    System.out.println("1 - Aluno da Graduação");
                    System.out.println(" 2 - Aluno da Pós Graduação");
                    choiceStudent = keyboard.nextInt();

                    switch (choiceStudent) {

                        // Criação aluno graduado
                        case 1:
                            GraduateStudent GraduateStudent = new GraduateStudent();

                            System.out.println("Nome do Aluno:");
                            GraduateStudent.setNome(keyboard.nextLine()); // duplicado para rodar na run
                            GraduateStudent.setNome(keyboard.nextLine());
                            System.out.println("Digite o RA do aluno:");
                            GraduateStudent.setRa(keyboard.nextLine());
                            System.out.println("Ano que finalizou o Ensino médio:");
                            GraduateStudent.setAnoConclusaoEnsinoMedio(keyboard.nextLine());
                            System.out.println("Digite o curso do Aluno:");
                            GraduateStudent.setCurso(keyboard.nextLine());
                            System.out.println("Nota AC1:");
                            GraduateStudent.setAc1(keyboard.nextDouble());
                            System.out.println("Nota AC2:");
                            GraduateStudent.setAc2(keyboard.nextDouble());
                            System.out.println("Nota AG:");
                            GraduateStudent.setAg(keyboard.nextDouble());
                            System.out.println("Nota AF:");
                            GraduateStudent.setAf(keyboard.nextDouble());
                            students.add(GraduateStudent);
                            break;

                        // criação aluno pos
                        case 2:
                            PostgraduateStudent PostgraduateStudent = new PostgraduateStudent();

                            System.out.println("Nome do Aluno:");
                            PostgraduateStudent.setNome(keyboard.nextLine());
                            PostgraduateStudent.setNome(keyboard.nextLine()); // duplicado para rodar na run
                            System.out.println("Digite o RA do aluno:");
                            PostgraduateStudent.setRa(keyboard.nextLine());
                            System.out.println("Digite o curso do Aluno:");
                            PostgraduateStudent.setCurso(keyboard.nextLine());
                            System.out.println("Ano que finalizou a Graduação:");
                            PostgraduateStudent.setAnoConclusaoGraduacao(keyboard.nextLine());
                            System.out.println("Nota 1:");
                            PostgraduateStudent.setNota1(keyboard.nextDouble());
                            System.out.println("Nota 2:");
                            PostgraduateStudent.setNota2(keyboard.nextDouble());
                            students.add(PostgraduateStudent);
                            break;

                    }
                    break;
                    //Imprimir informação do estudante
                case 2:
                    for (student s : students) {
                        System.out.println(s.toString());
                    }
                    break;
                    // fechar programa
                case 3:
                    System.out.println("O Programa encerrado!");
                    break;
                    // informar algo diferentede 1,2,3
                default:
                    System.out.println("Código Inválido!");
                    break;
            }
        }
        keyboard.close();
    }
}
