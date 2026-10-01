import javax.swing.JOptionPane;

public class ex4_comparacoes {

	public static void main(String[] args) {
		int id, Mid, Nid, i;
		double h, Mh, Nh;
		
		id = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		h = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		
		Mid = id;
		Nid = id;
		Mh = h;
		Nh = h;
		
		for(i=2;i<=3;i++)
		{
			id = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
			h = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
			
			if(h>Mh)
			{
				Mh=h;
			}
			
			if(h<Nh)
			{
				Nh= h;
			}
				
			
			if(id>Mid)
			{
				Mid=id;
			}
			
			if(id<Nid)
			{
				Nid= id;				
			}
			
			}
		
		JOptionPane.showMessageDialog(null, "Maior altura: "+ Mh + " Menor altura: " + Nh + " Maior idade: " + Mid + " Menor idade: " + Nid);
		}

}
