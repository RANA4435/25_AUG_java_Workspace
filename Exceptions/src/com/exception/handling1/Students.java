
package com.exception.handling1;

public class Students {

	public static void main(String[] args) {

		System.out.println("The main started");

		Students std = new Students();

		std.registerStudent(null);

		System.out.println("The main ended");
	}

	public void registerStudent(String name) {

		System.out.println("The Register method started");

		boolean validateStudent = validateStudent(name);

		if (validateStudent) {
			System.out.println("Student is valid");
		} else {
			System.out.println("Student is invalid");
		}

		System.out.println("The register method Ended");
	}


private boolean validateStudent(String name) {

    try {

        System.out.println("Student name length = " + name.length());

        if (name != null && name.length() > 3) {
            return true;
        } else {
            return false;
        }

    } catch (NullPointerException e) {

        System.out.println("Student name cannot be null");
        e.printStackTrace();

        return false;
    }
}

}
