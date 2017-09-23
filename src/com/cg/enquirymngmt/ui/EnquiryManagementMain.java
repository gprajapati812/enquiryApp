package com.cg.enquirymngmt.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.enquirymngmt.bean.EnquiryDetails;
import com.cg.enquirymngmt.service.EnquiryServiceImpl;
import com.cg.enquirymngmt.service.IEnquirService;

public class EnquiryManagementMain {

	
	public static void main(String[] args) throws IOException, SQLException {
		
		EnquiryManagementMain o = new EnquiryManagementMain();
		o.getOperations();
		
	}
	Scanner sc = new Scanner(System.in);
	
	void getOperations() throws IOException, SQLException{
		EnquiryManagementMain o = new EnquiryManagementMain();
		while(true){
		System.out.println("\n*****************************\nEnter your Choice");
		System.out.println("\n1.Display All details\n2.Get details based on Enquiry Id\n3.Add Enquiry Details \n4.Exit");
		int ch = sc.nextInt();
		switch(ch){
		case 1:
			o.getAllEnquiry();
			break;
		case 2:
			o.getByEnquiryId();
			break;
		case 3:
			o.addEnquiry();
			break;
		case 4:
			System.exit(0);
		}
		}
	}

	private void addEnquiry() throws SQLException, IOException {
	EnquiryDetails ed = new EnquiryDetails();
	System.out.println("Enter First Name :");
	ed.setEn_fName(sc.next());
	System.out.println("Enter Last Name :");
	ed.setEn_lName(sc.next());
	System.out.println("Enter Phone :");
	ed.setEn_phone(sc.nextLong());
	System.out.println("Enter Domain Name :");
	ed.setDomain(sc.next());
	
	int e_id = is.insertEnquiry(ed);
	
		System.out.println("Thank You "+ed.getEn_fName()+" "+ed.getEn_lName()+"\n Your Unique Id is "+e_id+"\nWe will contact you soon.....");
	
	}
	
	
	IEnquirService is = new EnquiryServiceImpl();
	
	private void getByEnquiryId() throws IOException, SQLException {
		// TODO Auto-generated method stub
	EnquiryDetails ed = new EnquiryDetails();
		
		System.out.println("Enter Id of Enquiry");
	int e_id = sc.nextInt();
	ed = is.getEnquiryById(e_id);
	if(ed.getEn_fName() == null){
		System.out.println("Details Not Found");
		}
	else
	{
	System.out.println("\nE_d\tE_FName\tE_LName\t\tE_Phone\tE_Domain");;
	System.out.println(ed);
	}
	}

	private void getAllEnquiry() throws IOException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("\nE_d\tE_FName\tE_LName\t\tE_Phone\tE_Domain");;
		
		ArrayList<EnquiryDetails> al = is.getAllEnquiry();
		for(EnquiryDetails ed : al){
			System.out.println(ed);	
		}
		
	}
	
}
