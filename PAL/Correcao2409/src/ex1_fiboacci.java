import javax.swing.JOptionPane;

public class ex1_fiboacci {

	public static void main(String[] args) {
		int i,
		na=0, 
		nb=1,
		n=0,
		j;
		
		i = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de termos da sequencia que deseja: "));
		
		
		for(j=1;j<=i;j++)
		{
			System.out.print(n + " ");
			n = na + nb;
			nb = na;
			na = n;
		}
	}

}
