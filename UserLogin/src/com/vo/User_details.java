package com.vo;

public class User_details {
	private String uid, uname,email,pno, addrs;

	public User_details(String uid, String uname, String email, String pno,
			String addrs) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.pno = pno;
		this.addrs = addrs;
	}

	public User_details() {
		super();
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "User_details [uid=" + uid + ", uname=" + uname + ", email="
				+ email + ", pno=" + pno + ", addrs=" + addrs + "]";
	}
	

}
