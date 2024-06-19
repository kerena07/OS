package OS;

import java.util.Scanner;
public class osQ2thread {
public static void main(String[] args) {
// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	 int num[] = new int[5];
	 int[] factorial = new int[5];
	 for(int i = 0; i < 5; i++){
	 System.out.print("Enter a number (values ranging from 1 to 10): ");
	 num[i] = scanner.nextInt();
	 try{
	 osQ2 thread = new osQ2(num[i]);
	 thread.start();
	 thread.join();
	 int result = thread.getResult();
	 factorial[i] = result;
	 }
	 catch(Exception ex) {
	 System.out.println("Exception has " + "beencaught" + ex);
	 }
	 }
	System.out.println("Factorial of\n" + num[0] + "="+ factorial[0]+ "\n"+ num[1] + "=" +factorial[1]+ "\n"+
	num[2] + "=" + factorial[2]+ "\n"+ num[3] + "=" + + factorial[3]+ "\n"+num[4] +"="+factorial[4]);
	}
	}
