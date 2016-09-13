package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ATMTest {
	
	private ATM testATM; 
	private ATM test2ATM;

	@Before
	public void setUp() throws Exception {
		testATM = new ATM(20.4);
		test2ATM = new ATM();
		
	}

	@After
	public void tearDown() throws Exception {
		testATM = null;
		test2ATM = null;
	}

	@Test
	public void testATM() {
		double actual = test2ATM.getBalance();
		double expected = 0;
		assertEquals(expected,actual,0);	

	}

	@Test
	public void testATMDouble() {
		double actual = testATM.getBalance();
		double expected = 20.4;
		assertEquals(expected,actual,0);	
		}

	@Test
	public void testDeposit() {
		testATM.deposit(10.4);
		double actual = testATM.getBalance();
		double expected = 30.8;		
		assertEquals(expected,actual,0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDepositException(){
		testATM.deposit(-2.3);			
	}
	
	@Test
	public void testGetBalance() {
		double actual = testATM.getBalance();
		double expected = 20.4;
		assertEquals(expected,actual,0);
	}

	@Test
	public void testToString() {
		String actual = testATM.toString();
		String expected = "Amount balance is $20.40";
		assertEquals(expected,actual);
	}

	@Test
	public void testWithdraw() {
		testATM.withdraw(10.4);
		double actual = testATM.getBalance();
		double expected = 10.0;		
		assertEquals(expected,actual,0);
	}
	
	@Test
	public void testWithdrawAmount() {
		double actual = testATM.withdraw(10.4);
		double expected = 10.4;		
		assertEquals(expected,actual,0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWithdrawException(){
		testATM.withdraw(432432.0);			
	}

}
