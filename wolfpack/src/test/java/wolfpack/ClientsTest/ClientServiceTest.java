package wolfpack.ClientsTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import wolfpack.Clients.Client;
import wolfpack.Clients.ClientRepo;

@SpringBootTest
public class ClientServiceTest {
	@Autowired
	ClientRepo cRepo;
	@Test
	public void repoSavesObjectWithEmail() {
		Client client = new Client("devinlewis");
		cRepo.save(client);
		Optional<Client> repoClient = cRepo.findById(1);
		System.out.println(repoClient.get().getEmail());
	}
	@Test
	public void testMethodFindByEmail() {
		Client client = cRepo.findByEmail("devin.lewis24@gmail.com");
		assertNotNull(client);
	}
}
