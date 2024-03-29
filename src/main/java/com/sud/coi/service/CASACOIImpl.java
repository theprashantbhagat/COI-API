package com.sud.coi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.sud.coi.model.PolicyDetails;
import com.sud.coi.model.RequestParameter;
import com.sud.coi.respository.PolicyDetailsMapper;

@Service
public class CASACOIImpl {
	
  @Autowired	
  private JdbcTemplate jdbcTemplate;	
	

	public List<PolicyDetails> getCasaCoi(RequestParameter request) {

		String procedureCall="CALL get_userDetails(?,?)";
		
		List<PolicyDetails> list_policyDetails = jdbcTemplate.query(procedureCall, new PolicyDetailsMapper(),request.getUser_id(),request.getName());
		
		return list_policyDetails;
	}

}
