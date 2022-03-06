package tn.pidev.spring.services;

import java.util.List;

import tn.pidev.spring.entities.Chat;

public interface IChatService {
	Chat addChat(Long idEmployee, Long idTravel, Chat chat);
	List<String> getDiscussion(Long idTravel);
}
