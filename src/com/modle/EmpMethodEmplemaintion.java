package com.modle;

import java.util.ArrayList;


import java.util.Scanner;

import com.Exception.EmpException;
import com.been.EmpBeen;
import com.controller.EmpController;

import com.validation.EmpValidation;

public class EmpMethodEmplemaintion {

	 static ArrayList<EmpBeen>list=new ArrayList<EmpBeen>();
	 static Scanner s=new Scanner(System.in);
	        EmpController c=new EmpController();
	       static EmpBeen b1;
	      
	       public static void empMethod() {
		    		
	    		while(true) 
	    		{
	    		System.out.println("          ");
	    		System.out.println("Employee Management System.....");
	    	    System.out.println("1,Add Employee");
	    		System.out.println("2.Delete Employee");
	    		System.out.println("3.View Employee");
	    		System.out.println("4.Update Employee");
	    		System.out.println("5.Serach Employee");
	    		System.out.println("6 Exit...");
	    		System.out.println("          ");
	    	    System.out.print("Choose the operation you want to perform:");  
	    		int ch=s.nextInt();
	    		switch(ch) {
	    		case 1:
	    			addEmployee();
	    			break;
	    		
	    		case 2:
	    			
	    		deleteEmployee();
	    			
	    			break;
	    		case 3:
	    			viewEmployee();
	    			break;
	    		case 4:
	    			updateEmployee();
	    			break;
	    		case 5:
	    			searchEmployee();
	    		case 6:
	    			  System.exit(0);
	    			  default:
	    				  System.out.println("Wrong Choice Sorry....");
	    		}
	    		
	    	}
	    	   }
	public 	static  void addEmployee()  {
		try {
		b1=new EmpBeen();
		 System.out.println("Enter Employee ID");
		  b1.setEmpId(s.nextInt());
		 System.out.println("Enter Employee Name");
		 b1.setEmpName (s.next()+s.nextLine());
		 System.out.println("Enter Employee Address");
		 b1.setEmpAddress(s.nextLine());
		 email();
		
	}
	   catch(Exception e)
	   {
		e.printStackTrace();
	    }
	}
	
