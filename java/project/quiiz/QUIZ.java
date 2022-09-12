import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

class quiz implements ActionListener{
	String[] s1 = {
		"Which company created java",
		"what is javas birthday",
		"javas nick name?",
		"who made java"
		};
	String[][] option = {
		      {"sun MicroSystems","pran","Microsoft","Alphabet"},
		      {"1989","1996","1972","9999"},
		      {"shit","syntex_moster","Oak","Koffee"},
		      {"james Gosling","Yusuf sir","bill gates","BUP-authority"}
	};	
	char[] Ans = {
		'A',
		'B',
		'C',
		'A'
	};
	char guess;
	char choice;
	int index; // index zero , cuz it's a field :v
	int correctGuess=0;
	int totalQuestions = s1.length;
	int result;
	int seconds=10;
	
	JFrame frame = new JFrame("|| QUIZ ||");
	JTextField  tf = new JTextField();
	JTextArea area = new JTextArea();
	
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	
	JLabel AnsLabelA = new JLabel();
	JLabel AnsLabelB = new JLabel();
	JLabel AnsLabelC = new JLabel();
	JLabel AnsLabelD = new JLabel();
	JLabel LookAtTimeLabel = new JLabel();
	JLabel countdown = new JLabel();	
	
	JTextField numberOfRightGuesses = new JTextField();
	JTextField percentage = new JTextField();
	
	Font Bolis = new Font("MV Boli",Font.BOLD,35);
	
