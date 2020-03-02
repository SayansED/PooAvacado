package ObserverExercisePart01;

public class PontoInicial implements Subject{

	public static void main(String[] args) {
		JornalEstadao jornalEstadao = new JornalEstadao();
		jornalEstadao.iniciar();
		RevistaMarie revistaMarie = new RevistaMarie();
		revistaMarie.iniciar();
	}
}
