package aula2008;

import javax.swing.JOptionPane;

public class for7_somaDosValores {

	public static void main(String[] args) {
		int i;
		double v,r=0;
		
		for(i=1;i<=10;i++)
		{
			v =	Double.parseDouble(JOptionPane.showInputDialog(null, "digite o " + i +  "° valor"));
			r = r + v;
		}
		
		JOptionPane.showMessageDialog(null, "A soma total é: " + r);

	}

}
