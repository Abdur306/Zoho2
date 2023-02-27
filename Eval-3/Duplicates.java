import java.util.*;
class Duplicates{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int n=s.nextInt();
int a[]=new int[n];
int count=0;

System.out.println("enter elements");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		//if(a[j]!='-'){
			if(a[i]==a[j])
		//a[j]=0;
		{
			a[j]='-';
			count++;
		}
		
		}
		
	}


for(int i=0;i<n;i++){
	if(a[i]!='-'){
System.out.print(a[i]+" ");
	}
}
for(int i=0;i<count;i++){
	System.out.print("-");
}
}
}

