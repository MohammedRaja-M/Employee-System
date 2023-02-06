package co.promon.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
	private String Message;
	private Object Data;
	public ResponseDTO(String message, Object data) {
		super();
		Message = message;
		Data = data;
	}
	
	

	
}
