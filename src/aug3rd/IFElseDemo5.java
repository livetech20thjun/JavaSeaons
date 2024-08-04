package aug3rd;

import java.util.Scanner;

public class IFElseDemo5 {

	public static void main(String[] args) {
		
		System.out.println("Enter Date ");
		Scanner input1=new Scanner(System.in);
		int date=input1.nextInt();
		
		System.out.println("Enter Month ");
		Scanner input2=new Scanner(System.in);
		int mon=input2.nextInt();
		
		System.out.println("Enter Year ");
		Scanner input3=new Scanner(System.in);
		int year=input3.nextInt();
		
		String month = null;
		
		if(mon==1)
		{
			month="Jan";
		}
		else if(mon==2)
		{
			month="Feb";
		}
		else if(mon==3)
		{
			month="Mar";
		}
		else if(mon==4)
		{
			month="Apr";
		}
		else if(mon==5)
		{
			month="May";
		}
		else if(mon==6)
		{
			month="Jun";
		}
		else if(mon==7)
		{
			month="Jul";
		}
		else if(mon==8)
		{
			month="Aug";
		}
		else if(mon==9)
		{
			month="Sep";
		}
		else if(mon==10)
		{
			month="Oct";
		}
		else if(mon==11)
		{
			month="Nov";
		}
		else if(mon==12)
		{
			month="Dec";
		}
		else
		{
			System.out.println("Ivalid month");
		}
		
		//System.out.println("Date of birth "+date+"-"+month+"-"+year);
		
		System.out.format("Date of birth %02d-%s-%04d",date,month,year);


	}

}
