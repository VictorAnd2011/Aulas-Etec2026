import javax.swing.JOptionPane;
public class flo2 {

	public static void main(String[] args) {
		double a;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano a ser analisado:"));
		
		if(a%400 == 0 || a%4 == 0 && !(a%100 == 0))
		{
			JOptionPane.showMessageDialog(null, "O ano é bisexto");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Não é bisexto");
		}
		
	}

}
