import javax.swing.JOptionPane;
public class flo1 {

	public static void main(String[] args) {
		String t1,t2;
		double g1,g2;
		
		t1 = JOptionPane.showInputDialog("Digite o nome do primeiro time:");
		t2 = JOptionPane.showInputDialog("Digite o nome do segundo time:");
		
		g1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de gols do primeiro time:"));
		g2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de gols do segundo time:"));
		
		
		if(g1>g2)
		{
			JOptionPane.showMessageDialog(null, "Quem ganhou foi: " + t1);
		}
		else
		{
			if(g2>g1)
			{
				JOptionPane.showMessageDialog(null, "Quem ganhou foi: " + t2);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "O jogo terminou em empate");
			}
		}
	}

}
