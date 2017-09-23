package com.cg.enquirymngmt.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.enquirymngmt.bean.EnquiryDetails;

public interface IEnquirService {

	public EnquiryDetails getEnquiryById(int e_id) throws IOException, SQLException;
	public ArrayList<EnquiryDetails> getAllEnquiry() throws IOException, SQLException;
	public int insertEnquiry(EnquiryDetails ed) throws SQLException, IOException;
	
}
