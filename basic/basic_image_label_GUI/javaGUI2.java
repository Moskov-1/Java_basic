/*
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

class javaGUI_1{
	public  static void main(String args[]){
		ImageIcon IMG = new ImageIcon("iconIMAGEgamecontroller.png");
		
		JLabel label =  new JLabel();
		label.setIcon(IMG);
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.blue);
		frame.add(label);
		frame.pack();
	}
}
*/

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
class javaGUI2{
	public static void main(String args[]){
		
		ImageIcon IMG = new ImageIcon("iconIMAGEgamecontroller.png");   // making image object for icon
		ImageIcon image = new ImageIcon("weirdThingy.png");             // make image object for label
		
		//----------------- NEW THING -----------------------
       // ---------------   BORDERS  -----------------------
       Border BOR = BorderFactory.createLineBorder(Color.green,6);      // make border object of green color and 6 magnitude
		
		JLabel mylabel = new JLabel();                                  // make label object   
		
	    mylabel.setIcon(image);                                         // add image to label
	    mylabel.setText("This is first official one"); 
	    mylabel.setVerticalTextPosition(JLabel.TOP);
	    mylabel.setHorizontalTextPosition(JLabel.CENTER);
	    mylabel.setForeground(new Color(0x00FF00));
	    mylabel.setFont(new Font("MV Boli",Font.BOLD,20));
	    mylabel.setIconTextGap(10);
	    mylabel.setOpaque(true);
	    mylabel.setBackground(Color.red);                               // Set Opaque to true to display color
	    mylabel.setBorder(BOR);                                          // add border object to mylabel
        mylabel.setVerticalAlignment(JLabel.CENTER);                     // makes thing go  top center bottom
        mylabel.setHorizontalAlignment(JLabel.CENTER);                   // makes thing go left center right
        mylabel.setBounds(0,0,500,500);
		
        JFrame myframe = new JFrame();                                  // make frame object
		
		myframe.setVisible(true);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setSize(700,600);
		myframe.getContentPane().setBackground(new Color(123,50,250));
		myframe.add(mylabel);                                           // add label to frame
		myframe.setLayout(null);
		myframe.setIconImage(IMG.getImage());      
      
	}
}

