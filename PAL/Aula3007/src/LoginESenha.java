import javax.swing.JOptionPane;

public class LoginESenha {

	public static void main(String[] args) {
		int L,S;
		
		L = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o login"));
		
		S = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha"));
		
		if (L == 1234 && S == 9988)
		{
			JOptionPane.showMessageDialog(null, "Sistema liberado");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sistema bloqueado");
		}

	}

}
