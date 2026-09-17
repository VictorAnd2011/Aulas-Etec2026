import javax.swing.JOptionPane;

public class Votoeleitor {

	public static void main(String[] args) {
		int Id;
		
		Id = Integer.parseInt(JOptionPane.showInputDialog(null,"digite a sua idade"));

		if(Id >= 16)
		{
			if(Id < 18 || Id >= 65)
			{
				JOptionPane.showMessageDialog(null, "Voto facultativo");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Voto obrigatório");
			}
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Não eleitor");
		}
	}
}