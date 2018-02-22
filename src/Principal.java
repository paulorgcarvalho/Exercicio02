import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Professor professor1 = new Professor();

        System.out.println("Insira o nome do professor: ");
        professor1.nome = teclado.nextLine();

        System.out.println("Insira a titulação do professor (Mestre ou Doutor): ");
        professor1.titulacao = teclado.next();

        System.out.println("Insira o total de aulas: ");
        professor1.totalDeAulas = teclado.nextInt();

        System.out.println("Insira o valor da Hora/Aula");
        professor1.valorHoraAula = teclado.nextDouble();

        //-------------------------------Impressão do salario do professor-----------------------------------------
        System.out.println("Salario R$ " + professor1.calculaSalario());

        //-------------------------------Aumentando o valor hora aula do professor---------------------------------
        System.out.println("Insira a porcentagem de aumento do salario do professor (0-100): ");
        double porcentagem = teclado.nextDouble();

        professor1.ajustarValorHoraAula(porcentagem); //chamar o metodo e passar o parametro recebido do usuario

        System.out.println(professor1.calculaSalario());







        /*System.out.println(professor1.nome);
        System.out.println(professor1.titulacao);
        System.out.println(professor1.totalDeAulas);*/

    }
}
