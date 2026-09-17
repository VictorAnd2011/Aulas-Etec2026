import javax.swing.JOptionPane;
public class generovalido {

	public static void main(String[] args) {
		String G;
		
		G = JOptionPane.showInputDialog(null,"digite o seu gênero");

		if(G.equals("M") || G.equals("F"))
		{
			JOptionPane.showMessageDialog(null, "Válido");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Inválido");
		}
		
	}

}
