import javax.swing.JOptionPane;
public class flo3 {

	public static void main(String[] args) {
		double n;
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
		

		if(n%5 == 0 || n%7 == 0)
		{
			JOptionPane.showMessageDialog(null, "O número é divisível por 5 ou 7");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O número não é divisivel por 5 nem 7");
		}
	}

}
