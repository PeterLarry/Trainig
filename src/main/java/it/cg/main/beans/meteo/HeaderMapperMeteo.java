package it.cg.main.beans.meteo;

import org.springframework.integration.ws.DefaultSoapHeaderMapper;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.ws.soap.SoapMessage;

public class HeaderMapperMeteo extends DefaultSoapHeaderMapper
{
	
	@Override
	public void setRequestHeaderNames(String... requestHeaderNames) {
		// TODO Auto-generated method stub
		super.setRequestHeaderNames(requestHeaderNames);
	}
	
	@Override
	public void fromHeadersToRequest(MessageHeaders headers, SoapMessage target)
	{
		target.setSoapAction("http://www.webserviceX.NET/GetWeather");
	}

	
	
}
