import javax.swing.JOptionPane;

public class Lanche {

	public static void main(String[] args) {
	double QS,Q,P,H;
			
	QS = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de lanches feitos:"));
    Q = QS*0.1;
    P = QS*0.05;
    H = QS*0.1;
    JOptionPane.showMessageDialog(null, "O total de queijo, presunto e hamburger usado é de respectivamente: " + Q + ", " + P + " e " + H);
	}

}