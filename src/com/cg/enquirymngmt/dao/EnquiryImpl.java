package com.cg.enquirymngmt.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.enquirymngmt.bean.EnquiryDetails;
import com.cg.enquirymngmt.dbconfig.DbUtil;

public class EnquiryImpl implements IEquiryDao {

	@Override
	public EnquiryDetails getEnquiryById(int e_id) throws IOException, SQLException {
		// TODO Auto-generated method stub
	
		Connection con = DbUtil.getConnection();
		
		String str = "Select * From EnquiryDetails where e_id = ?";
		PreparedStatement pst = con.prepareStatement(str);
		pst.setInt(1, e_id);
		ResultSet rs = pst.executeQuery();
		EnquiryDetails ed = new EnquiryDetails();
		
		while(rs.next())
		{
			ed.setEnId(rs.getInt(1));
			ed.setEn_fName(rs.getString(2));
			ed.setEn_lName(rs.getString(3));
			ed.setDomain(rs.getString(4));
			ed.setEn_phone(rs.getLong(5));
		}
		
		return ed;
		
		
	}

	@Override
	public ArrayList<EnquiryDetails> getAllEnquiry() throws IOException, SQLException {
		// TODO Auto-generated method stub

		Connection con = DbUtil.getConnection();
		
		String str = "Select * From EnquiryDetails";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(str);
		EnquiryDetails ed;
		ArrayList<EnquiryDetails> al = new ArrayList<EnquiryDetails>();
		
		while(rs.next()){
			 ed = new EnquiryDetails();
			 ed.setEnId(rs.getInt(1));
			 ed.setEn_fName(rs.getString(2));
			 ed.setEn_lName(rs.getString(3));
			 ed.setDomain(rs.getString(4));
			 ed.setEn_phone(rs.getLong(5));
			 al.add(ed);			
		}
		
		return al;
	}

	@Override
	public int insertEnquiryDao(EnquiryDetails ed) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
		int nr = 0;
		Connection con = DbUtil.getConnection();
		
		String str = "INSERT Into EnquiryDetails values(enq_seq_id.nextval,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(str);
		pst.setString(1,ed.getEn_fName());
		pst.setString(2,ed.getEn_lName());
		pst.setString(3,ed.getDomain());
		pst.setLong(4,ed.getEn_phone());
		nr = pst.executeUpdate();
		int e_id = 0;
		//System.out.println(nr);
		
		
			String sql = "select enq_seq_id.currval from enquiryDetails";
			Statement st = con.createStatement();
			ResultSet r = st.executeQuery(sql);
			while(r.next())
			{
				e_id = r.getInt(1);
			}
		
		//System.out.println("ID is "+);
		return e_id;
	}

}
