package JoinTable;


	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Inheritance;
	import javax.persistence.InheritanceType;
	import javax.persistence.Table;

	@Entity
	@Table(name = "Person3")
	@Inheritance(strategy = InheritanceType.JOINED)
	public class Person2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	private int Id;

	@Column(name = "name", nullable = false, length = 30, unique = true)
	private String userName;

	@Column(name = "age")
	private int age;

	public int getId() {
	return Id;
	}

	public void setId(int id) {
	Id = id;
	}

	public String getUserName() {
	return userName;
	}

	public void setUserName(String userName) {
	this.userName = userName;
	}

	public int getAge() {
	return age;
	}

	public void setAge(int age) {
	this.age = age;
	}

	}
	


