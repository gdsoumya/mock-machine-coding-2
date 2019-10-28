package com.soumya.splitwise;

// Driver Application
public class SplitWiseApp {

	public static void main(String[] args) {
		// Initializing ExpenseManager Object
		ExpenseManager manager =  new ExpenseManager();
		
		// Hard Coded Users
		manager.registerUser("User1", "user1@hello.com", "+918685483458");
		manager.registerUser("User2", "user2@hello.com", "+918085483643");
		manager.registerUser("User3", "user3@hello.com", "+919056783458");
		manager.registerUser("User4", "user4@hello.com", "+919885434258");
		
		// Display Registered Users with UID
		manager.displayRegisteredUsers();
		
		// TEST - Taken from SAMPLE INPUT Section
		manager.handleRequest("SHOW");
		manager.handleRequest("SHOW u1");
		// EQUAL
		manager.handleRequest("EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL");
		manager.handleRequest("SHOW u4");
		manager.handleRequest("SHOW u1");
		// EXACT
		manager.handleRequest("EXPENSE u1 1250 2 u2 u3 EXACT 370 880");
		manager.handleRequest("SHOW");
		// PERCENT
		manager.handleRequest("EXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20");
		manager.handleRequest("SHOW u1");
		manager.handleRequest("SHOW");
		// SHARE
		manager.handleRequest("EXPENSE u4 1200 4 u1 u2 u3 u4 SHARE 2 1 1 1");
		manager.handleRequest("SHOW");
	}

}
