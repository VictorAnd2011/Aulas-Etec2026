import javax.swing.JOptionPane;
public class PaoEBroa {

	public static void main(String[] args) {
	double P,B,T,POP;
			
	P = Double.parseDouble(JOptionPane.showInputDialog("Quantos pães foram vendidos?"));
    B = Double.parseDouble(JOptionPane.showInputDialog("Quantas broas foram vendidas?"));
    T= P*1.2 + B*3.5;
    POP = T*0.1;
    JOptionPane.showMessageDialog(null, "O total vendido foi de: " + T);
    JOptionPane.showMessageDialog(null, "Deve ser colocado na poupança o total de: " + POP);
	}

}