package com.sud.coi.model;

public class PolicyDetails {
	
	
    private String user_Id;
	
	private String user_about;
	private String user_email;
	private String user_gender;
	private String user_image_name;
	private String user_name;
	private String user_password;
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_about() {
		return user_about;
	}
	public void setUser_about(String user_about) {
		this.user_about = user_about;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getUser_image_name() {
		return user_image_name;
	}
	public void setUser_image_name(String user_image_name) {
		this.user_image_name = user_image_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "PolicyDetails [user_Id=" + user_Id + ", user_about=" + user_about + ", user_email=" + user_email
				+ ", user_gender=" + user_gender + ", user_image_name=" + user_image_name + ", user_name=" + user_name
				+ ", user_password=" + user_password + "]";
	}
	public PolicyDetails(String user_Id, String user_about, String user_email, String user_gender,
			String user_image_name, String user_name, String user_password) {
		super();
		this.user_Id = user_Id;
		this.user_about = user_about;
		this.user_email = user_email;
		this.user_gender = user_gender;
		this.user_image_name = user_image_name;
		this.user_name = user_name;
		this.user_password = user_password;
	}
	public PolicyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
