package br.inatel.poo.turmas;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double calculaMedia(){
        double soma=0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        };
        double media = soma/notas.length;
        return media;
    }

    public void mostraInfo(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matricula do aluno: " + matricula);
        System.out.println("Notas do aluno: ");
        for(int i = 0; i < notas.length; i++){

        }
    }
}
