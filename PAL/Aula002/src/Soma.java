import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
	double v1,v2,soma;
			
	v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
    soma = v1 + v2;
    JOptionPane.showMessageDialog(null, "A soma total é de: " + soma);
	}

}