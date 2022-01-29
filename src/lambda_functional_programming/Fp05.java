package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Fp05 {

	public static void main(String[] args) {
		
		Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
		Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
		Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
		Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
		
		List<Courses> coursesList = new ArrayList<>();
		coursesList.add(courseTurkishDay);
		coursesList.add(courseTurkishNight);
		coursesList.add(courseEnglishDay);
		coursesList.add(courseEnglishNight);
		
		System.out.println(checkAvgScoresToBeGreaterThanGivenNumber(coursesList, 91));
		System.out.println(sortCoursesWithAvgScoreInAscendingSkipFirstGiven(coursesList, 3L));
		System.out.println(getThirdAfterSortingInAsc01(coursesList, 3));
		System.out.println(getThirdAfterSortingInAsc02(coursesList, 3));


		
		
	}
	
	//1)Create a method to check if all average scores are greater than given number
	public static boolean checkAvgScoresToBeGreaterThanGivenNumber(List<Courses> l, double avgScore) {
		return l.stream().allMatch(t->t.getAverageScore()>avgScore);
	}
	
	//2)Create a method to check if at least one of the courses name contains "Turkish" word
	public static boolean checkAnyOfCousesNameContainsGivenWord(List<Courses> l, String word) {
		return l.stream().anyMatch(t->t.getCourseName().contains(word));
	}
	
	//3)Create method to print the course whose average score is the highest
	//1.Way:
	public static String getCourseNameWhoseAvgScoreIsTheHighest(List<Courses> l) {
		return l.stream()
				.sorted(Comparator
						.comparing(Courses::getAverageScore)
						.reversed())
				.findFirst()
				.get()
				.getCourseName();
	}
	//4)Sort the list elements according to the average score in ascending order and skip first given
	public static List sortCoursesWithAvgScoreInAscendingSkipFirstGiven(List<Courses> l, long num) {
		return l.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num).collect(Collectors.toList());
	}
	
	//5)Sort the list elements according to the average score int ascending order and print just given one
	//1.Way
	public static Courses getThirdAfterSortingInAsc01(List<Courses> l, int num) {
		return l.stream()
				.sorted(Comparator.comparing(Courses::getAverageScore))
				.skip(num-1)
				.limit(num)
				.collect(Collectors.toList())
				.get(0);
	}
	
	public static Courses getThirdAfterSortingInAsc02(List<Courses> l, int num) {
		return l.stream()
				.sorted(Comparator.comparing(Courses::getAverageScore))
				.skip(num-1)
				.findFirst()
				.get();
	}
	
}
