package App;

import java.util.ArrayList;
import java.util.List;

import Data.Student;
import Data.Teacher;
import School_And_Class.School;
import Subjects.Subject;

public class Main_Objects{

	public void Objects () {
		
			
		
		Subject mathematic = new  Subject();
		mathematic.setDifficult((byte) 10);
		
		
		Subject literature = new Subject();
		literature.setDifficult((byte) 2); 
		
		Subject history = new Subject();
		history.setDifficult((byte) 6);
		
		Subject info = new Subject();
		info.setDifficult((byte) 8);
		
		
		
		Student feri = new Student();
		feri.setAge((byte) 17);
		feri.setGradeAverage((float)3.7);
		
				
		Student marci = new Student();
		marci.setAge((byte) 17);
		marci.setGradeAverage((float) 4.2);
		
		
		Student bea = new Student();
		bea.setAge((byte) 18);
		bea.setGradeAverage((float) 4.5);
		
		
		Student david = new Student();
		david.setAge((byte) 16);
		david.setGradeAverage((float) 2.9);
		
		
		Student mariska = new Student();
		mariska.setAge((byte) 16);
		mariska.setGradeAverage((float) 3.5);
		
		
		Student jános = new Student();
		jános.setAge((byte) 15);
		jános.setGradeAverage((float) 5);
		
		
		Student kriszta = new Student();
		kriszta.setAge((byte) 18);
		kriszta.setGradeAverage((float) 4.7);
		
		
		Student csilla = new Student();
		csilla.setAge((byte) 15);
		csilla.setGradeAverage((float) 3.0);
		
		
		
		
		Teacher magdi = new Teacher();
		magdi.setHeadTeacher(true);
		magdi.setStrict(true);
		
		Teacher erzsi = new Teacher();
		erzsi.setHeadTeacher(false);
		erzsi.setStrict(true);
		
		Teacher anett = new Teacher();
		anett.setHeadTeacher(false);
		anett.setStrict(false);
		
		Teacher ildikó = new Teacher();
		ildikó.setHeadTeacher(true);
		ildikó.setStrict(false);
		
		School elte = new School();
		List<Object> tanarok = new ArrayList<Object>();
		tanarok.add(erzsi);
		tanarok.add(anett);
		tanarok.add(magdi);
		tanarok.add(ildikó);
		
		
		List<Object> diakok = new ArrayList<Object>();
		diakok.add(csilla);
		diakok.add(kriszta);
		diakok.add(jános);
		diakok.add(mariska);
		diakok.add(david);
		diakok.add(bea);
		diakok.add(marci);
		diakok.add(feri);
		
		List<Object> tantargyak = new ArrayList<Object>();
		tantargyak.add(literature);
		tantargyak.add(mathematic);
		tantargyak.add(history);
		tantargyak.add(info);
		
	}
	
	
		
		
	

}
