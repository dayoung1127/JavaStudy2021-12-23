package a19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message<T> { //<T extends User> 일 경우 Message<String> <-  스트링 못넣음
	private int code;
	private T data;
}
