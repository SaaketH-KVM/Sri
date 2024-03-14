package com.example.demo.Config;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.jassignment.soap.entity.EmployeeRequest;
import com.jassignment.soap.entity.EmployeeResponse;

@Service
public class Client extends WebServiceGatewaySupport {

    // Method to create an employee
    public String createEmployee(String employeeData) {
        EmployeeRequest request = new EmployeeRequest();
        request.setEmployeeId(employeeData);
        EmployeeResponse response = (EmployeeResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        return response.getEmployeeEmail();
    }

    // Method to get employee details by ID
    public EmployeeResponse getEmployeeDetails(String employeeId) {
        EmployeeRequest request = new EmployeeRequest();
        request.setEmployeeId(employeeId);
        return (EmployeeResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}

