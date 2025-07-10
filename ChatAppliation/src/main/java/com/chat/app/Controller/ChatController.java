package com.chat.app.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chat.app.Model.ChatMessage;

@Controller
public class ChatController {
	
	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public ChatMessage sendMessage(ChatMessage Message)
	{
		return Message;
	} 
	
	@GetMapping("chat")
	public String chat()
	{
		return "chat";
	}

}
