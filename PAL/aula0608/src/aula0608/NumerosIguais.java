package aula0608;

import javax.swing.JOptionPane;

public class NumerosIguais {

	public static void main(String[] args) {
		double n1,n2;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o primeiro número"));
		
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o segundo número"));
		
		if(n1==n2)
		{
			JOptionPane.showMessageDialog(null, "Números iguais");
		}
		else
		{
			if(n1>n2)
			{
				JOptionPane.showMessageDialog(null, "Primeiro é maior");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Segundo é maior");
			}
		}

	}

}
