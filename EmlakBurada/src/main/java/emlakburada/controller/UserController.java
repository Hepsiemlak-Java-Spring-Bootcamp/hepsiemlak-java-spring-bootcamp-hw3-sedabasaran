package emlakburada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
=======
>>>>>>> eb08587e28ef0358fe7e516187441f704548560d
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import emlakburada.dto.AdvertRequest;
import emlakburada.dto.UserRequest;
import emlakburada.dto.response.AdvertResponse;
import emlakburada.dto.response.KullaniciResponse;
import emlakburada.model.User;
import emlakburada.service.KullaniciService;
=======
import emlakburada.dto.UserRequest;
import emlakburada.dto.response.UserResponse;
import emlakburada.service.UserService;
>>>>>>> eb08587e28ef0358fe7e516187441f704548560d

@RestController
public class UserController {

<<<<<<< HEAD
	
	@Autowired
	private KullaniciService kullaniciService;
	

	@GetMapping(value = "/users")
	public ResponseEntity<List<KullaniciResponse>> getAllUsers() {
		return new ResponseEntity<>(kullaniciService.getAllUsers(), HttpStatus.OK);
	}
	

	@PostMapping(value = "/users")
	public ResponseEntity<KullaniciResponse> saveUser(@RequestBody UserRequest request) {
		return new ResponseEntity<>(kullaniciService.saveUser(request), HttpStatus.CREATED);
	}

	@GetMapping(value = "/users/{userId}")
	public ResponseEntity<KullaniciResponse> findUserByUserId(@PathVariable(required = false) int userId) {
		return new ResponseEntity<>(kullaniciService.getUserByUserId(userId), HttpStatus.OK);
	}
		
	
	
=======
	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public ResponseEntity<?> saveUser(@RequestBody UserRequest request) {
		userService.saveUser(request);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/users")
	public ResponseEntity<List<UserResponse>> getAllUser() {
		return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
	}

>>>>>>> eb08587e28ef0358fe7e516187441f704548560d
}
