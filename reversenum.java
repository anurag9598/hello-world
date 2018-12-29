//hello-world
//code to reverse number without swapping...

import java.util.*;
 public class SmartSwap
 {   
  public void main()
    {
     Scanner sc=new Scanner(System.in);
     int a,b;
     System.out.println("Enter the FIRST Number:");
     a=sc.nextInt();
     System.out.println("ENTER the SECOND number:");
     b=sc.nextInt();
     a=a+b; //logic part
     b=a-b;
     a=a-b;
     System.out.println("FIRST NUMBER AFTER SWAPPING IS:"+a);
     System.out.println("SECOND NUMBER AFTER SWAPPING IS:"+b);
    }
 }
     
     
