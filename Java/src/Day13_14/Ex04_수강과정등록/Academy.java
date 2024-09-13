package Day13_14.Ex04_수강과정등록;

import java.util.ArrayList;
import java.util.List;

public class Academy {
	
	public static void main(String[] args) {
		
		// 일반인 과정 생성
		List<Person> personList = new ArrayList<Person>();
		personList.add( new Person("배순카이") );
		personList.add( new Worker("배순명") );
		personList.add( new Student("컹순영") );
		personList.add( new HighStudent("럭슨영") );
		personList.add( new MiddleStudent("야비영") );
		Course<Person> personCourse = new Course<Person>( personList );
		personCourse.createCourse("일반인과정", personCourse);
		personCourse.printStudentList(personCourse);
		
		// 직장인 과정
		List<Worker> workerList = new ArrayList<Worker>();
		workerList.add( new Worker("석슨영") );
		workerList.add( new Worker("캉슨영") );
		workerList.add( new Worker("콩슨영") );
		Course<? super Worker> workerCourse = new Course<Worker>( workerList );
		Course<?> createdWorkerCourse = workerCourse.createWokerCourse("직장인과정", workerCourse);
		Course<?> createdWorkerCourse2 = workerCourse.createWokerCourse("직장인과정2", personCourse);
		workerCourse.printStudentList(createdWorkerCourse);
		workerCourse.printStudentList(createdWorkerCourse2);
		
		// 학생 과정
		List<Student> studentList = new ArrayList<Student>();
		studentList.add( new Student ("배신고"));
		studentList.add( new HighStudent ("신고맨"));
		studentList.add( new MiddleStudent ("배모락"));
		// studentList.add( new Student ("배춧잎"));
		// studentList.add( new Student ("배춧가루"));
		Course<? extends Student> studentCourse = new Course( studentList );
		studentCourse.createStudentCourse("학생과정", studentCourse);
		// studentCourse.createStudentCourse("직장인과정", workerCourse);
		// studentCourse.createStudentCourse("일반인과정", personCourse);
		
		List<MiddleStudent> middleStudentList = new ArrayList<MiddleStudent>();
		middleStudentList.add( new MiddleStudent("배카츄") );
		Course<MiddleStudent> middleStudentCourse = new Course(middleStudentList);
		middleStudentCourse.createStudentCourse("중학생과정", middleStudentCourse);
		// * wokerCourse.createWokerCOurse("직장인과정3", studentCourse);
		// * 직장인 과정은 학생 과정 세팅을 개설할 수 없다.
		
		studentCourse.printStudentList(studentCourse);
		studentCourse.printStudentList(middleStudentCourse);
		
		
		
	}

}










