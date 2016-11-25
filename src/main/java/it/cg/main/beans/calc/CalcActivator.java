package it.cg.main.beans.calc;

import java.util.Map;

import org.springframework.integration.annotation.Gateway;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.w3schools.xml.CelsiusToFahrenheit;

import it.cg.main.dto.RoutingDTO;
import net.webservicex.GetWeather;

@Component
public class CalcActivator
{
	
	@Gateway(requestChannel="calcChannel")
	public Message<CelsiusToFahrenheit> gotoMeteo(RoutingDTO routingDTO, @Headers Map<String, Object> headerMap)
	{
		CelsiusToFahrenheit requestMeteo = new CelsiusToFahrenheit();
		requestMeteo.setCelsius("100");
		
		Message<CelsiusToFahrenheit> message = MessageBuilder.withPayload(requestMeteo).build();
		
		return message;
	}

	
	
}
