package exercicio02;

public class Pacientes {

    String nome;
    int idade;

    public double frequenciaMax(){
        return 220 - idade;
    }

    public double [] frequenciaAlvo (){
        double [] alvo = new double[2];
        double fm = frequenciaMax();
        alvo[0] = fm * 0.5;
        alvo[1] = fm * 0.85;
        return alvo;
    }
}
