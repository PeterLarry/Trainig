package it.cg.main.beans.calc;

import java.util.Map;

import org.springframework.integration.annotation.Gateway;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.w3schools.xml.CelsiusToFahrenheitResponse;

@Component
public class CalcAdapterReplyBean
{

	@Gateway
	public void getReply(Message<?> input, @Headers Map<String, Object> headerMap)
	{
	
		CelsiusToFahrenheitResponse getWeat = new CelsiusToFahrenheitResponse();
		Message<CelsiusToFahrenheitResponse> message = MessageBuilder.withPayload(getWeat).build();
	}

}
