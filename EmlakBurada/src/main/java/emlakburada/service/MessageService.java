package emlakburada.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import emlakburada.dto.AdvertRequest;
import emlakburada.dto.UserRequest;
import emlakburada.dto.response.AdvertResponse;
import emlakburada.dto.response.KullaniciResponse;
import emlakburada.dto.response.MessageRequest;
import emlakburada.dto.response.MessageResponse;
import emlakburada.model.Advert;
import emlakburada.model.Message;
import emlakburada.model.User;
import emlakburada.repository.DbConnectionRepository;
import emlakburada.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	@Qualifier(value = "mongoConnectionRepository")
	private DbConnectionRepository dbConn;
	
	@Autowired MessageRepository messageRepository;
	
	public List<MessageResponse> getAllMessages(){
		
		List<MessageResponse> messageLists = new ArrayList<>();
		for (Message message : messageRepository.fetchAllMessages()) {
			messageLists.add(convertToMessageResponse(message));
	}
		return messageLists;
}

	private MessageResponse convertToMessageResponse(Message savedMessage) {
		MessageResponse response = new MessageResponse();
		response.setAlici(savedMessage.getAlici());
		response.setBaslik(savedMessage.getBaslik());
		response.setGonderici(savedMessage.getGonderici());
		response.setIcerigi(savedMessage.getIcerigi());
		return response;
	}
	

	public MessageResponse saveMessage(MessageRequest request) {
		Message savedMessage = messageRepository.saveMessage(convertToMessage(request));
		return convertToMessageResponse(savedMessage);
	}
	
	public Message convertToMessage(MessageRequest messageRequest) {
		Message message = new Message();
		message.setAlici(messageRequest.getAlici());
		message.setBaslik(messageRequest.getBaslik());
		message.setGonderici(messageRequest.getGonderici());
		message.setIcerigi(messageRequest.getIcerigi());
		return message;
	}
	
	
}
