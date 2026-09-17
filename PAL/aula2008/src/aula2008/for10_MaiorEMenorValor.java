package aula2008;

import javax.swing.JOptionPane;

public class for10_MaiorEMenorValor {

	public static void main(String[] args) {
		double v,m,n;
		int i;
		
		m =	Double.parseDouble(JOptionPane.showInputDialog(null, "digite o 1° valor"));
		
		
		n = m;
		
		for(i=2;i<=10;i++)
		{
			v =	Double.parseDouble(JOptionPane.showInputDialog(null, "digite o " + i +  "° valor"));
			
			if(v>m)
			{
				m = v;
			}
			if(v<n)
			{
				n = v;
			}
		}
		JOptionPane.showMessageDialog(null, "o menor valor é: " + n + ", e o maior valor é:" + m);
	}

}
