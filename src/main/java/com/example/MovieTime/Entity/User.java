package com.example.MovieTime.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserTable")
public class User {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "user_Id")
	    private int userId;

	    @Column(name = "user_Name", nullable = false)
	    private String userName;

	    @Column(name = "user_Email", nullable = false, unique = true)
	    private String userEmail;

	    @Column(name = "user_Phone", nullable = false, unique = true)
	    private String userPhone;

	    @Enumerated(EnumType.STRING)
	    @Column(name = "user_Type", nullable = false)
	    private UserType userType;

	    @Column(name = "user_Password", nullable = false)
	    private String userPassword;

	    @Column(name = "user_ConfirmPassword", nullable = false)
	    private String userConfirmPassword;

	    @Enumerated(EnumType.STRING)
	    @Column(name = "user_Gender")
	    private UserGender userGender;
	    
	    public enum UserType {
	        Admin, User
	    }

	    public enum UserGender {
	        Male, Female, Other
	    }

		public User() {
		}

		public User(int userId, String userName, String userEmail, String userPhone, UserType userType,
				String userPassword, String userConfirmPassword, UserGender userGender) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.userEmail = userEmail;
			this.userPhone = userPhone;
			this.userType = userType;
			this.userPassword = userPassword;
			this.userConfirmPassword = userConfirmPassword;
			this.userGender = userGender;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getUserPhone() {
			return userPhone;
		}

		public void setUserPhone(String userPhone) {
			this.userPhone = userPhone;
		}

		public UserType getUserType() {
			return userType;
		}

		public void setUserType(UserType userType) {
			this.userType = userType;
		}

		public String getUserPassword() {
			return userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

		public String getUserConfirmPassword() {
			return userConfirmPassword;
		}

		public void setUserConfirmPassword(String userConfirmPassword) {
			this.userConfirmPassword = userConfirmPassword;
		}

		public UserGender getUserGender() {
			return userGender;
		}

		public void setUserGender(UserGender userGender) {
			this.userGender = userGender;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPhone="
					+ userPhone + ", userType=" + userType + ", userPassword=" + userPassword + ", userConfirmPassword="
					+ userConfirmPassword + ", userGender=" + userGender + "]";
		}
		
		

}