
import javax.swing.JOptionPane;
public class Dirigir2 {

	public static void main(String[] args) {
	double id;
			
	id = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua idade:"));
	
	if (id>=18)
	{
		JOptionPane.showMessageDialog(null, "Pode dirigir");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Não pode dirigir");
	}
	}
}

   