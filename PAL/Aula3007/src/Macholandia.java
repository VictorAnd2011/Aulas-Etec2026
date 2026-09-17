import javax.swing.JOptionPane;

public class Macholandia {

	public static void main(String[] args) {
		String G;
		int Id;
		
		G = JOptionPane.showInputDialog(null,"digite o seu gênero (M ou F)");

		Id = Integer.parseInt(JOptionPane.showInputDialog(null,"digite a sua idade"));
		
		if(G.equals("M") && Id >= 16 || G.equals("F") && Id >= 18)
		{
			JOptionPane.showMessageDialog(null, "pode votar");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "não pode votar");
		}
	}

}
