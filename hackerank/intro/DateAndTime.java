package com.hackerank.intro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateAndTime {

	public static void main(String[] args) {
		/*
		 * this program converts the month attribute in string to int value and displays
		 * the day in string from the date input string.
		 */
		File file = new File("/Users/jaymil/Documents/Coding practice workspace/Logic practice/Hacker_Rank/src/textfiledir/datestxt");

		if (!file.isFile()) {
			System.out.println("No file available");
		} else {
			try {
				
				/*
				 * Scanner in = new Scanner(System.in);
				 * System.out.println("Enter date mm dd yyyy ");
				 * String indate = in.nextLine();
				 * getNewDateFormat(indate);
				 */
				 
				// Scanner input = new Scanner(file); //reading file
				FileReader fileReader = new FileReader(file); // reading file using file reader
				BufferedReader br = new BufferedReader(fileReader);// reading file from file reader
				// SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd"); //creating a
				// date format.
//			DateFormat df = DateFormat.getDateInstance();
				String st;
				// using bufferReader to read lines from text file and parsing each field
				// (yr,mnth,day)
				while (br.ready()) {
					// read each line in the file
					st = br.readLine();
					// fetch each attribute in the date string
					String[] aDate = st.split(" ");
					// parsing each attribute from string to integer
					int month = intMonth(aDate[0]);
					int day = Integer.parseInt(aDate[1]);
					int yr = Integer.parseInt(aDate[2]);
					// create a local date instance
					LocalDate date = LocalDate.of(yr, month, day);
					System.out.println("Date: "+date);
					// get the day from the locale date instance in string
					String dom = date.getDayOfWeek().name();
			    System.out.println("Day: "+dom); 
				}
				br.close();
//			input.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// The substring approach to convert month in string to an int value
	public static void getNewDateFormat(String date) {
		String month, newDate = null;
		int mnth;
//		System.out.println(yr+" "+mnth+" "+day);
//		System.out.println(yr+" "+intMonth(mnth)+" "+day);

		// loop thru each character in the string
		for (int i = 0; i < date.length(); i++) {
			// get each character from the string at a time
			char c = date.charAt(i);
			// checking for the first attribute (the month attribute) in the string and
			// getting that attribute
			if (c == ' ') {
				System.out.println("Date");
				// fetch the month attribute
				month = date.substring(0, i);
//				System.out.println(month);
				// get the the int value of the month attribute
				mnth = intMonth(month);
				// get the remainder of attributes in the date string
				String lastAttributes = date.substring(i);
				// new date with month attribute converted to an int value
				newDate = mnth + lastAttributes;
				System.out.println(newDate);
				break;
			} else {
//				System.out.print(c+"+");
			}

		}
		String[] aNewDate = newDate.split(" ");
		int m = Integer.parseInt(aNewDate[0]);
		int d = Integer.parseInt(aNewDate[1]);
		int yr = Integer.parseInt(aNewDate[2]);

		String localDate = LocalDate.of(yr, m, d).getDayOfWeek().name();
		System.out.println("Falls on a " + localDate);

//		return newDate;

	}

	static int intMonth(String month) {
		switch (month) {
		case "January":
			return Month.JANUARY.getValue();
		case "February":
			return Month.FEBRUARY.getValue();
		case "March":
			return Month.MARCH.getValue();
		case "April":
			return Month.APRIL.getValue();
		case "November":
			return Month.NOVEMBER.getValue();
		case "December":
			return Month.DECEMBER.getValue();
		default:
			return 0;
		}

	}

}
