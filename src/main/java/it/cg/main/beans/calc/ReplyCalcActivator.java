package it.cg.main.beans.calc;

import java.util.Map;

import org.springframework.integration.annotation.Gateway;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.support.MessageBuilder;

import com.blog.samples.webservices.DetailService;
import com.blog.samples.webservices.servicedetail.ServiceCallResponse;
import com.w3schools.xml.CelsiusToFahrenheitResponse;

import net.webservicex.GetWeatherResponse;

public class ReplyCalcActivator
{
	
	@Gateway(requestChannel="calcOutChannel")
	public Message<ServiceCallResponse> gotoCalc(CelsiusToFahrenheitResponse routingDTO, @Headers Map<String, Object> headerMap)
	{
		ServiceCallResponse callResp = new ServiceCallResponse();
		DetailService detailServ = new DetailService();
		detailServ.setServiceType(routingDTO.getCelsiusToFahrenheitResult());
		callResp.setDetailService(detailServ );
		Message<ServiceCallResponse> message = MessageBuilder.withPayload(callResp).build();
		return message;
	}

}
