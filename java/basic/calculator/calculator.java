import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calculator{
	public static void main(String args[])throws Exception{
		new Myframe();
	}
}
class Myframe extends JFrame implements  ActionListener{
	Font myfont;
	JTextField textfield;
	JPanel panel;
	JButton addbutton,subbutton,multibutton,divbutton;
	JButton decibutton,clrbutton,equalbutton,delbutton;
	JButton[] numberbuttons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	double num1=0,num2=0,result=0;
	char operator;
	Myframe(){
		myfont = new Font("Consloas",Font.PLAIN,30);
		textfield = new JTextField();
		textfield.setBounds(50,10,300,50);
		textfield.setFont(myfont);
		textfield.setForeground(Color.green);
		textfield.setBackground(Color.black);
		textfield.setEditable(false);
		
		addbutton = new JButton("+");
		subbutton = new JButton("-");
		multibutton = new JButton("*");
		divbutton = new JButton("/");
		decibutton = new JButton(".");
		equalbutton = new JButton("=");
		delbutton = new JButton("Del");
		clrbutton = new JButton("Clr");

		
		functionButtons[0] = addbutton;
		functionButtons[1] = subbutton;
		functionButtons[2] = multibutton;
		functionButtons[3] = divbutton;
		functionButtons[4] = decibutton;
		functionButtons[5] = equalbutton;
		functionButtons[6] = delbutton;
		functionButtons[7] = clrbutton;
		
		for(int i=0;i<8;i++){
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myfont);
			functionButtons[i].setForeground(Color.red);
			functionButtons[i].setBackground(Color.lightGray);
			functionButtons[i].setBorder(BorderFactory.createEtchedBorder());
			functionButtons[i].setFocusable(false);
		}
		for(int i=0;i<10;i++){
			numberbuttons[i] = new JButton(String.valueOf(i));
			numberbuttons[i].addActionListener(this);
			numberbuttons[i].setFont(myfont);
			numberbuttons[i].setForeground(Color.red);
			numberbuttons[i].setBackground(Color.lightGray);
			numberbuttons[i].setBorder(BorderFactory.createEtchedBorder());
			numberbuttons[i].setFocusable(false);
		}
		delbutton.setBounds(150,430,100,50);
		clrbutton.setBounds(250,430,100,50);
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4,4,10,10));
		
		panel.add(numberbuttons[1]);
		panel.add(numberbuttons[2]);
		panel.add(numberbuttons[3]);
		panel.add(addbutton);
		panel.add(numberbuttons[4]);
		panel.add(numberbuttons[5]);
		panel.add(numberbuttons[6]);
		panel.add(subbutton);
		panel.add(numberbuttons[7]);
		panel.add(numberbuttons[8]);
		panel.add(numberbuttons[9]);
		panel.add(multibutton);
		panel.add(decibutton);
		panel.add(numberbuttons[0]);
		panel.add(equalbutton);
		panel.add(divbutton);

		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setSize(420, 550);
		this.setLayout(null);
		this.add(textfield);
		this.add(panel);
		this.add(delbutton);
		this.add(clrbutton);
	}
	public void actionPerformed(ActionEvent e){
		for(int i=0;i<10;i++) {
			if(e.getSource() == numberbuttons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==decibutton) {
			textfield.setText(textfield.getText().concat("."));
		}
		if(e.getSource()==addbutton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='+';
			textfield.setText("");
		}if(e.getSource()==subbutton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='-';
			textfield.setText("");
		}
		if(e.getSource()==multibutton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='*';
			textfield.setText("");
		}
		if(e.getSource()==divbutton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='/';
			textfield.setText("");
		}
		if(e.getSource()==equalbutton) {
			num2=Double.parseDouble(textfield.getText());
			
			switch(operator) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}
			textfield.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clrbutton) {
			textfield.setText("");
		}
		if(e.getSource()==delbutton) {
			String string = textfield.getText();
			textfield.setText("");
			for(int i=0;i<string.length()-1;i++) {
				textfield.setText(textfield.getText()+string.charAt(i));
			}
		}
	}
}

