import javax.swing.JOptionPane;
class pane1{
	public static void main(String arhs[]){
		
//JOptionPane.showMessageDialog(null,"This is first Option u'll ever get","my Title",JOptionPane.PLAIN_MESSAGE);
//JOptionPane.showMessageDialog(null,"DID you know that you suck at life","info",JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null,"will you slack off","curious",JOptionPane.QUESTION_MESSAGE);
//while(true){
//JOptionPane.showMessageDialog(null,"YOUR COMPUTER HAS A VIRUS.... ON LINUX","BE AWARE",JOptionPane.WARNING_MESSAGE);
//}
//JOptionPane.showMessageDialog(null,"Call tech support or ElSE","U ALREADY DEAD",JOptionPane.ERROR_MESSAGE);
          // NEW //
// JOptionPane.showConfirmDialog(null,"Do you even code","yes-- this is my title",JOptionPane.YES_NO_CANCEL_OPTION);
	                                                                             //         0  1   2  (x)--> -1
String name = JOptionPane.showInputDialog("what is your name:");	
	String arrgs[] = {name+"!", "so your "+name, name+" "+name};
JOptionPane.showOptionDialog(
	null,
	"You "+name, // the message
	"what title", // the title
	JOptionPane.YES_NO_CANCEL_OPTION, // options
	JOptionPane.WARNING_MESSAGE, // option type
	null, // ImageIcon object
	arrgs, // custom options string[]
	0 // 0 --> yes , 1 --> no , 2 --> cancel ,  -1 ---> (x)close
	);	
 }                                                                             
		
}
