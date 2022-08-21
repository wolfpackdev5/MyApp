package wolfpack.Clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin
public class ClientController {
	ClientService cService;
	@Autowired
	public ClientController(ClientService cService) {
		this.cService = cService;
	}
	@PostMapping("register")
	public String createNewClient(@RequestBody String email) {
		String response = cService.addNewClient(email);
		return response;
	}
	@PostMapping("createAccount")
	public String newAccount(@RequestBody String email, @RequestBody String password, @RequestBody String first, @RequestBody String last, @RequestBody String bio,
			@RequestBody int age, @RequestBody int weight) {
		String response = cService.createClientAccount(email, password, first, last, bio, age, weight);
		return response;
	}
}
