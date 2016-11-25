package it.cg.main.beans.meteo;

import java.util.Map;

import org.springframework.integration.annotation.Gateway;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.support.MessageBuilder;

import com.blog.samples.webservices.DetailService;
import com.blog.samples.webservices.servicedetail.ServiceCallResponse;

import net.webservicex.GetWeatherResponse;

public class ReplyMeteoAcrivator
{
	
	@Gateway(requestChannel="meteoOutChannel")
	public Message<ServiceCallResponse> gotoMeteo(GetWeatherResponse routingDTO, @Headers Map<String, Object> headerMap)
	{
		GetWeatherResponse responseMeteo = new GetWeatherResponse();
		responseMeteo.setGetWeatherResult("bah");
		
		ServiceCallResponse callResp = new ServiceCallResponse();
		DetailService detailServ = new DetailService();
		detailServ.setServiceType("Return Meteo");
		callResp.setDetailService(detailServ );
		Message<ServiceCallResponse> message = MessageBuilder.withPayload(callResp).build();
		return message;
	}

}
