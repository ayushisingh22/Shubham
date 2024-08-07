package com.tnsif.daythirteen.syncronization;

public class InsufficientBalanceExceptionn extends Exception {

	public InsufficientBalanceExceptionn()
	{
		super("insufficient balance in your account .");
	}
	
	public InsufficientBalanceExceptionn(String message)
	{
		super(message);
	}
}