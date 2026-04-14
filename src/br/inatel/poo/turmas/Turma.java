package br.inatel.poo.turmas;
import java.util.ArrayList; // pra criar uma lista
public class Turma {
    private int quantidadeAlunos = 0;
    private ArrayList<Aluno> alunos = new ArrayList<>();; // lista de alunos da turma (agregação)

    public void adicionarAluno(Aluno a) {
        alunos.add(a);
        quantidadeAlunos++;
    }

    public void listarAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Nome: " + alunos.get(i).getNome() +
                    " Matricula: " + alunos.get(i).getMatricula());
        }
    }

    public void buscarMelhorAluno() {
        Aluno melhorAluno = alunos.get(0);
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).calculaMedia() > melhorAluno.calculaMedia()) {
                melhorAluno = alunos.get(i);
            }
        }
        System.out.println("MELHOR ALUNO: ");
        System.out.println("Nome: " + melhorAluno.getNome() +
                " Media: " + melhorAluno.calculaMedia());
    }
}
