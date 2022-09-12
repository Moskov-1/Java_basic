import javax.swing.*;
import java.awt.*;
class CheckPackage {
    JFrame f6=new JFrame();
    JTabbedPane tb=new JTabbedPane();
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JPanel panel1,panel2,panel3;
	String txt1,txt2,txt3;

    CheckPackage(){
		panel1 = new JPanel();
		panel1.setBackground(new Color(195,205,37));
		panel1.setLayout(null);
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.lightGray);
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.white);
		
        l1=new JLabel("Gold Package");
        l1.setBounds(220,20,200,60);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(new Font(null,Font.BOLD,20));
        
        txt1 = "<HTML>The taste of Nature will take you to the heart of beautiful. This tour is a perfect ideal for first timers and those who want to explore and experience as much as possible.</HTML>";
        l4 = new JLabel(txt1);
        l4.setBounds(0,80,650,150);// text
        l4.setBackground(Color.green);
        //l4.setOpaque(true);
        
        l7 = new JLabel("Price: 7500");
        l7.setBounds(0,230,100,50);
        l7.setBackground(Color.red);
        //l7.setOpaque(true);
        l7.setFont(new Font(null,Font.BOLD,15));
        
        var gd_btn = new JButton("BOOK NOW");
        gd_btn.setBounds(250,300,130,30);
        gd_btn.setFocusable(false);
        
        panel1.add(l1);
        panel1.add(l4);
        panel1.add(l7);
        panel1.add(gd_btn);
        
        
        l2=new JLabel("Silver Package");
        l2.setBounds(220,20,200,60);
        l2.setBackground(Color.yellow);
        //l2.setOpaque(true);
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setFont(new Font(null,Font.BOLD,20));
        
        
        txt2 = "<HTML>The taste of Nature will take you to the heart of beautiful. This tour is a perfect ideal for first timers and those who want to explore and experience as much as possible.</HTML>";
        l5 = new JLabel(txt2);
        l5.setBounds(0,80,650,150);// text
        l5.setBackground(Color.green);
        //l5.setOpaque(true);
        
        l8 = new JLabel("Price: 4500");
        l8.setBounds(0,230,100,50);
        l8.setBackground(Color.red);
        //l8.setOpaque(true);
        l8.setFont(new Font(null,Font.BOLD,15));
        
        var sv_btn = new JButton("BOOK NOW");
        sv_btn.setBounds(250,300,130,30);
        sv_btn.setFocusable(false);
        
        panel2.add(l2);
        panel2.add(l5);
        panel2.add(l8);
        panel2.add(sv_btn);
        
        
        l3=new JLabel("Bronze Package");
        l3.setBounds(220,20,200,60);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setFont(new Font(null,Font.BOLD,20));
        
        txt3 = "<HTML>Enjoy our Cheap Holiday packages from Bangladesh and create your own most scene in the nature.</HTML>";
        l6 = new JLabel(txt3);
        l6.setFont(new Font(null,Font.BOLD,15));
        l6.setBounds(0,80,650,150);// text
        l6.setBackground(Color.green);
        //l6.setOpaque(true);
        
        l9 = new JLabel("Price: 7500");
        l9.setBounds(0,230,100,50);
        l9.setBackground(Color.red);
        //l9.setOpaque(true);
        l9.setFont(new Font(null,Font.BOLD,15));
        
        var br_btn = new JButton("BOOK NOW");
        br_btn.setBounds(250,300,130,30);
        br_btn.setFocusable(false);
        
        panel3.add(l3);
        panel3.add(l6);
        panel3.add(l9);
        panel3.add(br_btn);
        
        tb.add("Package 01",panel1);
        tb.add("Package 02",panel2);
        tb.add("Package 03",panel3);
        tb.setBounds(10,10,650,390);

        f6.add(tb);

        f6.setSize(700,450);
        f6.setLayout(null);
        f6.setVisible(true);
    }


    public static void main(String[] args) {
        new CheckPackage();
    }
}
