package aug3rd;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {

		System.out.println("Enter Date ");
		Scanner input1 = new Scanner(System.in);
		int date = input1.nextInt();

		System.out.println("Enter Month ");
		Scanner input2 = new Scanner(System.in);
		int mon = input2.nextInt();

		System.out.println("Enter Year ");
		Scanner input3 = new Scanner(System.in);
		int year = input3.nextInt();

		String month = null;

		switch (mon) {

		case 1:
			month = "Jan";
			break;
		case 2:
			month = "Feb";
			break;

		case 3:
			month = "Mar";
			break;
		case 4:
			month = "Apr";
			break;

		case 5:
			month = "May";
			break;
		case 6:
			month = "Jun";
			break;

		case 7:
			month = "Jul";
			break;
		case 8:
			month = "Aug";
			break;

		case 9:
			month = "Sep";
			break;
		case 10:
			month = "Oct";
			break;

		case 11:
			month = "Nov";
			break;
		case 12:
			month = "Dec";
			break;
		default:
			System.out.println("Invalid month");
		}

		System.out.format("Date of birth %02d-%s-%04d", date, month, year);

	}

}
