import java.util.*;
import java.io.*;

class Student{
	public static void main(String[] args){
		HashMap<Integer,String> hms=new HashMap<>();
		Scanner sc=new Scanner(System.in);
			hms.put(101,"bcd");
			hms.put(102,"acd");
			hms.put(103,"addcd");
			hms.put(104,"bcjud");
			//bw.write(hms);
			
		//bw.close();
		System.out.println(hms);
		try{
			BufferedWriter bw =new BufferedWriter(new FileWriter("dt.txt"));
			bw.write(hms);
		}
		bw.close();
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}	



