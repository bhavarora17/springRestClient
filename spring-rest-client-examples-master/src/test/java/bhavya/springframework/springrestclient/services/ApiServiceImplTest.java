package bhavya.springframework.springrestclient.services;

import bhavya.springframework.api.domain.User;
import bhavya.springframework.springrestclient.services.ApiService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by barora on 1/10/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {
	
	@Autowired
	ApiService apiService;
	
	@Before
	public void setUp() throws Exception{
	
	}
	
	@Test
	public void testGetUser(){
		List<User> users = apiService.getUsers(3);
		assertEquals(4, users.size());
	}

}
