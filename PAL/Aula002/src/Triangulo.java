import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
	double B, A, Area;
		
	B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base:"));
	A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura:"));
	Area = (B * A)/2;
	JOptionPane.showMessageDialog(null, "A área do triangulo é de: " + Area);
	}

}
