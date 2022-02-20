package emlakburada.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import emlakburada.dto.response.KullaniciResponse;
import emlakburada.model.Advert;
import emlakburada.model.User;
import emlakburada.service.KullaniciService;

@Repository
public class KullaniciRepository {
	
	private String url = "localhost";
	private String pass = "şifre";
	
	private static List<User> usersLists = new ArrayList<>();
	
	static {
		User user1 = new User();
		user1.setKullaniciTipi("Bireysel");
		user1.setIsim("Seda");
		user1.setEmail("dasensab@gmail.com");
		user1.setUserId(0);	
		
		Advert ilan = new Advert();
		ilan.setBaslik("selam");
		user1.getFavoriIlanlar().add(ilan);
		
		usersLists.add(user1);

	}	

		
	public List<User> fetchAllUsers(){
		return usersLists;
		
	}

	public User saveUser(User user) {
		usersLists.add(user);
		return user;
	}
	

	public User findUserByUserId(int userId) {
		return usersLists.stream().filter(user -> user.getUserId() == userId).findAny().orElse(new User());
	}

	

}
