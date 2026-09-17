import javax.swing.JOptionPane;

public class Vendas_e_Comissao {

	public static void main(String[] args) {
	double VS,VV,CM,SF;
	
	VS = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu valor salarial:"));
    VV = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de suas vendas:"));
    CM = VV * 4/100;
    SF = VS + CM;
    JOptionPane.showMessageDialog(null, "A comissão é " + CM + " E o salário final é " + SF);
	}

}
