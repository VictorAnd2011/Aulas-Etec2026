package aula2708;

import javax.swing.JOptionPane;

public class for13_tabuadaVariavel {

	public static void main(String[] args) {
		int i,v;
		
		v =	Integer.parseInt(JOptionPane.showInputDialog(null, "digite um valor"));
		

		for(i=1;i<=10;i++)
		{
			System.out.println(v+"x" + i + "=" + i*v);
		}
	}

}
