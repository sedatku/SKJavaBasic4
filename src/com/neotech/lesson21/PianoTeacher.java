package com.neotech.lesson21;

public class PianoTeacher extends Teacher {
	
	boolean ownAPiano;
	
	
	public void playsPiano() {
		System.out.println(fullName + " plays the piano very well");
		System.out.println(fullName + " owns a piano: " + ownAPiano);
	}

	
	public static void main(String[] args) {
		PianoTeacher pt = new PianoTeacher();
		
		pt.fullName = "Fazil Say";
		pt.major = "Music";
		pt.gender = 'M';
		pt.ownAPiano = true;
		
		pt.teaches();
		pt.playsPiano();
		
	}
	
	
	
}
