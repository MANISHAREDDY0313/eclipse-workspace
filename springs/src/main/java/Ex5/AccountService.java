package Ex5;

public class AccountService {

	private String dbName;

	public AccountService(String dbName) {
		this.dbName = dbName;
	}

	public void save() {
		System.out.println("inside save method");
		System.out.println("account- save:::" + dbName);
	}

}

/**
 * AccountService is a bean class. AccountService has dbName as dependency.
 * spring has to create the object for AccountService and set the data for
 * dbName. since we are using constructor injection we need to write the
 * constructor in AccountService and write bean tag for AccountService
 */