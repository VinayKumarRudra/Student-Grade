package vinay;

import java.util.Scanner;

public class Main {
	private static Scanner get;

	public static void main(String args[])
	{
		Result [] stu=new Result[20];
		int i,n;
		String name;
		int roll,pds,maths,english,pds_lab;
		System.out.println("enter the no of students:"+"\n");
		get = new Scanner(System.in); 
		n=get.nextInt();
		System.out.println("enter the details of students-student NAME,student ROLLNO,PDS marks,MATHS marks,ENGLISH marks,PDS_LAB marks respectively........."+"\n");
		for(i=0;i<n;i++)
		{
			name=get.next();
			roll=get.nextInt();
			pds=get.nextInt();
			maths=get.nextInt();
			english=get.nextInt();
			pds_lab=get.nextInt();
			stu[i]=new Result(name,roll,pds,maths,english,pds_lab);
			
		}
		stu[0].credits();
		stu[0].display2();
		for(i=0;i<n;i++)
		{
			stu[i].display1();
			stu[i].subject();
			stu[i].grades();
			
		}
		  System.out.println("the list of passed students:"+"\n");
		for(i=0;i<n;i++)
		{
			stu[i].list();
		}
		
	}
}
      
 