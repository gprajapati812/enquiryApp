package com.cg.enquirymngmt.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.enquirymngmt.bean.EnquiryDetails;
import com.cg.enquirymngmt.dao.EnquiryImpl;
import com.cg.enquirymngmt.dao.IEquiryDao;

public class EnquiryServiceImpl implements IEnquirService{

	IEquiryDao ied = new EnquiryImpl();
	
	@Override
	public EnquiryDetails getEnquiryById(int e_id) throws IOException, SQLException {
		// TODO Auto-generated method stub

		EnquiryDetails ed = new EnquiryDetails();
		ed = ied.getEnquiryById(e_id);
		
	return ed;
	
	}

	@Override
	public ArrayList<EnquiryDetails> getAllEnquiry() throws IOException, SQLException {
		// TODO Auto-generated method stub
		return ied.getAllEnquiry();
	}

	@Override
	public int insertEnquiry(EnquiryDetails ed) throws SQLException, IOException {
		// TODO Auto-generated method stub
		return ied.insertEnquiryDao(ed);
	}

}
