package com.BikkadIT.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
        private int rollno;
	    private String name;
     	private String email;
	    private String address;
	    private int age;
		
	    public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + ", address=" + address
					+ ", age=" + age + "]";
		}
	
}