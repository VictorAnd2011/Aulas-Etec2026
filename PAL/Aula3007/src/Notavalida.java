import javax.swing.JOptionPane;

public class Notavalida {

	public static void main(String[] args) {
		double N;
		
		N = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a sua nota"));
		
		if (N>=0 && N<=10)
		{
			JOptionPane.showMessageDialog(null,"válido");
		}	
		else
		{
			JOptionPane.showMessageDialog(null, "inválido");
		}		
	}

}
