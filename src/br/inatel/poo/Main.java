package br.inatel.poo;
import br.inatel.poo.turmas.Turma;
import br.inatel.poo.turmas.Aluno;
public class Main {
    public static void main(String[] args) {

    Turma turma1 = new Turma();

    Aluno a1 = new Aluno("Paulo Ricardo", "690",new double[]{6.5, 8.0, 8.0});
    Aluno a2 = new Aluno("Daniel Granato", "661", new double[]{7.0, 5.7, 9.0});
    Aluno a3 = new Aluno("Lucas Godoi", "670", new double[]{9.0, 7.8, 9.6});

    turma1.adicionarAluno(a1);
    turma1.adicionarAluno(a2);
    turma1.adicionarAluno(a3);

    turma1.listarAlunos();
    turma1.buscarMelhorAluno();

    }
}
