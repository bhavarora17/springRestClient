package bhavya.springframework.springrestclient.services;

import bhavya.springframework.api.domain.User;
import bhavya.springframework.api.domain.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by barora on 1/10/2018.
 */
/*@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;
	
	@Autowired
	public ApiServiceImpl(RestTemplate restTemplate){
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<User> getUsers(Integer limit) {
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
			return userData.getData();
	}
}*/
@Service
public class ApiServiceImpl implements  ApiService {
	
	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<User> getUsers(Integer limit) {
		
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
		return userData.getData();
	}
}