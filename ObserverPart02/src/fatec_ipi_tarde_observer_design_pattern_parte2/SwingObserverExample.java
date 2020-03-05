package fatec_ipi_tarde_observer_design_pattern_parte2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	
	JFrame frame;
	public static void main(String[] args) {
		SwingObserverExample exemplo = new SwingObserverExample();
		exemplo.go();
	} public void go (){
		frame = new JFrame ();
		JButton button = new JButton ("Fazer ou não?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setVisible(true);
	}
} class AngelListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Não faça!!!");
	}
} class DevilListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Faça sim!!!! hehehehe");
	}
}