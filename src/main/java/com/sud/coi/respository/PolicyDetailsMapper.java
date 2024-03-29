package com.sud.coi.respository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sud.coi.model.PolicyDetails;

@Repository
public class PolicyDetailsMapper implements RowMapper<PolicyDetails>{

	@Override
	public PolicyDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		PolicyDetails ps = new PolicyDetails();
		ps.setUser_Id(rs.getString("user_id"));
		ps.setUser_email(rs.getString("user_email"));
		ps.setUser_about(rs.getString("user_about"));
		ps.setUser_gender(rs.getString("user_gender"));
		ps.setUser_image_name(rs.getString("user_image_name"));
		ps.setUser_name(rs.getString("user_name"));
		ps.setUser_password(rs.getString("user_password"));
	        return ps;	}

}
