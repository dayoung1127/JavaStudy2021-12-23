package a17_기본클래스;

import java.util.Objects;

//object클래스 : 최상위 클래스, 상속받을 경우 부모클래스에만 생략되어있음 -> 다중상속x
//컨트롤 + 클래스이름 누르면 들어가짐
public class ObjectEx { //모든 클래스에 extends Object 가 생략되어있음
	private String username;
	private String password;
	
	@Override
	public String toString() {
		return "ObjectEx [username=" + username + ", password=" + password + "]";
	}

	@Override
	public int hashCode() { //객체 고유의 키 값
		return Objects.hash(username); //username 문자열이 고유한 키 값으로 변경됨
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectEx other = (ObjectEx) obj;
		return Objects.equals(username, other.username); //고유한 키 값이 같은지 비교
	}
	
	
/*	@Override //주소비교할때 사용
	public boolean equals(Object obj) { //매개변수가 object클래스로 업캐스팅 됨
		ObjectEx objectEx = (ObjectEx)obj; //getter setter는 자식 메소드에 있으므로 쓸려면 다운캐스팅 필요함
		if(this.username.equals(objectEx.getUsername())) {
			return true;
		}else {
			return false;
		}
	//	return super.equals(obj);	// equals 들어가보기 return (this == obj);
	} */
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	//컨트롤 스페이스
/*	@Override
	public String toString() {
//		return super.toString();
		return "다영";
	} */
	
	
}
