public class Professor {
    String nome;
    String titulacao;
    double valorHoraAula;
    int totalDeAulas;

    public double calculaSalario(){
        double salarioBase, horaAula, descansoSemanalRemunerado;

        salarioBase = valorHoraAula * 4.5;

        if(titulacao.equalsIgnoreCase("mestre")){       //Comparar String, usar metodos .equals e equals.IgnoreCase
            salarioBase *= 1.03;    //Calculo de porcentagem caso "Mestre" (3%)
        } else {
            salarioBase *= 1.085;  //Calculo de porcentagem caso "Doutor" (8.5%)
        }
        horaAula = salarioBase * 0.05; //5% do salario base

        descansoSemanalRemunerado = (salarioBase + horaAula)/6;

        return salarioBase + horaAula + descansoSemanalRemunerado; //poderia criar uma variavel pra armazenar este calculo.
    }

    public void ajustarValorHoraAula(double porcentagem){
        valorHoraAula *= (1+porcentagem/100);  // 1 + 0.2 = 1.2 = 20%
    }

    public String retornaDados(){
        return nome;
    }
}
