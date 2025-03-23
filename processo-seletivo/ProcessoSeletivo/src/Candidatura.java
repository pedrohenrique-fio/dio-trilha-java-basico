import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatura {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
        String [] candidatos = {"João","Maria","Pedro","Ana","Lucas","Sofia","Miguel", "Beatriz","Rafael","Gabriela" };
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
        /* executa o método */
        selecaoCandidatos();
    
       
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;
            else
            System.out.println("CONTATO ESTABELECIDO");


        }
        while(continuarTentando && tentativasRealizadas<3);
        
        if(atendeu) 
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " REALIZADAS ");

    }
    
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static void selecaoCandidatos() {
        /* array com o nome de todos os candidatos */
        String [] candidatos = {"João","Maria","Pedro","Ana","Lucas","Sofia","Miguel", "Beatriz","Rafael","Gabriela" };
    /* impressão da lista de candidatos selecionados */
    System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
    
    for(int i = 0; i < candidatos.length; i++) {
        System.out.println("O candidato de num " + (i+1) + " é o(a) " + candidatos[i]);
     /* impressão da lista de candidatos selecionados mas abreviada pelo for each */
        for (String candidato: candidatos)
            System.out.println("O candidato selecionado foi " + candidato);
    }
     
    /* início  do loop de verificação de verificação do salario pretendido dos candidatos e de quais candidatos foram selecionados */
    int candidatosSelecionados = 0;
    int candidatosAtuais = 0;
    double salarioBase = 2000.0;
    while(candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
        String candidato = candidatos[candidatosAtuais];
        double salarioPretendido = valorPretendido();
        System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
        if (salarioBase >= salarioPretendido) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
        }
        candidatosAtuais++;
    }
}

    /* método de randomificação de número para os candidatos */
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }



/* método antigo 
    static void AnalisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) 
              System.out.println("LIGAR PARA O CANDIDATO");
              else if (salarioBase==salarioPretendido)
              System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
              else 
              System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");

    }
    */
}
