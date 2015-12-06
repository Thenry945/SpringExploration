package com.tutorialspoint;

public class HelloWorld {

	private String message;
	
	/**
	 * Sets the message string
	 * @param message
	 */
	private void setMessage(String message){
		this.message = message;
	}
	
	public void getMessage(){
		System.out.println("Your message : " + message);
	}

}
