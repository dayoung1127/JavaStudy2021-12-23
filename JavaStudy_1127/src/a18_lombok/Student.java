package a18_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//학생 이름, 학년, 반, 번호, 주소, 연락처, 생년월일
//기본생성자, 전체생성자, getter setter, hash, equal, tostring

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student {
	private String studentName;
	private String studentYear;
	private String studentClass;
	private int studentNumber;
	private String address;
	private String phone;
	private String birthday;

}
