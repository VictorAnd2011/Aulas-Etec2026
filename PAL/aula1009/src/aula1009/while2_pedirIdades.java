package aula1009;

import javax.swing.JOptionPane;

public class while2_pedirIdades {

	public static void main(String[] args) {
		int q=0, id;
		
		id = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));
		
		while(id > 0) {
			q++;
			id = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));
		}
		
		JOptionPane.showMessageDialog(null, q);
	}

}
