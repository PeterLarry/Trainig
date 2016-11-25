package it.cg.main.ws;

import org.springframework.messaging.Message;
import org.springframework.integration.annotation.Gateway;
import org.springframework.stereotype.Service;

import com.blog.samples.webservices.servicedetail.ServiceCallRequest;
import com.blog.samples.webservices.servicedetail.ServiceCallResponse;

import it.cg.main.dto.RoutingDTO;



@Service
public class EndpointGateway {

	@Gateway(replyChannel="output")
	public ServiceCallResponse registerIssue(RoutingDTO request)
	{
		return new ServiceCallResponse();
	}
	
	@Gateway(requestChannel="input")
	public RoutingDTO gotToRouting(ServiceCallRequest request)
	{
		RoutingDTO routingDto = new RoutingDTO();
		
		routingDto.setTypeOf(request.getServiceType());
		
		return routingDto;
	}
	
	@Gateway
	public Message<?> getReplyMetod(ServiceCallResponse response)
	{
		return null;
	}
	
	

}
