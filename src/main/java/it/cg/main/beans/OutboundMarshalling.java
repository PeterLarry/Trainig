package it.cg.main.beans;

import java.io.IOException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Component;

@Component
public class OutboundMarshalling implements Marshaller, Unmarshaller, InitializingBean 
{

	@Override
	public void afterPropertiesSet() throws Exception
	{
	}

	@Override
	public Object unmarshal(Source source) throws IOException, XmlMappingException
	{
		return null;
	}

	@Override
	public boolean supports(Class<?> clazz)
	{
		return false;
	}

	@Override
	public void marshal(Object graph, Result result) throws IOException, XmlMappingException
	{
	}

}
