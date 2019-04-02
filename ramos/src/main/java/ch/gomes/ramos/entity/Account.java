package ch.gomes.ramos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {


    private static final long serialVersionUID = -2054386655979281969L;
    
    public static final String ROLE_MANAGER = "MANAGER";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";
    
    @Id
    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "encrypted_password")
    private boolean encryptedPassword;
    
    @Column(name = "active")
    private boolean active;
    
    @Column(name = "user_role")
    private String userRole;

	public Account() {
	}

	public Account(String userName, boolean encryptedPassword, boolean active, String userRole) {
		this.userName = userName;
		this.encryptedPassword = encryptedPassword;
		this.active = active;
		this.userRole = userRole;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(boolean encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", encryptedPassword=" + encryptedPassword + ", userRole=" + userRole
				+ "]";
	}  
}
