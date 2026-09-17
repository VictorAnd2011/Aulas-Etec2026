import javax.swing.JOptionPane;
public class Nota2 {

	public static void main(String[] args) {
		double nota;

		
		nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
		
		if(nota < 0 || nota > 10)
		{
			JOptionPane.showMessageDialog(null, "a nota é inválida");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "a nota é válida");
		}
	}

	
	
}
