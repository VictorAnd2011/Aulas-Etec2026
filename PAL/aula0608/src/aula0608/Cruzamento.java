package aula0608;

import javax.swing.JOptionPane;

public class Cruzamento {

	public static void main(String[] args) {
		int DC;
		String CS;
		
		CS = JOptionPane.showInputDialog(null, "Digite a cor do semáfaro (A para amarelo, V para vermelho e D para verde");
		
		if(CS.equals("A"))
		{
			DC = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a distância para o cruzamento"));
			
			if(DC >= 5)
			{
				JOptionPane.showMessageDialog(null, "Parar");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Passar com cuidado");
			}
		}
		else
		{
			if(CS.equals("V"))
			{
				JOptionPane.showMessageDialog(null, "Parar");
			}
			else
			{
				//para nao ter nenhum engraçadinho fazendo resenha no meu código 
				if(CS.equals("D"))
				{
					JOptionPane.showMessageDialog(null, "Passar");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ERRO, DIGITE UMA DAS LETRAS INDICADAS");
				}
			}
		}

	}

}
