package aula1009;

import javax.swing.JOptionPane;

public class while3_generos {

	public static void main(String[] args) {
		int f=0,m=0;
		String d="sim", g;
		
		while(d.toLowerCase().equals("sim")) {
			
			g = JOptionPane.showInputDialog("Qual o gênero?(f ou m)");
			
			if (g.toLowerCase().equals("f")) {
				f++;
			}
			else {
				m++;
			}
			
			d = JOptionPane.showInputDialog("Deseja continuar?");
		}
		
		JOptionPane.showMessageDialog(null,"tem " + f + " mulheres e " + m + " homens");

	}

}
