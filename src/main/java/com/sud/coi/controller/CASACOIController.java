package com.sud.coi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sud.coi.model.PolicyDetails;
import com.sud.coi.model.RequestParameter;
import com.sud.coi.service.CASACOIImpl;



@RestController
public class CASACOIController {
	
	@Autowired
	private CASACOIImpl casacoiImpl;
	
	@PostMapping("/getCasaCOI")
	public ResponseEntity<List<PolicyDetails>> getCasaCoi(@RequestBody RequestParameter request){
		
	List<PolicyDetails> casaCoi2 = this.casacoiImpl.getCasaCoi(request);
		
		return new ResponseEntity<List<PolicyDetails>>(casaCoi2,HttpStatus.OK);
	}

}
