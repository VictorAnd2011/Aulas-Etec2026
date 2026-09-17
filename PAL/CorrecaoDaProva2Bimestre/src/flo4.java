import javax.swing.JOptionPane;
public class flo4 {

	public static void main(String[] args) {
		double n,f;
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno (de 0 a 10):"));
		f = Double.parseDouble(JOptionPane.showInputDialog("Digite a frequência do aluno (de 0 a 100):"));
		
		if(n >= 6 && f >=75)
		{
			JOptionPane.showMessageDialog(null, "Aprovado");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Retido");
		}
		
		
	}

}
