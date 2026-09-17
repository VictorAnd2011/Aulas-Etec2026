import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
		double cp,cc,l,lp,lc;
				
				cp = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da sua poupança:"));
				cc = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da sua conta corrente:"));
				
				
				if (cp>1000)
				{
					lp = cp*0.9;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "sem conta poupança especial");
					lp = 0;
				}
				
				if (cc>1000)
				{
					lc = cc*0.9;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "sem conta corrente especial");
					lc = 0;
				}
				
				if (cp>cc)
				{
					l = lp;
				}
				else
				{
					l = lc;
				}
				
				JOptionPane.showMessageDialog(null, l);
				
			}

			
		}
