import java.util.*;
class Product{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int pro=1;
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
for(int i=0;i<n-1;i++){
	for(int j=0;j<n-1-i;j++){
	if(a[j]<a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
	}			
	}
}
System.out.println(Arrays.toString(a));

for(int i=0;i<3;i++){
	pro*=a[i];
}
System.out.println(pro);

}
}