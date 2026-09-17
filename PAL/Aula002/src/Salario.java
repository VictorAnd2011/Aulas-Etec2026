import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {	
	double S,SN;
	
    S = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário:"));
    SN = S + ( S * 0.15);
    JOptionPane.showMessageDialog(null, "O novo salário é de: " + SN);

	}

}
