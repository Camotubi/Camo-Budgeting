import java.awt.BorderLayout;
import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		//Frame initialization
		JFrame frame = new JFrame("Start");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//---
		JLabel label1 = new JLabel("Hola");
		frame.getContentPane().add(label1, BorderLayout.CENTER);
		
		//---
		JTextField textfield1 = new JTextField("");
		frame.getContentPane().add(textfield1, BorderLayout.CENTER);
		
		//---Frame Adjusting
		frame.pack();
		frame.setVisible(true);
		
	}

}
