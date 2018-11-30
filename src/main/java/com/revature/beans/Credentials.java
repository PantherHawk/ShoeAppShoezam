package com.revature.beans;

public class Credentials {

	private String accessKey;
	private String secretKey;
	private String S3_url;
	private String S3_bucket;
	
	
	public Credentials(String accessKey, String secretKey, String s3_url, String s3_bucket) {
		super();
		this.accessKey	= accessKey;
		this.secretKey	= secretKey;
		this.S3_url			= s3_url;
		this.S3_bucket		= s3_bucket;
	}
	public String getAccessKey() {
		return accessKey;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getS3_url() {
		return S3_url;
	}
	public void setS3_url(String s3_url) {
		S3_url = s3_url;
	}
	public String getS3_bucket() {
		return S3_bucket;
	}
	public void setS3_bucket(String s3_bucket) {
		S3_bucket = s3_bucket;
	}
	
	
}
