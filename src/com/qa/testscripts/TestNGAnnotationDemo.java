package com.qa.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {

	//	Flow : 1 
	//
	// Login() --> FundTransfer() --> Acknowledgement() --> 
	// Utility Bill payment --> Acknowledgement()-->
	// CreditCard Bill payment --> Acknowledgement() --> Logout
	
	@BeforeTest
	public void setUp() {
	Reporter.log("Invoking the browser",true);
	}
	
	@AfterTest
	public void tearDown() {
		Reporter.log("Closing the browser" , true);
	}

	@BeforeMethod
	public void CheckBalance() {		
		Reporter.log("I am check balance method",true);
	}


	@BeforeClass
	public void Login() {
		Reporter.log("I am a Login method",true);
	}

	@AfterClass
	public void Logout() {
		Reporter.log("I am Logout method",true);
	}

	@Test(priority=0)
	public void addPayee() {
		Reporter.log("I am add Payee method", true);
		Assert.assertTrue(true);
	}
	
	@Test(priority=1,dependsOnMethods="addPayee",invocationCount=3)
	public void fundTransfer() {
		Reporter.log("I am Fund transfer method",true);
	}

	@Test(priority=2, groups="Payments")
	public void UtilityBillPayment() {
		Reporter.log("I am Utility Bill Payment",true);
	}

	@Test(priority=3, groups="Payments",enabled=false)
	public void CreditCardBillPayment() {
		Reporter.log("I am credit card bill payment",true);
	}
	
	@BeforeGroups({"Insurance"})
	public void standingInstructions() {
		Reporter.log("I am Standing Instruction methods", true);
	}
	
	@AfterGroups({"Insurance"})
	public void Reminder() {
		Reporter.log("I am reminder method",true);
	}
	
	@Test(priority=4, groups={"Insurance"})
	public void PayHealthInsurance() {
		Reporter.log("I am Pay Health Insurance method", true);
	}
	
	@Test(priority=5, groups={"Insurance"})
	public void PayCarInsurance() {
		Reporter.log("I am Car Insurance method" , true);
	}

	@AfterMethod
	public void getAcknowledgement() {
		Reporter.log("I am an acknowledgement method",true);
	}
}
