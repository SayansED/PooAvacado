package ObserverExercisePart01;

import ObserverExercisePart01.JornalEstadao;

public class Joao extends Pessoa {

	// Assinatura
	JornalEstadao jornalEstadao = new JornalEstadao();
	Entregavel entregavel = new Entregavel();

	@Override
	public void update(Entregavel pEntregavel) {
		// TODO Auto-generated method stub
		
	}
	
	jornalEstadao.assinaturaFinaisSemana();
	
}
