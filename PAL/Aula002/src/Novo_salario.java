import javax.swing.JOptionPane;

public class Novo_salario {

	public static void main(String[] args) {
	double S,PR,VN;
		
	S = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário:"));
	PR = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste:"));
	VN = S + ( S * PR/ 100);
	JOptionPane.showMessageDialog(null, "O novo salário é de: " + VN);
	}

}
