package org.cases.string;

import java.util.Date;

@SuppressWarnings("unused")
public class User {
	private String userName;
	private String password;
	private Date birthday;
	private String telNumber;
	private String email;
	public User(String userName,String password,Date birthday,String telNumber,String email)
	{
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
		this.telNumber = telNumber;
		this.email = email;	
	}
	@Override
	public int hashCode() {
		return this.userName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
}
