package wolfpack.Clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClientService {
	private final ClientRepo cRepo;
	@Autowired
	public ClientService(ClientRepo cRepo) {
		this.cRepo = cRepo;
	}
	//when a client signs up for the email subscription
	public String addNewClient(String email) {
		Client check = cRepo.findByEmail(email);
		if(check == null) {
			Client client = new Client(email);
			cRepo.save(client);
			return "Thank you for subscribing";
		} else {
			return "This email already exists in the system";
		}
	}
	//client signs up for an account - Create Account page in the front end 
	public String createClientAccount(String email, String password, String first, String last, String bio, int age, int weight) {
		Client check = cRepo.findByEmail(email);
		if(check == null) {
			Client client = new Client(email, password, first, last, bio, age, weight);
			cRepo.save(client);
			return "Account created!";
		} else {
			return "email already exists in the database";
		}
	}
	//client creates an account that already has an exisiting email in the database 
	//User Account Details page where they can update their personal details
	//edge case - some of the values are blank and it gets updated in the database as null values 
	//make a separate update method for each value 
	public void updateAccountInfo(String email, String password, String first, String last, String bio, int age, int weight) {
		Client check = cRepo.findByEmail(email);
		check.setPassword(password);
		check.setFirstName(first);
		check.setLastName(last);
		check.setBio(bio);
		check.setAge(age);
		check.setWeight(weight);
		cRepo.save(check);
	}
	
}
