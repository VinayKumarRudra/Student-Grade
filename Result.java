package vinay;
import java.util.Scanner;
public class Result {
      int roll,pds,maths,english,pds_lab;
      String name;
	private Scanner scan;
      Result(String a,int b,int c,int d,int e,int f)
      {
    	  name=a;
    	  roll=b;
    	  pds=c;
       	  maths=d;
    	  english=e;
    	  pds_lab=f;
      }
      void display1()
      {
    	  System.out.println("NAME:"+name+" "+"ROLL:"+roll+" "+"PDS MARKS:"+pds+" "+"MATHS MARKS:"+maths+" "+"ENGLISH MARKS:"+english+" "+"PDS_LAB MARKS:"+pds_lab+"\n");  
      }
      void credits()
      {
    	  System.out.println("these are the  credits for subjects: ");
    	  System.out.println("pds= 3 credits"+"\n"+"maths= 4 credits"+"\n"+"endlish = 4 credits"+"\n"+"pds_lab=2 credits"+"\n"+"\n");
      }
      void display2()
      {
    	  System.out.println("marks range:"+"\n");
    	   System.out.println("91-100: 10 points"+"\n"+"81-90: 9 points"+"\n"+"71-80: 8 points"+"\n"+"61-70: 7 points"+"\n"+"50-60: 6 points"+"\n"+"below 50: arrier"+"\n");
      }
      void points(int mark)
      {
    	  if(mark<=100&&mark>90)
    	  {
    		  System.out.println("points :10");	  
    	  }
    	  if(mark<=90&&mark>80)
    	  {
    		  System.out.println("points :9");	  
    	  }
    	  if(mark<=80&&mark>70)
    	  {
    		  System.out.println("points :8");	  
    	  }
    	  if(mark<=70&&mark>60)
    	  {
    		  System.out.println("points :7");	  
    	  }
    	  if(mark<=60&&mark>=50)
    	  {
    		  System.out.println("points :6");	  
    	  }
    	  if(mark<50)
    	  {
    		  System.out.println("AR");	  
    	  }
      }
      void subject()
      {
    	  System.out.println("pds subject:");
    	  points(pds);
    	  System.out.println("maths subject:");
    	  points(maths);
    	  System.out.println("english subject:");
    	  points(english);
    	  System.out.println("pds_lab :");
    	  points(pds_lab);
      }
      void grades()
      {
    	   if(pds>=50&&maths>=50&&english>=50&&pds_lab>=50)
    	   {
    	     int p,q,r,s;
    	     int g,sum;
    	     System.out.println("enter the all subjects points of the studentto find grade:");
    	     scan = new Scanner(System.in);
    	     p=scan.nextInt();
    	     q=scan.nextInt();
    	     r=scan.nextInt();
    	     s=scan.nextInt();
    	     sum=p+q+r+s;
    	     g=sum/4;
    	     System.out.println("the total grade: "+g+"\n");
           }
    	   else
    	   {
    		   System.out.println("grade cannot be display due to arrier"+"\n");
    	   }
      }
      void list()
      {
    	
    	  if(pds>=50&&maths>=50&&english>=50&&pds_lab>=50)
    	  {
    		  System.out.println(name+"\n");
    	  }
      }

}
