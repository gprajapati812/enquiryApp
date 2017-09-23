package com.cg.enquirymngmt.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.enquirymngmt.bean.EnquiryDetails;

public interface IEquiryDao {

	public EnquiryDetails getEnquiryById(int e_id) throws IOException, SQLException;
	public ArrayList<EnquiryDetails> getAllEnquiry() throws IOException, SQLException;
	public int insertEnquiryDao(EnquiryDetails ed) throws SQLException, IOException;
	
	
}
