package ObserverExercisePart01;

import java.util.Calendar;

public class RevistaMarie implements Subject, Observer {
	
	Entregavel entregavel = new Entregavel();
	Calendar c = Calendar.getInstance();
	int semanal = c.getFirstDayOfWeek();

	@Override
	public void update(Entregavel pEntregavel) {
		// TODO Auto-generated method stub
		
	}
	
	public void iniciar() {
		if (semanal > 7) {
			assinaturaSemanal();
		}
	}
	
	public void assinaturaSemanal() {
		entregavel.setMensagem("Você possui assinatura Semanal");
		update(entregavel);
	}
	
	public void cancelarAssinatura() {
		System.out.println("Falimos!!");
		System.exit(0);
	}

}
