package com.loop7;

public class Driver {
	public static void main(String args[]) {
		String cities[] = {"Delhi", "Mumbai", "Pune", "Bengaluru", "Chennai", "Hyderabad", "Kolkata", "Jaipur",
				"Delhi", "Mumbai", "Pune", "Agra", "Lucknow", "Surat", "Bhopal", "Chennai", "Indore", "Nagpur",
				"Jaipur", "Kochi", "Delhi", "Mumbai", "Agra", "Pune", "Lucknow", "Bhopal", "Chennai", "Surat", "Delhi",
				"Kolkata" };
		System.out.println(cities.length );
		for (int index = 0; index < cities.length; index++) {
			String currentCity = cities[index];

			if (currentCity.equals("Agra")) {
			}
			System.out.println("Agra is the part of city list");
			break;
		}
	}

}
