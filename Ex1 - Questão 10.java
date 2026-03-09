import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);

        System.out.println("Insira a quantidade de ingressos inteiros vendidos:");
        int qntIng = keyboard.nextInt();
        System.out.println("Insira a quantidade de ingressos meia-entrada vendidos:");
        int qntIngM = keyboard.nextInt();

        double[] valorInt = new double[qntIng];
        double[] valorMeia= new double[qntIngM];

        System.out.println("Insira o valor dos " + qntIng + " ingressos inteiros comprados:");
        for(int i = 0; i < qntIng; i++){
            String s = keyboard.next(); // ler como string o numero que pode ter virgula
            double v = Double.parseDouble(s.replace(',', '.')); // converter a string para double passando virgyla pra ponto
            valorInt[i] = v;
        }

        System.out.println("Insira o valor dos " + qntIngM + " ingressos meia-entrada comprados:");
        for(int i = 0; i < qntIngM; i++){
            String s = keyboard.next();
            double v = Double.parseDouble(s.replace(',', '.'));
            valorMeia[i] = v;
        }
        double somaIng = 0;
        double somaIngM = 0;

        for(int i =0; i<qntIng; i++){
            somaIng += valorInt[i];
        }
        for(int i = 0; i<qntIngM; i++){
            somaIngM += valorMeia[i];
        }

        double valorTot = somaIng + somaIngM;
        double media = valorTot / (qntIng + qntIngM);

        System.out.println("Valor dos ingressos inteiros: " + somaIng);
        System.out.println("Valor dos ingressos meia-entrada: " + somaIngM);
        System.out.println("Valor total: " + valorTot);
        System.out.println("Valor medio por ingresso: " + media);

        keyboard.close();
    }
}

/* Você e seus amigos foram ao cinema e querem calcular o valor arrecadado na última sessão. Você precisa colher as informações da quantidade de ingressos de meia-entrada e entrada inteira, também precisa colher os valores dos dois tipos de ingressos.
O usuário pode digitar os valores dos ingressos usando vírgula ou ponto e uma das suas funções como programador é tratar esse evento.

Faça um programa que:
Receba a quantidade de cada tipo de ingresso e seus respectivos valores fornecidos pelo usuário.
Calcule o total arrecadado com ingressos inteiros.
Calcule o total arrecadado com meia-entrada.
Calcule o valor total arrecadado na sessão.
Calcule o valor médio pago por ingresso.
Imprima todos os resultados na tela.
 */
