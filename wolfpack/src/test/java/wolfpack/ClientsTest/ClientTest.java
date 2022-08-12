package wolfpack.ClientsTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import wolfpack.Clients.Client;

@SpringBootTest
public class ClientTest {
	@Test
	public void emailGetsAssignedToClient() {
		Client client = new Client("devinlewis");
		assertNotNull(client.getEmail());
	}

}
