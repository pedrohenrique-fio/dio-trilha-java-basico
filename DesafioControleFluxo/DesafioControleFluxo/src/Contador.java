import java.util.Scanner;

public class Contador {
	    public static void main(String[] args) {
        /* Criação do scanner "terminal" e dos dois parâmetros */
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		/* Tentativa de inicializar o método contar, se "parametroUm > parametroDois", terá uma exceção chamada de 
        "ParametrosInvalidosException", que irá imprimir no terminal que o segundo parâmetro deve ser maior que o primeiro*/
		try {

			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
    /* criação do método contar, que irá jogar uma exceção se os parâmetros forem inválidos */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		/* validação dos parâmetros */
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
            
        }
		else {
            /* método executado caso os parâmetros estejam corretos */
		int contagem = parametroDois - parametroUm;
        System.out.println("O parametro um menos o parametro dois é igual a " + contagem + ", então contamos: ");

		/* início da estrutura de loop "for" */
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Número: " + i );
            
        }
        }
	}
}