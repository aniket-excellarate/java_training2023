package com.encora.util;

public class MyDate {
	
	public int day;
	
	public int month;
	
	public int year;
	
	public MyDate(int day,int month,int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
		this.day = day;
		
	}
		
		
		

		public void setMonth(int month) {
		this.month = month;
		if(month> 12)
			this.month = 12;
		else if (month <1 )
			this.month = 1;
		}
			
		public void setDay(int day) {
		this.day = day;
		if(this.day>31)
			this.day = 31;
		else if (day< 1)
			this.day = 1;
		}
	
		public void setYear(int year) {
			this.year = year;
		if(year< 2023)
			this.year = 2023;
		else if (year>2030)
			this.year = 2030;
		}
		
		
		

		public int getDay() {
		return day;
	}


	public int getMonth() {
		return month;
	}


	public int getYear() {
		return year;
	}



		public String toString() {
			return day+"-"+month+"-"+year;
		
	}
}