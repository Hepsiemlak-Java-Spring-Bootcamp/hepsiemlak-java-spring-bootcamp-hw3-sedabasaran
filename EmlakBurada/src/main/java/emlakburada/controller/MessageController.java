package emlakburada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import emlakburada.dto.UserRequest;
import emlakburada.dto.response.KullaniciResponse;
import emlakburada.dto.response.MessageRequest;
import emlakburada.dto.response.MessageResponse;
import emlakburada.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping(value = "/messages")
	public ResponseEntity<List<MessageResponse>> getAllMessages() {
		return new ResponseEntity<>(messageService.getAllMessages(),HttpStatus.OK);
	}
	

	@PostMapping(value = "/messages")
	public ResponseEntity<MessageResponse> saveMessage(@RequestBody MessageRequest request) {
		return new ResponseEntity<>(messageService.saveMessage(request), HttpStatus.CREATED);
	}
	
	
	
}
