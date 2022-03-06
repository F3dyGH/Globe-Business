package tn.pidev.spring.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.pidev.spring.entities.Chat;
import tn.pidev.spring.repositories.ChatRepository;
import tn.pidev.spring.repositories.EmployeeRepository;
import tn.pidev.spring.repositories.TravelRepository;

@Service
public class ChatService implements IChatService {
	@Autowired
	EmployeeRepository er;
	@Autowired
	ChatRepository cr;
	@Autowired
	TravelRepository tr;
	@Override
	public Chat addChat(Long idEmployee, Long idTravel, Chat chat) {
		chat.setDateChat(new Date());
		chat.setEmlpoyee(er.findById(idEmployee).get());
		chat.setTravel(tr.findById(idTravel).get());
		return cr.save(chat);
	}

	@Override
	public List<String> getDiscussion(Long idTravel) {
		return cr.getDiscussion(tr.findById(idTravel).get());
	}

}
