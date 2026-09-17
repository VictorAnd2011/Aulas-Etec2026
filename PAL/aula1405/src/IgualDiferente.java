import javax.swing.JOptionPane;

public class IgualDiferente {

	public static void main(String[] args) {
		double v1,v2;
				
				v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
				v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
				
				if (v1==v2)
				{
					JOptionPane.showMessageDialog(null, "Igual");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "diferentes");
				}
			}

			
		}

