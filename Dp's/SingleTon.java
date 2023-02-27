import java.util.*;
class SingleTon{
public static void main(String [] abu){

Abdur obj=Abdur.Create();
System.out.println(obj);
Abdur obj1=Abdur.Create();
System.out.println(obj1);
}
}
class Abdur{
 private static Abdur obj;
 
 static{
	 
	 System.out.println("static ");
 }
 
 public static Abdur Create(){
	 if(obj==null)
		 obj=new Abdur();
	 
	 return obj;
 }
 public String toString(){
	 return "Abdur"+"obj created";
 }
	
}