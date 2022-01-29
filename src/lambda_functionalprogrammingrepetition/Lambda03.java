package lambda_functionalprogrammingrepetition;

import java.util.ArrayList;
import java.util.List;

import lambda_method_reference_instruction_35.Courses;

public class Lambda03 {
	  
	public static void main(String[] args) {
		
	Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
	    Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
	    Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
	    Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
	    
	    List<Courses> coursesList = new ArrayList<>();//In functional programming we use list
	    coursesList.add(courseTurkishDay);
	    coursesList.add(courseTurkishNight);
	    coursesList.add(courseEnglishDay);
	    coursesList.add(courseEnglishNight);
    }
	
	 //1)Create a method to check if all average scores are greater than given number 
	 // - checkAvgScoresToBeGreaterThanGivenNumber
	
	
	
	//2)Create a method to check if at least one of the course names contains given word 
	//- checkIfAnyCourseNameContainsGivenWord
	
	//3)Create a method to print the course whose average score is the highest - 
	//printCourseNameWhoseAvgIsTheHighest 
	
	
	//4)Sort the list elements according to the average score in ascending order and skip 
	//first given - sortCourseWithAvgScoreInAscendingSkipFirstGiven 
	
	
	
	 //5)Sort the list elements according to the average score in ascending order and 
	 //print just the given one 
	
	
}