package cn.mldn.vo;
import java.util.Date;
/**
 * 
 * @author i317032
 * including database table's attribute, getter, and setter.
 * the attribute must be equal to database table's columns.
 */
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private Date hiredate;
	private float sal;
	
	public int getEmpno(){
		return empno;
	}
	
	public void setEmpno(int empno){
		this.empno = empno;
	}
	
	public String getEname(){
		return ename;
	}
	
	public void setEname(String ename){
		this.ename = ename;
	}
	
	public String getJob(){
		return job;
	}
	
	public void setJob(String job){
		this.job = job;
	}
	
	public Date getHiredate(){
		return hiredate;
	}
	
	public void setHiredate(Date hiredate){
		this.hiredate = hiredate;
	}
	
	public float getSal(){
		return sal;
	}
	
	public void setSal(float sal){
		this.sal = sal;
	}
}
