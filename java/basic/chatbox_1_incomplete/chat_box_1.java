
// chat box --> lol . Long way to go
// will take in users ---> complete up to predefined and before threading
// can freely converse --> no can do ... maybe sockets use korte hobe
// why use synchronised?? --> checked part-1 
import java.util.Scanner;
class chat_box_1{
	 void massageWritter(){
		Scanner sc = new Scanner(System.in);
		System.out.print(Thread.currentThread().getName()+"$:=>");
		String str =sc.nextLine();
		System.out.println(Thread.currentThread().getName()+"---------");
		System.out.println(str);
	}
	
	public static void main(String args[]){
		var obj = new chat_box_1();
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many people");
		int N = sc.nextInt();
		Chat arr[] = new Chat[N];
		sc.nextLine();
		for(int i=0;i<N;i++){
			System.out.print("User: ");
			str = sc.nextLine();
			arr[i] = new Chat(str,obj);
		}
		for(Chat x : arr){
			try{
				x.start();
				Thread.sleep(200);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
}
class Chat extends Thread{
	chat_box_1 m;
	Chat(String str,chat_box_1 m){
		super(str);
		this.m = m;
	}
	@Override
	public void run(){
		synchronized(m){
			m.massageWritter();
		}
	}
	
}
