package ObserverExercisePart01;

import java.util.Calendar;

public class JornalEstadao implements Subject, Observer {
	
	Entregavel entregavel = new Entregavel();
	Calendar c = Calendar.getInstance();
	int diario = c.getFirstDayOfWeek();
	int finalSemana = c.getFirstDayOfWeek();
	
	@Override
	public void update(Entregavel pEntregavel) {
		// TODO Auto-generated method stub
		
	}
	
	public void iniciar() {
		if (diario != 0) {
			assinaturaDiaria();
		}
		else if (finalSemana > 7) {
			assinaturaFinaisSemana();
		}
	}
	
	public void assinaturaDiaria() {
		entregavel.setMensagem("Você possui assinatura Diaria");
		update(entregavel);
	}
	
	public void assinaturaFinaisSemana() {
		entregavel.setMensagem("Você possui assinatura Final de Semana");
		update(entregavel);
	}
	
	public void cancelarAssinatura() {
		System.out.println("Falimos!!");
		System.exit(0);
	}

}
