package cn.mldn.factory;

import cn.mldn.dao.IEmpDAO;
import cn.mldn.dao.proxy.EmpDAOProxy;

public class DAOFactory {
	public static IEmpDAO getIEmpDAOInstance() throws Exception{
		return new EmpDAOProxy();
	}
}
