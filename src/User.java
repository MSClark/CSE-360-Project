/*
 * Matthew Clark 
 * CSE 360 Efferent Patient Care project
 * Spring '15 Balasooriya 10:10-11:20
 * 	
 * User class stores the basic information for each user in the system rather that be a doctor or a patient. The doctor or patient classes
 * will inherit this basic information. User objects are stored in a text file that both read and written to. User only reads this file. 
 * 
 * To do: 
 * link with login UI
 * parse function
 * 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
//i named the class cereal because I have lame jokes
//implements serializable so we can store users as objects and retrieve them
//private vars for each var listed in user class diagram
	protected String name;
	protected String email;
	protected String phoneNumber;
	protected String streetAddress;
	protected String cityStateAddress;
	protected String password;
	
	public User(String name,  String email, String phoneNumber, String sAddress, String csAddress, String password){
//constructor method		
		this.name=name;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.streetAddress = sAddress;
		this.cityStateAddress = csAddress;
		this.password=password;
	}
	
	//accessor methods for each var	
	public String getname(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getStreetAddress()
	{
		return streetAddress;
	}
	
	public String getCityStateAddress()
	{
		return cityStateAddress;
	}
	
	public String getPassword(){
		return password;
	}
	
	//setter methods for each var	
	public void setName(String name){
		this.name=name;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	
	public void setStreetAddress(String address)
	{
		this.streetAddress = address;
	}
	
	public void setCityStateAddress(String address){
		this.cityStateAddress = address;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	

	}

