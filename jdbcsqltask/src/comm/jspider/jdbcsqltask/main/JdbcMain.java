package comm.jspider.jdbcsqltask.main;

import java.util.InputMismatchException;
import java.util.Scanner;


import comm.jspider.jdbcsqltask.sqloperations.JdbcSqlOperations;
public class JdbcMain {

	static boolean loop=true;
	static int choice;
	static Scanner sc;
	static JdbcSqlOperations jdbcSqlOperation=new JdbcSqlOperations();
	public static void main(String[] args) {
		
		do {
			JdbcMain.operations();	
		} while (loop);	
		
	}
	
	
	public static  void operations() {
		System.out.println("\n _______MENU________\n"
	    		  +"[1] Create Table    \n"
	    		  +"[2] Insert Records  \n"
	    		  +"[3] Update Records  \n"
	    		  +"[4] Delete Records  \n"
	    		  +"[5] Display Records \n"
	    		  +"[6] Display All Tables \n"
	    		  +"[7] Drop Table \n"
	    		  +"[8] Exit ");
		System.out.print("\nEnter Your Choice :- ");
		sc=new Scanner(System.in);
			try {
				choice=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Wrong Input Enter valid number");
				return;
			}
			
		
		
		switch (choice) {
		case 1:{
			jdbcSqlOperation.sqlOperations(choice);
			break;
		}
		case 2:{
			jdbcSqlOperation.sqlOperations(choice);
			break;
		}
		case 3:{
			jdbcSqlOperation.sqlOperations(choice);
			break;
		}
		case 4:{
			jdbcSqlOperation.sqlOperations(choice);
			break;
		}
		case 5:{
			jdbcSqlOperation.sqlOperations(choice);
			break;
		}
		case 6:{
			jdbcSqlOperation.sqlOperations(choice);
			break;
		}
		case 7:{
			jdbcSqlOperation.sqlOperations(choice);
			break;
		}
		case 8:{
			System.out.println("\nThank You");
			loop=false;
			sc.close();
			break;
		}
		default:{
			System.out.println("Wrong Input ");
			break;
		}
		}
	}
	

}
