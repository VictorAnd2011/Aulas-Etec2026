import javax.swing.JOptionPane;
public class E1 {

	public static void main(String[] args) {
		double h,v,r;
		
		h = Double.parseDouble(JOptionPane.showInputDialog("Por quantas horas a charrete foi usada?"));

		r = h % 3;
		
		v = ((h - r)/3) * 10 + r*5;
		
		JOptionPane.showMessageDialog(null,"O valor a ser pago é de: " + v);
	}

}
