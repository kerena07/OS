package OS;

public class osQ2 extends Thread{
	 int input;
	 int output;
	 public osQ2(int input){
	 this.input = input;
	 }
	 public void run() {
	 int i;
	 output = 1;
	 for(i=1;i<=input;i++){
	 output = output*i;
	 }
	 }

	 public int getResult() {
	 return this.output;
	 }
	}
