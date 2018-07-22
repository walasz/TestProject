package Data;

import java.util.Random;

import Subjects.Subject;


public class Student extends Teacher {
	
		Random number = new Random();
		int n = number.nextInt(50) + 1;
	 

		private Byte age;
		private Float GradeAverage;
		
		
		public Byte getAge() {
			return age;
		}
		public void setAge(Byte age) {
			this.age = age;
		}
		
		
		
		public Float getGradeAverage() {
			return GradeAverage;
		}
		public void setGradeAverage(Float gradeAverage) {
			GradeAverage = gradeAverage;
		}
		
		
		
		public void HTeacher(Teacher a) {
		
		}
	
		public void FavoriteSubjects(Subject a, Subject b) {
	
	
		}
		
		
		public void knowledge () {
		
			
		}
		
		
		Student jános = new Student();
		

}
