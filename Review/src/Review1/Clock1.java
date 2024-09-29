package Review1;

import java.util.Scanner;

public class Clock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int minutes = Integer.valueOf(sc.nextLine());
	     System.out.println(clock(minutes));
	}
	public static int clock(int minutes) {
		int days = minutes/720;
		int hours = minutes%720;
		int count = 0;
		int[] time = new int[] {12 , 0}; 
		for (int i = 0; i < hours; i++) {
			if (time[1] == 59) {
				if (time[0] == 12) {
					time[0] = 1;
				}
				else {
					time[0]++;
				}
				time[1] = 0;
			}
			else {
				time[1]++;
			}
			int[] series;
			if (time[0] < 10) {
				series = new int[3];
				series[0] = time[0]%10;
				series[1] = time[1]/10;
				series[2] = time[1]%10;
			}
			else {
				series = new int[4];
				series[0] = time[0]/10;
				series[1] = time[0]%10;
				series[2] = time[1]/10;
				series[3] = time[1]%10;
			}
				count += isSeries(series);
		}
		return 31*days + count;
	}
	public static int isSeries(int[]series) {
		int difference = series[1] - series[0];
		for (int i = 0; i < series.length-1; i++) {
			if (series[i+1] - series[i] != difference) {
				return 0;
			}
		}
		return 1;
	}
}
