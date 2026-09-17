import javax.swing.JOptionPane;

public class Resto {

	public static void main(String[] args) {
		double v1,v2,resto;
		
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
	    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
	    resto = v1 % v2;
	    JOptionPane.showMessageDialog(null, "O resto da divisão é de: " + resto);

	}

}
