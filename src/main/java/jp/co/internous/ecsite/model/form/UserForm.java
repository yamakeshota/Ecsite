package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
//Serializableの呪文を唱えることで、データベースと接続
//カラムに入っているすべてのデータを入れてあげること。
public class UserForm implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String fullName;
	private int isAdmin;
	private String userName;
	private String password;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getUserName() {
	return userName;
	}
	public void setUserName(String userName) {
	this.userName = userName;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}


}

