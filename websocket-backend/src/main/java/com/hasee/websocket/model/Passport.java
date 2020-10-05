package com.hasee.websocket.model;

public class Passport
{
	String nationality;
	String passportNo;
	String issueDate;
	String expiryDate;
	String givenName;
	String lastName;
	String dob;
	String gender;

	public String getNationality()
	{
		return nationality;
	}

	public void setNationality( String nationality )
	{
		this.nationality = nationality;
	}

	public String getPassportNo()
	{
		return passportNo;
	}

	public void setPassportNo( String passportNo )
	{
		this.passportNo = passportNo;
	}

	public String getIssueDate()
	{
		return issueDate;
	}

	public void setIssueDate( String issueDate )
	{
		this.issueDate = issueDate;
	}

	public String getExpiryDate()
	{
		return expiryDate;
	}

	public void setExpiryDate( String expiryDate )
	{
		this.expiryDate = expiryDate;
	}

	public String getGivenName()
	{
		return givenName;
	}

	public void setGivenName( String givenName )
	{
		this.givenName = givenName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName( String lastName )
	{
		this.lastName = lastName;
	}

	public String getDob()
	{
		return dob;
	}

	public void setDob( String dob )
	{
		this.dob = dob;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender( String gender )
	{
		this.gender = gender;
	}
}
