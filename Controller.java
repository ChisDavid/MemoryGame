// CalcController.java - Controller
//    Handles user interaction with listeners.
//    Calls View and Model as needed.
// Fred Swartz -- December 2004

import java.awt.event.*;
import java.sql.Time;

import javax.swing.*;
import javax.swing.event.AncestorListener;

public class Controller {
    //... The Controller needs to interact with both the Model and View.
   
    private View  m_view;
    int time=2;
    int time_resolve=2;
    int timp=0;
    //========================================================== constructor
    /** Constructor */
    Controller( View view) {
      
        m_view  = view;
        
        //... Add listeners to the view.
        view.add16x16Listener(new Class16x16());
        view.add4x4Listener(new Class4x4());
        view.add8x8Listener(new Class8x8());
        view.addStartListener(new Start_Game());
        view.GoHome(new Begin());
        view.press(new Home());
      
     
       
    }
    void ChangePanel(JPanel panel)
    {
    	m_view.getLayeredPane().removeAll();
     	m_view.getLayeredPane().add(panel);
 		m_view.getLayeredPane().repaint();
		m_view.getLayeredPane().revalidate();
    }
    
    
    public class Begin implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			 m_view.getFrame().setVisible(false);
			 View       view1       = new View();
		     Controller controller = new Controller(view1);
			
		}
    	
    }
  public class Home implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = m_view.getSelectedString();
		String s1=m_view.getSelectedString1();
		String s2=m_view.getSelectedString2();
		
		
		if(s.equals("New Game"))
		{
//			
			System.out.println("am intrat aiciasidnaskdbaskfaskfhASKF");
			 m_view.getFrame().setVisible(false);
			 View       view1       = new View();
		     Controller controller = new Controller(view1);
		}
		if(s.equals("Resolve"))
		{
for(int j=0;j<3;j++)
{
	for(int i=0;i<32;i++)
	{
		if(m_view.Cards[j][i]!=null)
		{
			if(m_view.Cards[j][i].back.isVisible())
			{
				m_view.Cards[j][i].face.setVisible(true);
				m_view.Cards[j][i].back.setVisible(false);
			}
		}
			
			
		}

	
}
			
			Timer t = new Timer(1000,new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					time_resolve--;
					if(time_resolve==0)
					{
						System.out.println("ana are emre");
						
						for(int j=0;j<3;j++)
						{
							for(int i=0;i<32;i++)
							{
							 
								if(m_view.Cards[j][i]!=null)
								{
								
									if(m_view.Cards[j][i].face.isVisible())
									{
									
										m_view.Cards[j][i].face.setVisible(false);
										m_view.Cards[j][i].back.setVisible(true);
									}
								}		
								}
						}
						
					}
				}
			});
			t.start();
		}
		
		
	}
	  
  }
    public class Start_Game implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			
		
			
			
			
			
			if(m_view.getButton_16x16().isSelected()==true)
			{
				m_view.textPane.setVisible(true);
				m_view.time.setVisible(true);
				Timer t1 = new Timer(1000,new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						timp++;
						System.out.println(timp);
						m_view.textPane.setText(timp+"");
						
					}
					
				});
	               Timer t = new Timer(1000,new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						time--;
						if(time==0)
						{
							for(int j=0;j<3;j++)
							{
								
								for(int i=0;i<32;i++) {
									if(m_view.Cards[j][i]!=null)
									{
										m_view.Cards[j][i].face.setVisible(false);
										m_view.Cards[j][i].back.setVisible(true);
									}
									
								}
							}
							
						}
					}
	            	   
	               });
	               t.start();
				   
				    ChangePanel(m_view.getPanel8x4());
			}
			if(m_view.getButton_4x4().isSelected()==true)
			{
             
				m_view.textPane.setVisible(true);
				m_view.time.setVisible(true);
				Timer t1 = new Timer(1000,new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						timp++;
						System.out.println(timp);
						m_view.textPane.setText(timp+"");
						
					}
					
				});
               Timer t = new Timer(1000,new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					time--;
					if(time==0)
					{
						for(int j=0;j<3;j++)
						{
							
							for(int i=0;i<32;i++) {
								if(m_view.Cards[j][i]!=null)
								{
									m_view.Cards[j][i].face.setVisible(false);
									m_view.Cards[j][i].back.setVisible(true);
								}
								
							}
						}
						
					}
				}
            	   
               });
               t.start();
               ChangePanel(m_view.getPanel4x4());
			}
			if(m_view.getButton_8x8().isSelected()==true)
			{
				m_view.textPane.setVisible(true);
				m_view.time.setVisible(true);
				Timer t1 = new Timer(1000,new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						timp++;
						System.out.println(timp);
						m_view.textPane.setText(timp+"");
						
					}
					
				});
				Timer t = new Timer(1000,new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						time--;
						if(time==0)
						{
							
						//	m_view.Card.setVisible(true);
							System.out.println("s-a ajuns la 0");
							for(int j=0;j<3;j++)
							{
								for(int i=0;i<32;i++) {
									if(m_view.Cards[j][i]!=null)
									{
										m_view.Cards[j][i].face.setVisible(false);
										m_view.Cards[j][i].back.setVisible(true);
									}
								}
							}
							
						}
					}
	            	   
	               });
	               t.start();
	               ChangePanel(m_view.getPanel8x8());
			}
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		//	System.out.println("You pressed ");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("You released ");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("You entered ");
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
		//	System.out.println("You exited ");
			
		}
    	
    }
    public class ComboBox_File implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("16");
			if (m_view.button_8x8.isSelected()==true)
			{
				m_view.button_8x8.setSelected(false);
			}
			if (m_view.button_4x4.isSelected()==true)
			{
				m_view.button_4x4.setSelected(false);
			}
		}

	}
    public class StartListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("16");
			if (m_view.button_8x8.isSelected()==true)
			{
				m_view.button_8x8.setSelected(false);
			}
			if (m_view.button_4x4.isSelected()==true)
			{
				m_view.button_4x4.setSelected(false);
			}
		}

	}
	public class Class16x16 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("16");
			if (m_view.button_8x8.isSelected()==true)
			{
				m_view.button_8x8.setSelected(false);
			}
			if (m_view.button_4x4.isSelected()==true)
			{
				m_view.button_4x4.setSelected(false);
			}
		}

	}
	public class Class4x4 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (m_view.button_8x8.isSelected()==true)
			{
				m_view.button_8x8.setSelected(false);
			}
			if (m_view.button_16x16.isSelected()==true)
			{
				m_view.button_16x16.setSelected(false);
			}
		}

	}
	public class Class8x8 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (m_view.button_4x4.isSelected()==true)
			{
				m_view.button_4x4.setSelected(false);
			}
			if (m_view.button_16x16.isSelected()==true)
			{
				m_view.button_16x16.setSelected(false);
			}
		}

	}
//    class MultiplyListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            String userInput = "";
//            try {
//                userInput = m_view.getUserInput();
//                m_model.multiplyBy(userInput);
//                m_view.setTotal(m_model.getValue());
//                
//            } catch (NumberFormatException nfex) {
//                m_view.showError("Bad input: '" + userInput + "'");
//            }
//        }
//    }//end inner class MultiplyListener
//    
    
    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */    
//    class ClearListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            m_model.reset();
//            m_view.reset();
//        }
//    }// end inner class ClearListener
}
