import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CardListener implements MouseListener {

	
	public int nr_card;
	public Picture Cards[][]= new Picture[3][32];
	public JLayeredPane layeredpane;
	public JPanel panel;
	public int contor;
	public int mod;
	int time=1;
	int time2=1;
	
	
	void flip_on (int i,int j)
	{
		if(Cards[i][j]!=null)
		{
			Cards[i][j].back.setVisible(false);
			Cards[i][j].face.setVisible(true);
		}
		else
		{
			System.out.println("cards "+i+" "+j+" este null");
		}
		
	}
	void flip_off(int i,int j)
	{
		if(Cards[i][j]!=null)
		{
			Cards[i][j].back.setVisible(true);
			Cards[i][j].face.setVisible(false);
		}
		else
		{
			System.out.println("cards "+i+" "+j+" este null");
		}
	}
	void dissapear(int i,int j)
	{
		Cards[i][j].back.setVisible(false);
		Cards[i][j].face.setVisible(false);
	}
	void FinalGame(int mod)
	{
		int nr=0;
		for(int i=0;i<32;i++)
		{
			if(Cards[mod][i]!=null)
			{
				if(Cards[mod][i].face.isVisible()==false && Cards[mod][i].back.isVisible()==false)
				{
					nr++;
				}
			}
			
		}
		if(mod==0 && nr==16)
		{
			layeredpane.removeAll();
			layeredpane.add(panel);
			layeredpane.repaint();
		}
		if(mod==1 && nr==24)
		{
			layeredpane.removeAll();
			layeredpane.add(panel);
			layeredpane.repaint();
		}
		if(mod==2 && nr==32)
		{
			layeredpane.removeAll();
			layeredpane.add(panel);
			layeredpane.repaint();
		}
	}
		
	
	CardListener(int contor,Picture Cards[][],int i,JLayeredPane l,JPanel panel)
	{
		
		this.nr_card=i;
		for(int k=0;k<3;k++)
		{
			for(int j=0;j<32;j++)
			{
				this.Cards[k][j]=Cards[k][j];
			}
		}
		
		this.layeredpane=l;
		this.panel=panel;
	
		mod=contor;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
		
				flip_on(mod,nr_card);
				for(int i=0;i<32;i++)
				{
					if(Cards[mod][i]!=null)
					{
						if(i!=nr_card)
						{
							if(Cards[mod][i].face.isVisible()  )
							{
								if(Cards[mod][i].Name.equals(Cards[mod][nr_card].Name)==true)
								{
									int j=i;
									 
						               Timer t = new Timer(1000,new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											time--;
											if(time==0)
											{
												dissapear(mod,j);
												dissapear(mod,nr_card);
											    FinalGame(mod);
												
											}
										}
						            	   
						               });
						               t.start();
								}
								else
								{
									int j=i;
									 
						               Timer t = new Timer(1000,new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											time2--;
											if(time2==0)
											{
												flip_off(mod,j);
												flip_off(mod,nr_card);
												
											}
										}
						            	   
						               });
						               t.start();
								}
								
								
							}}
					}
					
					}
				
			
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
