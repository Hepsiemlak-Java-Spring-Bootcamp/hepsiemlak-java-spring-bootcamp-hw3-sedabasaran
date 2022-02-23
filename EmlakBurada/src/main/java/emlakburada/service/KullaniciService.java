package emlakburada.service;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import emlakburada.client.BannerClient;
import emlakburada.dto.AdvertRequest;
import emlakburada.dto.UserRequest;
import emlakburada.dto.response.AdvertResponse;
import emlakburada.dto.response.KullaniciResponse;
import emlakburada.model.Advert;
import emlakburada.model.RealEstate;
import emlakburada.model.User;
import emlakburada.queue.QueueService;
import emlakburada.repository.DbConnectionRepository;
import emlakburada.repository.IlanRepository;
import emlakburada.repository.KullaniciRepository;

@Service
public class KullaniciService {

	@Autowired
	@Qualifier(value = "mongoConnectionRepository")
	private DbConnectionRepository dbConn;
	
	
	@Autowired KullaniciRepository kullaniciRepository;
	
	public List<KullaniciResponse> getAllUsers() {
		
		List<KullaniciResponse> kullaniciList = new ArrayList<>();

		for (User user : kullaniciRepository.fetchAllUsers()) {
			kullaniciList.add(convertToKullaniciResponse(user));
		}
		return kullaniciList;

}
	
	public KullaniciResponse convertToKullaniciResponse(User savedUser) {
		KullaniciResponse response = new KullaniciResponse();
		response.setIsim(savedUser.getIsim());
		response.setEmail(savedUser.getEmail());
		response.setKullaniciTipi(savedUser.getKullaniciTipi());		
		// response.setFavoriIlanlar(savedUser.getFavoriIlanlar());
		response.setKullaniciTipi(savedUser.getKullaniciTipi());
		return response;
	}
	

	public KullaniciResponse saveUser(UserRequest request) {
		User savedUser = kullaniciRepository.saveUser(convertToUser(request));
		//EmailMessage emailMessage = new EmailMessage("cemdrman@gmail.com");
		//queueService.sendMessage(emailMessage);
		return convertToKullaniciResponse(savedUser);
	}
	

	public User convertToUser(UserRequest userRequest) {

		User user = new User();
		user.setIsim(userRequest.getIsim());
		user.setEmail(userRequest.getEmail());
		user.setKullaniciTipi(userRequest.getKullaniciTipi());
		user.setUserId(0);
		return user;
	}


	public KullaniciResponse getUserByUserId(int userId) {
		User user = kullaniciRepository.findUserByUserId(userId);
		return convertToKullaniciResponse(user);
	}

	
}