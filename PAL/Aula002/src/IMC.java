import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
	double A,P,IMC;
		
	A = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
    P = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
	IMC = P/ (A * A);
	JOptionPane.showMessageDialog(null, "O seu IMC é de: " + IMC);

	}

}
