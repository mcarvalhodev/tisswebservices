package com.ans.tisswebservices.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("br.gov.ans.padroes.tiss.schemas");
		return marshaller;
	}

	@Bean
	public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
		SoapConnector client = new SoapConnector();
		client.setDefaultUri("http://localhost:8080/ws");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
			ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*");
	}

	@Bean
	public SimpleWsdl11Definition tissVerificaElegibilidadeV3_04_00() {
		return new SimpleWsdl11Definition(new ClassPathResource("tissVerificaElegibilidadeV3_04_00.wsdl"));
	}

	@Bean
	public SimpleWsdl11Definition tissSolicitacaoDemonstrativoRetornoV3_04_00() {
		return new SimpleWsdl11Definition(new ClassPathResource("tissSolicitacaoDemonstrativoRetornoV3_04_00.wsdl"));
	}

	@Bean
	public SimpleWsdl11Definition tissSolicitacaoStatusRecursoGlosaV3_04_00() {
		return new SimpleWsdl11Definition(new ClassPathResource("tissSolicitacaoStatusRecursoGlosaV3_04_00.wsdl"));
	}

	@Bean
	public SimpleWsdl11Definition tissSolicitacaoStatusProtocoloV3_04_00() {
		return new SimpleWsdl11Definition(new ClassPathResource("tissSolicitacaoStatusProtocoloV3_04_00.wsdl"));
	}

	@Bean
	public SimpleWsdl11Definition tissSolicitacaoStatusAutorizacaoV3_04_00() {
		return new SimpleWsdl11Definition(new ClassPathResource("tissSolicitacaoStatusAutorizacaoV3_04_00.wsdl"));
	}

	@Bean
	public SimpleWsdl11Definition tissSolicitacaoProcedimentoV3_04_00() {
		return new SimpleWsdl11Definition(new ClassPathResource("tissSolicitacaoProcedimentoV3_04_00.wsdl"));
	}

	@Bean
	public SimpleWsdl11Definition tissRecursoGlosaV3_04_00() {
		return new SimpleWsdl11Definition(new ClassPathResource("tissRecursoGlosaV3_04_00.wsdl"));
	}

	@Bean
	public SimpleWsdl11Definition tissLoteGuiasV3_04_00() {
		return new SimpleWsdl11Definition(new ClassPathResource("tissLoteGuiasV3_04_00.wsdl"));
	}
	
	@Bean
	public SimpleWsdl11Definition tissLoteAnexoV3_04_00() {
		return new SimpleWsdl11Definition(new ClassPathResource("tissLoteAnexoV3_04_00.wsdl"));
	}	

	@Bean
	public XsdSchema tissWebServicesV3_04_00() {
		return new SimpleXsdSchema(new ClassPathResource("tissWebServicesV3_04_00.xsd"));
	}

	@Bean
	public XsdSchema tissComplexTypesV3_04_00() {
		return new SimpleXsdSchema(new ClassPathResource("tissComplexTypesV3_04_00.xsd"));
	}

	@Bean
	public XsdSchema tissGuiasV3_04_00() {
		return new SimpleXsdSchema(new ClassPathResource("tissGuiasV3_04_00.xsd"));
	}

	@Bean
	public XsdSchema tissSimpleTypesV3_04_00() {
		return new SimpleXsdSchema(new ClassPathResource("tissSimpleTypesV3_04_00.xsd"));
	}

	@Bean
	public XsdSchema tissV3_04_00() {
		return new SimpleXsdSchema(new ClassPathResource("tissV3_04_00.xsd"));
	}

	@Bean(name = "tissAssinaturaDigital_v1.01")
	public XsdSchema tissAssinaturaDigital_v1_01() {
		return new SimpleXsdSchema(new ClassPathResource("tissAssinaturaDigital_v1.01.xsd"));
	}

	@Bean(name = "xmldsig-core-schema")
	public XsdSchema xmldsig_core_schema() {
		SimpleXsdSchema simpleXsdSchema = new SimpleXsdSchema(new ClassPathResource("xmldsig-core-schema.xsd"));
		return simpleXsdSchema;
	}
}
