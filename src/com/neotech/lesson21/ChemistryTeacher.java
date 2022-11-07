package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher {

	boolean teachesApChemistry;

	public void doesExperiment() {
		System.out.println(fullName + " does CHEMISTRY experiments");
		System.out.println(fullName + " teaches AP Chemistry: " + teachesApChemistry);

	}

	public static void main(String[] args) {
		ChemistryTeacher ct = new ChemistryTeacher();
		ct.fullName = "Walter White";// coming from base class
		ct.major = "Chemistry"; // coming from base class
		ct.teachesApChemistry = true; // coming from current class

		ct.teaches(); // coming from base class
		ct.doesExperiment(); // coming from base class
	}

}
