package a23_예외;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Message{
	private String name;
}

public class ExceptionEx {
	//예외처리 : 프로그램이 정상적으로 종료될수 있게 함 try catch
	
	public void test() throws IndexOutOfBoundsException, NullPointerException, Exception { //예외가 발생할 수 있으니 try catch를 해라 -> 예외처리 미루기(호출하는 쪽에)
		System.out.println("test");
	}

	public static void main(String[] args) {
		ExceptionEx ex = new ExceptionEx();
		
		try {
			ex.test();
		} catch (Exception e2) { //다른 excetion 두개를 || 로 같이 넣을 수 있음)
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		try {
			ex.test();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			if(1 == 1) {
				throw new NullPointerException("값이 비었어요!"); 	
			}			
		}catch(Exception e){
			System.out.println("빈값 오류 처리");
		}
		try {
			if(1 == 1) {
				throw new CustomException("오류가 났어요!"); //catch로 넘김	-> 밑에것도 다 실행됨
			}						
		}catch(Exception e){
			System.out.println("커스텀 오류 처리");
		}
		
		if(1 == 1) {
			throw new CustomException("오류가 났어요!"); //밑에거 실행 안하고 CustomException 클래스로 넘어감	
		}	
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Message> messageList = new ArrayList<Message>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i + 1);
			if(i % 2 == 0) {
				messageList.add(new Message("test"));				
			}else {
				messageList.add(null);
			}
		}
		
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println(list.get(i));
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.println(messageList.get(i).getName());
			}
			
			
			//System.out.println("문서 저장");
		}catch(IndexOutOfBoundsException boundsException) {
			boundsException.printStackTrace(); //빠지면 오류가 어디서 났는지 모름
		}catch(NullPointerException nullPointerException){ 
			nullPointerException.printStackTrace();
		}catch(Exception exception) { //예외처리 최상위 / 모든예외를 다 받아들임 / 마지막에 씀
			exception.printStackTrace();
		}finally { //try catch 후에 공통적으로 실행되어야 하는 것들을 넣음
			System.out.println("문서 저장");
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
	}

}
