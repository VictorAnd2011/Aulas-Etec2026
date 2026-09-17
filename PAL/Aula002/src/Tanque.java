import javax.swing.JOptionPane;

public class Tanque {

	public static void main(String[] args) {
	double PL,P,L;
	
	PL = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de um litro da gasolina :"));
    P = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento:"));
    L = P / PL;
    JOptionPane.showMessageDialog(null, "Ele conseguiu colocar no tanque: " + L);
	}

}
