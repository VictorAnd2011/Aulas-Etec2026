import javax.swing.JOptionPane;

public class ex3_prefeitura {
	public static void main(String[] args) {
		int s, f,MEs=0,MEf,MaiorS=0, i, ts=0, tf=0;
		double p25,s25=0;
		
		for(i=1;i<=5;i++)
		{
			s = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "° salário: "));
			f = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + i + "° quantidade de filhos: "));
			
			
			if(s>MaiorS)
			{
				MaiorS = s;
			}
			
			if(s<=2500)
			{
				s25++;
			}
			
			ts += s;
			
			tf += f;
		}
		
		MEs = ts/5;
		MEf = tf/5;
		
		p25 = s25/5 *100;
		
		JOptionPane.showMessageDialog(null, "" + MEs + " " + MEf + " " + MaiorS + " " + p25 + "%");
	}

}
