package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pacientes pc = new Pacientes();

        System.out.print("Nome do paciente: ");
        pc.nome = sc.next();
        System.out.print("Idade do paciente: ");
        pc.idade = sc.nextInt();

        double frenqMax = pc.frequenciaMax();
        double [] frenqAlvo = pc.frequenciaAlvo();

        System.out.println();
        System.out.println("----------- RELATÒRIO -----------");
        System.out.println("O paciente: " + pc.nome);
        System.out.println("A frequência máxima do paciente foi: " + frenqMax);
        System.out.println("O intervalo inicial do paciente foi: " + frenqAlvo[0]);
        System.out.println("O intervalo final do paciente foi: " + frenqAlvo[1]);

    }
}
