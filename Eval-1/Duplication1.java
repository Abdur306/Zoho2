import java.util.*;
public class Duplication1{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int count=0;
int a[]=new int[n];
for(int i=0;i<n;++i){
	a[i]=s.next();
	for( i=0;i<n-1;++i){
		for(int j=i+1;j<n;++j){
		if(a[j]==a[j+1])
count++;				
		}
	}
	System.out.println(count);
	
}
}
} 