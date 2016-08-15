import java.awt.BorderLayout;
import java.util.Date;
import javax.swing.*;
import money.Expense;

public class Main {

	public static void main(String[] args) {
		Expense exp = new Expense(1f, new Date(),"hola");
		//Frame initialization
		JFrame frame = new JFrame("Start");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//---
		JLabel label1 = new JLabel(exp.get_Date_str());
		frame.getContentPane().add(label1, BorderLayout.CENTER);
		
		//---
		/*JTextField textfield1 = new JTextField("");
		frame.getContentPane().add(textfield1, BorderLayout.CENTER);
		*/
		//---Frame Adjusting
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
