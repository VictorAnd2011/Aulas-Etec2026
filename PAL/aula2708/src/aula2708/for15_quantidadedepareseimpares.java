package aula2708;

import javax.swing.JOptionPane;

public class for15_quantidadedepareseimpares {

	public static void main(String[] args) {
		int i,v,p=0,m=0;
		
		for(i=1;i<=10;i++)
		{
			v =	Integer.parseInt(JOptionPane.showInputDialog(null, "digite o " + i + "° valor"));
			
			if(v%2==0)
			{
				p=p+1;
			}
			else
			{
				m=m+1;
			}
		}

		JOptionPane.showMessageDialog(null, "tem " + p + " pares e " + m + " impáres");
	}

}
