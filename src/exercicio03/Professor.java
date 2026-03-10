package exercicio03;

// Commit com o exercicio03 finalizado!
public class Professor {
    String nome;
    int totalDeAulas;
    double valorDaAula;

    public double calcularSalario() {
        double salarioBase;
        double horaAtividade;
        double descansoSemanal;

        salarioBase = totalDeAulas * valorDaAula * 4.5;
        horaAtividade = salarioBase * 0.05;
        descansoSemanal = (salarioBase + horaAtividade) / 6;

        return salarioBase + horaAtividade + descansoSemanal;
    }
}
