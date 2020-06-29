
package com.example.consumingwebservice;

import com.example.consumingwebservice.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class CustomerClient extends WebServiceGatewaySupport {

    // metodo getById lado cliente
    public GetCustomerDetailResponse getCustomerById(int customerId) {
        GetCustomerDetailRequest request = new GetCustomerDetailRequest();
        request.setId(customerId);

        GetCustomerDetailResponse response = (GetCustomerDetailResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/customers", request,
                        new SoapActionCallback(
                                ""));
        return response;
    }

    // metodo getAllCustomer lado cliente
    public GetAllCustomerDetailResponse getAllCustomer() {
        GetAllCustomerDetailRequest request = new GetAllCustomerDetailRequest();
        GetAllCustomerDetailResponse response = (GetAllCustomerDetailResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/customers", request, new SoapActionCallback(""));
        return response;
    }

    // metodo para inserir customer lado cliente
    public InsertCustomerResponse insertCustomer(CustomerDetail customerDetail) {
        InsertCustomerRequest request = new InsertCustomerRequest();
        request.setCustomerDetail(customerDetail);
        InsertCustomerResponse response = (InsertCustomerResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/customers", request,
                        new SoapActionCallback(""));
        return response;
    }
    // metodo excluir customer lado cliente
    public DeleteCustomerResponse deleteCustomer(int id) {
        DeleteCustomerRequest request = new DeleteCustomerRequest();
        request.setId(id);
        DeleteCustomerResponse response = (DeleteCustomerResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/customers", request,
                        new SoapActionCallback(""));
        return response;
    }

    // metodo atualizar lado cliente
    public UpdateCustomerResponse updateCustomer(CustomerDetail customerDetail) {
        UpdateCustomerRequest request = new UpdateCustomerRequest();
        request.setCustomerDetail(customerDetail);
        UpdateCustomerResponse response = (UpdateCustomerResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/customers",request,
                        new SoapActionCallback(""));
        return response;
    }

}
