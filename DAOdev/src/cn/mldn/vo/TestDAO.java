package cn.mldn.vo;

import java.util.Iterator;
import java.util.List;

import cn.mldn.factory.DAOFactory;

public class TestDAO {

	public static void main(String[] args) throws Exception {
		//testInsert();
		//testSelect();
		testSelectById(2);
	}
	
	public static void testInsert() throws Exception{
		Emp emp = null;
		for(int x = 0; x < 5; x++){
			emp = new Emp();
			emp.setEmpno(1000 + x);
			emp.setEname("emma" + x);
			emp.setJob("sdc" + x);
			emp.setHiredate(new java.util.Date());
			emp.setSal(500 * x);
			DAOFactory.getIEmpDAOInstance().doCreate(emp);
		}
	}
	
	public static void testSelect() throws Exception{
		List<Emp> all = DAOFactory.getIEmpDAOInstance().findAll("");
		Iterator<Emp> iter = all.iterator();
		while(iter.hasNext()){
			Emp emp = iter.next();
			System.out.println(emp.getEmpno() + "," + emp.getEname() + "->" + emp.getJob());
		}
	}

	public static void testSelectById(int empno) throws Exception{
		Emp emp = null;
		emp = DAOFactory.getIEmpDAOInstance().findById(empno);
		if(emp != null){
			System.out.println(emp.getEmpno() + "," + emp.getEname() + "->" + emp.getJob());
		}
	}
}
