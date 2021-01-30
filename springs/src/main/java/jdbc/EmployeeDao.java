package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public EmployeeDao() {
		super();
	}

	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

//insert method
	public int saveEmployee(Employee e) {
		return jdbcTemplate.update("insert into employeeinfo values(?,?,?)",
				new Object[] { e.getId(), e.getName(), e.getSalary() });
	}

//update method
	public int updateEmployee(Employee e) {
		String query = "update employeeinfo set name=?,salaryinfo=? where id=?";
		return jdbcTemplate.update(query, new Object[] { e.getName(), e.getSalary(), e.getId() });
	}

//delete by id method
	public int deleteEmployeeById(int id) {
		String query = "delete from employeeinfo where id=?";
		return jdbcTemplate.update(query, new Object[] { id });
	}

//delete by id method
	public int deleteEmployeeByName(String name) {
		String query = "delete from employeeinfo where name=?";
		return jdbcTemplate.update(query, new Object[] { name });
	}
//Get count no of EmployeeInfo:	
//	public int noOfEmployees() {
//	String SQL = "select count(*) from EmployeeInfo";
//	// as query returns only number use queryForInt() method
//	int rowCount = jdbcTemplate.queryForInt( SQL );
//	return rowCount;
//	}
//get Employee name by id	

//	public String getEmployeeById(int id) {
//		String SQL = "select name from EmployeeInfo where id = ?";
//		// as query returns only string use queryForObject() method by passing
//		String name = jdbcTemplateObject.queryFor(SQL, new Object[] { id }, String.class);
//		return name;
//
//	}

	public float getSalaryById(int id) {
		String SQL = "select salaryinfo from EmployeeInfo where id=?";
		// as query returns only Float use queryForObject() method by passing
		Float salary = jdbcTemplate.queryForObject(SQL, new Object[] { id }, Float.class);
		return salary;
	}
//	1.create obj for ResultSetExtractor using anonymous inner class and override extractData() method.
//	2.in extractData() method , write the mapping logic for converting row to java object.
//	3.jdbcTemplateObj.query() and pass 
//	<SQL QUERY> ,<data to query> , <object of ResultSetExtractor>

	public Employee getEmpById1(int id) {
		ResultSetExtractor<Employee> extractor = new ResultSetExtractor<Employee>() {
			@Override
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				Employee e = null;
				if (rs.next()) {
					int id = rs.getInt("ID");
					String myname = rs.getString("NAME");
					long sal = rs.getLong("SALARYINFO");
					e = new Employee(id, myname, sal);
				}
				return e;
			}
		};

		return jdbcTemplate.query("select * from employeeinfo where id =?", new Object[] { id }, extractor);
	}

	public Employee getEmpById2(int id) {
		RowMapper<Employee> mapper = new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNo) throws SQLException {
				int id = rs.getInt("ID");
				String myname = rs.getString("NAME");
				long sal = rs.getLong("SALARYINFO");
				Employee e = new Employee(id, myname, sal);
				return e;
			}
		};
		List<Employee> query = jdbcTemplate.query("select * from employeeinfo where id =?", new Object[] { id },
				mapper);
		return query.isEmpty() ? null : query.get(0);
	}

	// query method returns list for RowMapper
	// query method can return any Obj for ResultSetExtractor

	public List<Employee> getAllEmployees1() {
		ResultSetExtractor<List<Employee>> extractOBJ = new ResultSetExtractor<List<Employee>>() {
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> emps = new ArrayList<Employee>();
				while (rs.next()) {
					int id = rs.getInt("ID");
					String myname = rs.getString("NAME");
					long sal = rs.getLong("SALARYINFO");
					Employee e = new Employee(id, myname, sal);
					emps.add(e);
				}
				return emps;
			}
		};
		return jdbcTemplate.query("select * from employeeinfo", extractOBJ);
	}

	// for ResultSetExtractor dev has to create the list , dev has to keep the
	// object inside the list by looping the ResultSet

	public List<Employee> getAllEmployees2() {
		RowMapper<Employee> empRM = new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				int id = rs.getInt("ID");
				String myname = rs.getString("NAME");
				long sal = rs.getLong("SALARYINFO");
				Employee e = new Employee(id, myname, sal);
				return e;
			}
		};
		return jdbcTemplate.query("select * from employeeinfo", empRM);
	}

	// for Rowmapper no need to 1.create the list + no need to keep the object
	// inside the list + no need for looping the ResultSet

}
