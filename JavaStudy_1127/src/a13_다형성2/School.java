package a13_다형성2;

public class School {
	public static void main(String[] args) {
		//service 생성 후 배열 설정
		SchoolService schoolservice = new SchoolService();
		Person[] persons = schoolservice.setPersonArray();
		
		//모든 배열에 학생 및 선생님 정보 등록
		schoolservice.insertPerson(persons);
		
		
		//모든 배열의 학생 및 선생님 정보 출력
		schoolservice.showInfoPerson(persons);
		

		

		//학생이면 학생정보, study()  instanceof
		//선생님이면 선생님정보, studyClass() instanceof
		
		
		
	}
}