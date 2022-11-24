package com.Employee.entity;

public class EmployeementRecord {

	private Integer cid;

	private String cName;

	private String cEmail;

	private Integer years;

	private Integer empId;

	public EmployeementRecord(Integer cid, String cName, String cEmail, Integer years, Integer empId) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.cEmail = cEmail;
		this.years = years;
		this.empId = empId;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
