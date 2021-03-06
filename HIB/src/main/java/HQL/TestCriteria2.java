package HQL;


	
	import java.util.List;

	import org.hibernate.Criteria;
	import org.hibernate.Session;
	import Basics.Employee;
	import Basics.HibernateUtil;

	 
	public class TestCriteria2 {

			public static void main(String[] args) {
				  //get session obj
						Session  s = HibernateUtil.getSessionFactory().openSession();
				    
				    //get criteria obj
				    Criteria c1 = s.createCriteria(Employee.class);
						
					
				    c1.setFirstResult(5); // from which row number , skip 10 rows
				    c1.setMaxResults(20);// how many rows
				    
				  //call list method
				  	List<Employee> list = c1.list();
				  	System.out.println(list.size());
					  for(Employee e: list){
							System.out.println(e);
						}
				    
				    //close session
					s.close();	

				}
		}





	

		
