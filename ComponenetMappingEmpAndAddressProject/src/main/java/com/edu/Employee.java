package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HibernateEmployee")
public class Employee
{
	@Id
	@Column(name="employee_id")
	private int eid;
	@Column(name="employee_name",length=30)
	private String ename;

	Address ad;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public Employee(int eid, String ename, Address ad) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ad = ad;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ad=" + ad + "]";
	}
	

	
	
}
