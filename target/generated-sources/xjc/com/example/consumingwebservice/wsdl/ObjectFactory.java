//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.06.29 às 01:12:46 AM BRT 
//


package com.example.consumingwebservice.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.consumingwebservice.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.consumingwebservice.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertCustomerRequest }
     * 
     */
    public InsertCustomerRequest createInsertCustomerRequest() {
        return new InsertCustomerRequest();
    }

    /**
     * Create an instance of {@link CustomerDetail }
     * 
     */
    public CustomerDetail createCustomerDetail() {
        return new CustomerDetail();
    }

    /**
     * Create an instance of {@link InsertCustomerResponse }
     * 
     */
    public InsertCustomerResponse createInsertCustomerResponse() {
        return new InsertCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerDetailRequest }
     * 
     */
    public GetCustomerDetailRequest createGetCustomerDetailRequest() {
        return new GetCustomerDetailRequest();
    }

    /**
     * Create an instance of {@link GetCustomerDetailResponse }
     * 
     */
    public GetCustomerDetailResponse createGetCustomerDetailResponse() {
        return new GetCustomerDetailResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomerDetailRequest }
     * 
     */
    public GetAllCustomerDetailRequest createGetAllCustomerDetailRequest() {
        return new GetAllCustomerDetailRequest();
    }

    /**
     * Create an instance of {@link GetAllCustomerDetailResponse }
     * 
     */
    public GetAllCustomerDetailResponse createGetAllCustomerDetailResponse() {
        return new GetAllCustomerDetailResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerRequest }
     * 
     */
    public DeleteCustomerRequest createDeleteCustomerRequest() {
        return new DeleteCustomerRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest }
     * 
     */
    public UpdateCustomerRequest createUpdateCustomerRequest() {
        return new UpdateCustomerRequest();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

}
