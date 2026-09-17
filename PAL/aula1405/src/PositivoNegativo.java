import javax.swing.JOptionPane;
public class PositivoNegativo {

	public static void main(String[] args) {
		
		double v;
		
		v = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
		
		if (v>0)
		{
			JOptionPane.showMessageDialog(null, "Positivo");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Negativo");
		}
	}

	
}
