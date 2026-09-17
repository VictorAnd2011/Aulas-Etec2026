import javax.swing.JOptionPane;

public class Produto {

	public static void main(String[] args) {
    double PP,Novo_preco;
		
    PP = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
	Novo_preco = PP - (PP * 0.1);
	JOptionPane.showMessageDialog(null, "A soma total é de: " + Novo_preco);

	}

}
