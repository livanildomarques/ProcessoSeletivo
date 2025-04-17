package candidatura;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		
		String[] candidatos = {"JOÃO", "MARIA","JOSÉ", "NAPOLEÃO", "PILATOS"};
		for(String candidato:candidatos) {
			entrandoEmContato(candidato);
		}
		
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando= true;
		boolean atendeu= false;
		
		do {
			atendeu=atender();
			continuarTentando = !atendeu; //método atender retorna false caso não seja igual a 1, logo ao negarmos o resultado false, ele torna-se true e entra novamente no loop
			if (continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO!");
		} while (continuarTentando && tentativasRealizadas<3);
		
		if (atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM "+ candidato+ " NA "+ tentativasRealizadas + " TENTATIVA\n");
		else 
			System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato + ", NUMERO DE TENTATIVAS: "+ tentativasRealizadas);
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirCandidatos() {
		String[] candidatos = {"JOÃO", "MARIA","JOSÉ", "NAPOLEÃO", "PILATOS"};
		
		
		System.out.println("IMPRIMINDO A LISTA DE CANDIDATOS INFORMANDO O INDICE DO ELEMENTO");
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato N°"+ (indice+1) + " é "+ candidatos[indice]);
		}
		
		for (String candidato:candidatos) {
			System.out.println("O CANDIDATO SELECIONADO FOI " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String[] candidatos = {"JOÃO", "MARIA","JOSÉ", "NAPOLEÃO", "PILATOS", "NEWTON", "FREUD", "JACÓ", "DA VINCI", "JULIO"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual=0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length ) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.printf("\nO CANDIDATO "+ candidato+ " SOLICITOU %.2f", salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O CANDIDATO " + candidato + " FOI SELECIONADO PARA A VAGA!");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
		
		
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if (salarioBase>salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO!");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
		} else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS!");
		}
	}
}
