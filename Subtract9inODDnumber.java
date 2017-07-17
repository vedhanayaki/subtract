package player;
import java.util.Scanner;
public class Subtract9inODDnumber {
public static void main(String []args){
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
for(int i=0;i<=n;i++){
	if(i%2!=0){
		System.out.println(i);
		sum=sum+i;
		}
	//sum=sum+i;
}
System.out.println(sum-9);
}
}
