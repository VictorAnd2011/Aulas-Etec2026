package aula2008;

import javax.swing.JOptionPane;

public class for8_media10notas {

	public static void main(String[] args) {
		int i;
		double v,m,r=0;
		
		for(i=1;i<=10;i++)
		{
			v =	Double.parseDouble(JOptionPane.showInputDialog(null, "digite a " + i +  "° nota"));
			r = r + v;
		}
		
		m = r/10;
		
		JOptionPane.showMessageDialog(null, "A média é: " + m);

	}

}
