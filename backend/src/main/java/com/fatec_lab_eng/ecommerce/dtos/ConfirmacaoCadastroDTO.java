package com.fatec_lab_eng.ecommerce.dtos;

public class ConfirmacaoCadastroDTO {
	
	private String message;
	private boolean success;
	
	public ConfirmacaoCadastroDTO() {
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	

}
