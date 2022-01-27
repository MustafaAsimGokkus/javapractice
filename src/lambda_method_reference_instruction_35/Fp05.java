package lambda_method_reference_instruction_35;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class Fp05 {
   
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
    
    System.out.println(checkAvgScoresToBeGreaterThanGivenNumber(coursesList,93));
    System.out.println(checkIfAnyCourseNameContainsGivenWord(coursesList,"Turkish"));//true
    System.out.println(printCourseNameWhoseAvgIsTheHighest(coursesList));
    System.out.println(sortCourseWithAvgScoreInAscendingSkipFirstGiven(coursesList,3L));
    System.out.println(getGivenAfterSortingInAsc01(coursesList,2));
    System.out.println(getGivenAfterSortingInAsc02(coursesList,2));
    
    
    
    
    }
    
  //1)Create a method to check if all average scores are greater than given number - checkAvgScoresToBeGreaterThanGivenNumber
    public static boolean checkAvgScoresToBeGreaterThanGivenNumber(List<Courses> list,double avgScore) {
    return list.stream().allMatch(t->t.getAverageScore()>avgScore);	
    }

    
 
  //2)Create a method to check if at least one of the course names contains given word - checkIfAnyCourseNameContainsGivenWord
  
   public static boolean checkIfAnyCourseNameContainsGivenWord(List<Courses>list,String word) {
	   return list.stream().anyMatch(t->t.getCourseName().contains(word));
   }
     
  //3)Create a method to print the course whose average score is the highest - printCourseNameWhoseAvgIsTheHighest 
    
  public static String printCourseNameWhoseAvgIsTheHighest(List<Courses>list) {
	  Courses obj = list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get();
	  return obj.getCourseName();
  }
   
    
    
    
  //4)Sort the list elements according to the average score in ascending order and skip first given - sortCourseWithAvgScoreInAscendingSkipFirstGiven  
  public static List<Courses> sortCourseWithAvgScoreInAscendingSkipFirstGiven(List<Courses> list,Long num) {
	  
	return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num).collect(Collectors.toList());
  }
    
    
    
  //5)Sort the list elements according to the average score in ascending order and print just the given one 
    
    //1.way  getGivenAfterSortingInAsc01
  public static List<Courses> getGivenAfterSortingInAsc01(List<Courses> list,int num) {
	  return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num-1).limit(1).collect(Collectors.toList());
 
  }
    
    //2.way  getGivenAfterSortingInAsc02
  public static Courses getGivenAfterSortingInAsc02(List<Courses> list,int num) {
	  return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num-1).findFirst().get();
  }
 
    
    }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

