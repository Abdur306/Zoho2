import java.util.*;
class Display{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int res=0;
for(int i=0;i<n;i++){
	res=a[i]+1;
	System.out.println(res);
}
//for(int i=0;i<n;i++){	
//}
//System.out.println()
}
}