	Timer timer = new Timer(1000,new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			seconds--;
			countdown.setText(String.valueOf(seconds));
			if(seconds <= 0){
				Answer();
			}
		}
	});
	public quiz(){
		
		
		tf.setBounds(0,0,650,50);
		tf.setBackground(new Color(25,25,25));
		tf.setForeground(new Color(255,255,0));
		tf.setFont(new Font("Ink Free",Font.BOLD,30));
		tf.setBorder(BorderFactory.createBevelBorder(1));
		tf.setHorizontalAlignment(JTextField.CENTER);
		tf.setEditable(false);
		
		area.setBounds(0,50,650,50);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBackground(new Color(25,25,25));
		area.setForeground(new Color(255,255,0));
		area.setFont(new Font("MV Boli",Font.BOLD,25));
		area.setBorder(BorderFactory.createBevelBorder(1));
		area.setEditable(false);
		
		buttonA.setBounds(0,100,100,100);
		buttonA.setFont(Bolis);
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,200,100,100);
		buttonB.setFont(Bolis);
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,300,100,100);
		buttonC.setFont(Bolis);
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,400,100,100);
		buttonD.setFont(Bolis);
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		AnsLabelA.setBounds(125,100,500,100);
		AnsLabelA.setBackground(new Color(50,50,50));
		AnsLabelA.setForeground(new Color(25,255,0));
		AnsLabelA.setFont(new Font("MV Boli",Font.PLAIN,35));
		
		AnsLabelB.setBounds(125,200,500,100);
		AnsLabelB.setBackground(new Color(50,50,50));
		AnsLabelB.setForeground(new Color(25,255,0));
		AnsLabelB.setFont(new Font("MV Boli",Font.PLAIN,35));

		AnsLabelC.setBounds(125,300,500,100);
		AnsLabelC.setBackground(new Color(50,50,50));
		AnsLabelC.setForeground(new Color(25,255,0));
		AnsLabelC.setFont(new Font("MV Boli",Font.PLAIN,35));
		
		AnsLabelD.setBounds(125,400,500,100);
		AnsLabelD.setBackground(new Color(50,50,50));
		AnsLabelD.setForeground(new Color(25,255,0));
		AnsLabelD.setFont(new Font("MV Boli",Font.PLAIN,35));
		
		countdown.setBounds(535,510,100,100);
		countdown.setBackground(new Color(25,25,25));
		countdown.setForeground(new Color(255,0,0));
		countdown.setFont(new Font("Ink Free",Font.BOLD,60));
		countdown.setBorder(BorderFactory.createBevelBorder(1));
		countdown.setOpaque(true);
		countdown.setHorizontalAlignment(JTextField.CENTER);
		countdown.setText(String.valueOf(seconds));
		
		LookAtTimeLabel.setBounds(535,475,100,25);
		LookAtTimeLabel.setBackground(new Color(50,50,50));
		LookAtTimeLabel.setForeground(new Color(255,0,0));
		LookAtTimeLabel.setFont(new Font("MV Boli",Font.PLAIN,20));
		LookAtTimeLabel.setHorizontalAlignment(JTextField.CENTER);
		LookAtTimeLabel.setText("BOOM :v");
		
		numberOfRightGuesses.setBounds(225,225,200,100);
		numberOfRightGuesses.setBackground(new Color(25,25,25));
		numberOfRightGuesses.setForeground(new Color(25,225,0));
		numberOfRightGuesses.setFont(new Font("Ink Free",Font.BOLD,50));
		numberOfRightGuesses.setBorder(BorderFactory.createBevelBorder(1));
		numberOfRightGuesses.setHorizontalAlignment(JTextField.CENTER);
		numberOfRightGuesses.setEditable(false);
		
		percentage.setBounds(225,325,200,100);	
		percentage.setBackground(new Color(25,25,25));
		percentage.setForeground(new Color(25,225,0));
		percentage.setFont(new Font("Ink Free",Font.BOLD,50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(50,100,50));
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		frame.add(area);
		frame.add(tf);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(AnsLabelA);
		frame.add(AnsLabelB);
		frame.add(AnsLabelC);
		frame.add(AnsLabelD);
		frame.add(countdown);
		frame.add(LookAtTimeLabel);
		//frame.add(percentage);
		//frame.add(numberOfRightGuesses);
		Question();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(e.getSource()==buttonA){
			choice = 'A';
			if(choice == Ans[index]){
				correctGuess++;
			}
		}
		else if(e.getSource()==buttonB){
			choice = 'B';
			if(choice == Ans[index]){
				correctGuess++;
			}
		}
		else if(e.getSource()==buttonC){
			choice = 'C';
			if(choice == Ans[index]){
				correctGuess++;
			}
		}
		else if(e.getSource()==buttonD){
			choice = 'D';
			if(choice == Ans[index]){
				correctGuess++;
			}
		}
		Answer();
	}
	public void Question(){
		if(index >= totalQuestions){
			results();
		}else{
			tf.setText("Question "+(index+1));
			area.setText(s1[index]);
			AnsLabelA.setText(option[index][0]);
			AnsLabelB.setText(option[index][1]);
			AnsLabelC.setText(option[index][2]);
			AnsLabelD.setText(option[index][3]);
			timer.start();
		}
	}
	public void Answer(){
		timer.stop();
		//buttonA.setEnabled(false);
		//buttonB.setEnabled(false);
		//buttonC.setEnabled(false);
		//buttonD.setEnabled(false);
		
		if(Ans[index] != 'A'){ // turning font to red
			AnsLabelA.setForeground(new Color(225,0,0));
		}
		if(Ans[index] != 'B'){
			AnsLabelB.setForeground(new Color(225,0,0));
		}
		if(Ans[index] != 'C'){
			AnsLabelC.setForeground(new Color(225,0,0));
		}
		if(Ans[index] != 'D'){
			AnsLabelD.setForeground(new Color(225,0,0));
		}
		
		Timer pause = new Timer(2000,new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AnsLabelA.setForeground(new Color(25,225,0));
				AnsLabelB.setForeground(new Color(25,225,0));
				AnsLabelC.setForeground(new Color(25,225,0));
				AnsLabelD.setForeground(new Color(25,225,0));
				
				choice = '\0';
				seconds=10;
				countdown.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				Question();
			}
		});
		pause.setRepeats(false);
		pause.start();
	}
	public void results(){
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		result = (int)(100*(correctGuess/(double)totalQuestions));
		
		tf.setText("RESULTS");
		area.setText("");
		AnsLabelA.setText("");
		AnsLabelB.setText("");
		AnsLabelC.setText("");
		AnsLabelD.setText("");
		
		numberOfRightGuesses.setText(String.valueOf(correctGuess));
		percentage.setText(result+"%");
		
		frame.add(percentage);
		frame.add(numberOfRightGuesses);
	}
}
class QUIZ{
	public static void main(String args[]){
		new quiz();
	}
}

