package emlakburada.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import emlakburada.model.Advert;
import emlakburada.model.Message;

@Service
public class MessageRepository {
	
	static List<Message> messageLists = new ArrayList<>();
	
	static {
		Message message1 = new Message();
		message1.setBaslik("deneme");
		message1.setIcerigi("merhaba");
		message1.setGorulduMu(true);
		
		messageLists.add(message1);
		
		Message message2 = new Message();
		message2.setBaslik("deneme2");
		message2.setIcerigi("selam");
		message2.setGorulduMu(true);
		
		messageLists.add(message2);
		
	}
	
	public List<Message> fetchAllMessages(){
		return messageLists;
	}
	

	public Message saveMessage(Message message) {
		messageLists.add(message);
		//System.out.println(message.toString());
		return message;
	}

//	public Message findMessageByMessageId(int messageNo) {
//		return messageLists.stream().filter(message -> message.get() == messageNo).findAny().orElse(new Message());
//	}

}
