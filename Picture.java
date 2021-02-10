import javax.swing.JLabel;

public class Picture {
	public JLabel face;
	public String Name;
	public JLabel back;
	public boolean pressed;
public Picture()
{
	
}
	public Picture(JLabel label,JLabel back, String name) {
	
		this.face = label;
		Name = name;
		this.back=back;
		this.pressed=false;
		
	}
	@Override
	public String toString() {
		return "Picture [label=" + face + ", Name=" + Name + "]";
	}
	
	

}
