package com.ragnax.arrastrameorquestador.exception;

import java.io.Serializable;

public class ArrastrameGruaOrquestadorException extends Exception implements Serializable{

	private static final long serialVersionUID = 9091284050715615670L;

	public ArrastrameGruaOrquestadorException(){
		super();
	}

	public ArrastrameGruaOrquestadorException(String message){
		super(message);
	}
	
	public ArrastrameGruaOrquestadorException(String message, Throwable cause){
		super(message, cause);
	}
	
	
	public ArrastrameGruaOrquestadorException(Throwable cause){
		super(cause);
	}
}
