package aula2008;

import javax.swing.JOptionPane;

public class for9_MaiorValor {

	public static void main(String[] args) {
		int i;
		double v,r;
		
		r = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1° valor"));
		
		for (i=2;i<=10;i++)
		{
			v = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + i + "° valor"));
			
			if(v>r)
			{
				r = v;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O maior valor é:" + r);

	}

}
