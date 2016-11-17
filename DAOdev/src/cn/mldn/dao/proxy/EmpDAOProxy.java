package cn.mldn.dao.proxy;

import java.util.List;

import cn.mldn.dao.IEmpDAO;
import cn.mldn.dao.impl.EmpDAOImpl;
import cn.mldn.dbc.DatabaseConnection;
import cn.mldn.dbc.impl.MySQLDatabaseConnection;
import cn.mldn.vo.Emp;

public class EmpDAOProxy implements IEmpDAO{
	private DatabaseConnection dbc = null;
	private IEmpDAO dao = null;
	public EmpDAOProxy() throws Exception{
		this.dbc = new MySQLDatabaseConnection();
		this.dao = new EmpDAOImpl(this.dbc.getConnection());
	}
	@Override
	public boolean doCreate(Emp emp) throws Exception {
		boolean flag = false;
		try{
			if(this.dao.findById(emp.getEmpno()) == null){
				flag = this.dao.doCreate(emp);
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}
	@Override
	public List<Emp> findAll(String keyWord) throws Exception {
		List<Emp> all = null;
		try{
			all = this.dao.findAll(keyWord);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return all;
	}
	@Override
	public Emp findById(int empno) throws Exception {
		Emp emp = null;
		try{
			emp = this.dao.findById(empno);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return emp;
	}
	
}
