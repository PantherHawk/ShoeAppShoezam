package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Credentials;

@RestController
@RequestMapping("/s3_credentials")
public class CredentialsController {

	private static Credentials S3credentials;
	CredentialsController(Credentials credentials) {
		credentials.setAccessKey("AKIAIP3L7I4QLMVMGEEA");
		credentials.setSecretKey("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");
		credentials.setS3_url("https://s3.us-east-2.amazonaws.com");
		credentials.setS3_bucket("shoezam");
		
		S3credentials = credentials;
	}
	
	@GetMapping
	public Credentials getCreds() {
		return S3credentials;
	}
}
