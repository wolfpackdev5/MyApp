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
}
