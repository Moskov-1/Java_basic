import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;

class javaGUI3{
	public  static void main(String args[]){
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		
		label1.setText("HOLA !!");
		label1.setForeground(Color.blue);
		label1.setHorizontalAlignment(JLabel.CENTER);
		
		label2.setText("MY");
		label2.setForeground(Color.red);
		label2.setHorizontalAlignment(JLabel.CENTER);
		
		label3.setText("FRIEND. ");
		label3.setForeground(Color.yellow);
		label3.setHorizontalAlignment(JLabel.CENTER);
		
		label4.setText("[ jkjksjtksj ]");
		label4.setForeground(Color.white);
		label4.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel redPanel = new JPanel();
		JPanel bluePanel = new JPanel();
		JPanel greenPanel = new JPanel();
		JPanel MAD8Panel = new JPanel();
		
		redPanel.setBackground(Color.red);
		redPanel.setLayout(new BorderLayout());
		redPanel.setBounds(0,0,250,250); //----------------------------> bounds X=0,Y=0, [ 250X250 ]
		
		bluePanel.setBackground(Color.blue);
		bluePanel.setLayout(new BorderLayout());
		bluePanel.setBounds(250,0,250,250); //-------------------------> bounds X=250,Y=0, [ 250X250 ]
		
		greenPanel.setBackground(Color.green);
		greenPanel.setLayout(new BorderLayout());
		greenPanel.setBounds(0,250,250,250); //------------------------> bounds X=0,Y=250, [ 250X250 ]
		
		MAD8Panel.setBackground(new Color(123,50,250));
		MAD8Panel.setLayout(new BorderLayout());
		MAD8Panel.setBounds(250,250,250,250); //-----------------------> bounds X=250,Y=250, [ 250X250 ]
		
		redPanel.add(label1);
		bluePanel.add(label2);
		greenPanel.add(label3);
		MAD8Panel.add(label4);
		
		// --------- NEW INFO------------
		// PANEL MUST BE ADDED TO FRAME		
		
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setSize(550,550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		frame.add(redPanel); //---------------------------------------->  add panel [ RED ]
		frame.add(bluePanel); //--------------------------------------->  add panel [ BLUE ] 
		frame.add(greenPanel); //-------------------------------------->  add panel [ GREEN ]
		frame.add(MAD8Panel); //--------------------------------------->  add panel [ THAT THING ]  
		 
		
	}
}
