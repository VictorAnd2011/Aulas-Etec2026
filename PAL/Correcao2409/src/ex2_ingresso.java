import javax.swing.JOptionPane;

public class ex2_ingresso {

	public static void main(String[] args) {
		int id, j, pt=0;
		
		for(j=1;j<=3;j++)
		{
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a " + j + "° idade: "));
			
			
			if(id>12)
			{
				pt += 15;
			}
			else
			{
				if(id>=3)
				{
					pt += 10;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "O custo final foi de: " + pt);
		
	}

}
