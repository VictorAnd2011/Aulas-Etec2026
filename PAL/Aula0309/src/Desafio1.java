import javax.swing.JOptionPane;

public class Desafio1 {

	public static void main(String[] args) {
		double idade=0,qm=0,qf=0,MaiorId=0,SomaId=0,MediaId;
		int m18=0;
		String sex, corOL,corCA;
		
//--------------------------------------------------------------------------------------------------------------------
		
		while(true)
		{
			
			idade = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade do habitante (Digite -1 para encerrar)"));
			
			if(idade == -1)
			{
				break;
			}
			
// -------------------------------------------------------------------------------------------------------------------
		
			sex = JOptionPane.showInputDialog("Qual o sexo (M para Masculino e F para Feminino)?");
			corOL = JOptionPane.showInputDialog("Qual a cor dos olhos (azuis, verdes ou castanhos)?");
			corCA = JOptionPane.showInputDialog("Qual a cor do cabelo (louros, castanhos ou pretos)?");
			
//--------------------------------------------------------------------------------------------------------------------
		
			if(idade > MaiorId)
			{
				MaiorId = idade;
			}
			
			if(idade >= 18 && idade <=35 && sex.equals("F") && corOL.equals("verdes") && corCA.equals("louros")) 
			{
				m18 = m18 + 1;
			}
			
			if(sex.equals("M"))
			{
				qm = qm + 1;
			}
			else
			{
				qf = qf + 1;
			}
			
//--------------------------------------------------------------------------------------------------------------------
			
			SomaId = SomaId + idade;

		}
		
		
		

		MediaId = SomaId / (qf+qm);

//--------------------------------------------------------------------------------------------------------------------		
		
		JOptionPane.showMessageDialog(null, "A maior idade dos habitantes é: " + MaiorId);
		JOptionPane.showMessageDialog(null, "A quantidade de indivíduos do sexo feminino cuja a idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos louros é: " + m18);
		JOptionPane.showMessageDialog(null, "A quantidade de homens é: " + qm);
		JOptionPane.showMessageDialog(null, "A quantidade de mulheres é: " + qf);
		JOptionPane.showMessageDialog(null, "A idade média é de: " + MediaId);
	}

}
