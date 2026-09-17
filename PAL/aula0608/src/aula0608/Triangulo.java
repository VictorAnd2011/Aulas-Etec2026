package aula0608;

import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
		double l1,l2,l3;
		
		l1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a medida do primeiro lado?"));
		
		l2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a medida do segundo lado?"));
		
		l3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a medida do terceiro lado?"));

		if(l1==l2 & l2 == l3)
		{
			JOptionPane.showMessageDialog(null, "Equilatero");
		}
		else
		{
			if(l1==l2 || l2 == l3 || l3 == l1)
			{
				JOptionPane.showMessageDialog(null, "Isósceles");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Escaleno");
			}
		}
	}

}
