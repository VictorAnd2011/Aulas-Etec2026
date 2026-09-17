import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {
	double SM,SF,SAL;
			
	SM = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário minímo:"));
    SF = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário do funcionário:"));
    SAL = SF/SM;
    JOptionPane.showMessageDialog(null, "A quantidade de salários minímos é de: " + SAL);
	}

}