	 public static void email() throws EmpException  {
		
	 System.out.println("Enter Employee Email");
	 String email=s.nextLine();
	String  b= EmpValidation. validateEmail(email);
	String str="Vaild";
	 if(b!=str)
	 {
		 throw new EmpException("InVaild EmailId.......Try Again");
	 }
	 
	 else {
		 b1.setEmpEmail(email);
		 list.add(b1);
		 System.out.println("Add Employee Sucessfully....");
	
	 }
			 }
	public static void deleteEmployee() {
		if(!list.isEmpty())
		{	

		while(true)
		{
		
			System.out.println("Delete Employee Informaion...");
			System.out.println("1.View Employee Informaion...");
			System.out.println("2. Delete Employee Informaion");
			System.out.println("3.Exit");
			System.out.println("Choose the operation you want to perform:");
			int ch =s.nextInt();
			switch(ch)
			{
			case 1:
				viewEmployee();
				break;
			case 2:
				
				System.out.println("2.Enter Delete Employee Id");
				int id=s.nextInt();
				
					
				for(EmpBeen o:list)
				{
					if(id==o.getEmpId())
					{
						list.remove(o);
						System.out.println("Employee Informaition Delete Sucessfully....");
						break;
					}
				}
				break;
			case 3:
		        empMethod() ;
			default:
        		System.out.println("Wrong choice Try Again...");		
			}
		}
		}
		else {
			System.out.println("List Is Empty....");
		empMethod() ;
		}
	}
	public static void viewEmployee() {
		if(!list.isEmpty())
		{
      System.out.println("Employee Details are.....");
		for(EmpBeen o:list)
	
		{
		
			     System.out.println(" Employee id= "+o.getEmpId());
				  System.out.println(" Employee Name="+o.getEmpName());
				  System.out.println(" Employee Address="+o.getEmpAddress());
				  System.out.println(" Employee Email= "+o.getEmpEmail());
				  System.out.println("              ");
		}
		 
	}
	
	else
	{
		System.out.println("List is Empty....");
		empMethod() ;
	}
	}
	public static void updateEmployee() {
		if(!list.isEmpty())
		{
		while(true)
		{
		System.out.println("Update Employee Informaition....");
		System.out.println("1.View Employee....");
		
		System.out.println("2.Update Employeee Informaition");
		System.out.println("3.Exit");
		
		System.out.println("Choose the operation you want to perform:");
		int ch =s.nextInt();
		switch(ch)
		{
		case 1:
			viewEmployee();
			break;
		case 2:
			
			System.out.println("Enter Update  Employee Id");
			int id=s.nextInt();
			for(EmpBeen o:list)
			{
				if(id==o.getEmpId())
				{
					System.out.println(o.getEmpName());
					while(true)
			     	{
						System.out.println("       ");
					System.out.println("1.Enter Update  Employee Id= "+o.getEmpId());
					System.out.println("2.Enter Update  Employee Name= "+o.getEmpName());
					
					System.out.println("3.Enter Update  Employee Address= "+o.getEmpAddress());
					
					System.out.println("4.Enter Update  Employee Email= "+o.getEmpEmail());
					System.out.println("5.Exit....");
					System.out.println("Choose the operation you want to perform:");
					int c=s.nextInt();
					switch(c)
					{
					case 1:

						System.out.println(".Enter Update  Employee Id");
						o.setEmpId(s.nextInt());
						//list.add(o);
						System.out.println("indexof="+list.indexOf(b1));
						
						//list.set(index, element)
						System.out.println("Employee Id Update Sucessfully...");
						break;
					case 2:
						System.out.println(".Enter Update  Employee Name");
						o.setEmpName(s.nextInt()+s.nextLine());
						//list.add(o);
						System.out.println("Employee Id Update Sucessfully...");
						break;
					case 3:
						System.out.println("Enter Update  Employee Address");
						o.setEmpAddress(s.nextLine());
						//list.add(o);
						System.out.println("Employee Address Update Sucessfully...");
						break;
					case 4:
						System.out.println("Enter Update  Employee Email");
						o.setEmpEmail(s.nextLine());
						//list.add(o);
						System.out.println("Employee Email Update Sucessfully...");
						break;
					case 5:
						updateEmployee();
					default:
		        		System.out.println("Wrong choice Try Again...");
					}	
				}	
			}
			}
			
		case 3:
			empMethod() ;
		default:
    		System.out.println("Wrong choice Try Again...");
				}
			}
		}
		else {
			System.out.println("List is Empty....");
			empMethod() ;
		}
	}

	public static void searchEmployee() {
		
		if(!list.isEmpty())
		{
		while(true) {
			System.out.println(" 1 Search Employee ...");
			System.out.println("2.Exit...");
			 System.out.println("Choose the operation you want to perform:");  
			 int ch=s.nextInt();
			 switch(ch) {
			 case 1:
				 System.out.println("1.Enter Search Employee Id...");
				 int id =s.nextInt();
			
				  int j=0;
						
						for(EmpBeen o:list)
						{
							
							
					
							if(o.getEmpId()==id)
							{
								System.out.println(" Employee id= "+((EmpBeen) o).getEmpId());
								  System.out.println(" Employee Name="+((EmpBeen) o).getEmpName());
								  System.out.println(" Employee Address="+((EmpBeen) o).getEmpAddress());
								  System.out.println(" Employee Email= "+((EmpBeen) o).getEmpEmail());
								  System.out.println("              ");
								
							}
						}
						
		
						break;
						
					case 2:
						empMethod();
						break;
					default:
		        		System.out.println("Wrong choice Try Again...");
						
						
			 }
			}
		}
		else
		{
			System.out.println("List Is Empty.....");
			empMethod();
			
		}
		
	}

}
