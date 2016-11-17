package cn.mldn.dao;
import java.util.List;
import cn.mldn.vo.Emp;
public interface IEmpDAO {
	  
	/**
	 * add data. named with doXxx
	 * @param emp: added data object
	 * @return whether: added successfully.
	 * @throws Exception: if there are any exceptions, offer them to calling location.
	 */
	public boolean doCreate(Emp emp) throws Exception;
	
	/**
	 * query all data, named with findXxx
	 * @param keyWord: query key word
	 * @return return the full query result. every Emp object shows one line entry of the database table
	 * @throws Exception
	 */
	public List<Emp> findAll(String keyWord) throws Exception;
	
	/**
	 * query employer information based on id
	 * @param empno: employer id
	 * @return Emp: employer's vo instance.
	 * @throws Exception
	 */
	public Emp findById(int empno) throws Exception;
}
