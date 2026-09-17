import javax.swing.JOptionPane;

public class Aposentadoria {

	public static void main(String[] args) {
		int nas,atual,ing,tra,id;
		
		atual = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano atual"));

		nas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento do funcionário"));
		
		ing = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano que o funcionário entrou na empresa"));
		
		tra = atual - ing;
		
		id = atual - nas;
		
		if (id >= 65 || tra >= 35 || id >=60 && tra >= 25)
		{
			JOptionPane.showMessageDialog(null, "requerer aposentadoria, com " + id + " de idade e " + tra + " de trabalho");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "não requerer aposentadoria, só tendo " + id + " anos de idade e " + tra +
					" de trabalho");
		}
		
		
		
		
		
		
		
	}

}
