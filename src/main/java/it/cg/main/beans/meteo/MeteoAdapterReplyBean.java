package it.cg.main.beans.meteo;

import java.util.Map;

import org.springframework.integration.annotation.Gateway;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import net.webservicex.GetWeatherResponse;

@Component
public class MeteoAdapterReplyBean
{

//	non si raggiunge
	@Gateway
	public void getReply(Message<?> input, @Headers Map<String, Object> headerMap)
	{
	
		GetWeatherResponse getWeat = new GetWeatherResponse();
		Message<GetWeatherResponse> message = MessageBuilder.withPayload(getWeat).build();
		
	}

}
