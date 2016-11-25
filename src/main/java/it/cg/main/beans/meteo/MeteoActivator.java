package it.cg.main.beans.meteo;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.Gateway;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import it.cg.main.dto.RoutingDTO;
import net.webservicex.GetWeather;

@Component
public class MeteoActivator
{
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@Gateway(requestChannel="meteoChannel")
	public Message<GetWeather> gotoMeteo(RoutingDTO routingDTO, @Headers Map<String, Object> headerMap)
	{
		logger.info("Into "+getClass()+"method gotoMeteo , input="+routingDTO);
		
		GetWeather requestMeteo = new GetWeather();
		requestMeteo.setCityName("Rome");
		requestMeteo.setCountryName("Italy");
		Message<GetWeather> message = MessageBuilder.withPayload(requestMeteo).build();

		logger.info("Into "+getClass()+"method gotoMeteo , output="+message);
		return message;
		
	}
	
}
