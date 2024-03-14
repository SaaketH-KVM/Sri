//package com.example.demo.Config;
//import java.util.Properties;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.oxm.jaxb.Jaxb2Marshaller;
//import com.jassignment.soap.entity.EmployeeRequest;
//
//public class Config {
//
//    @Bean
//    public Jaxb2Marshaller marshaller() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setContextPath("com.jassignment.soap.entity");
//        return marshaller;
//    }
//
//    @Bean
//    public Client employeeServiceClient(Jaxb2Marshaller marshaller, Properties properties) {
//        Client client = new Client();
//        client.setDefaultUri(properties.getEndpointUrl());
//        client.setMarshaller(marshaller);
//        return client;
//    }
//}
package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Config {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.jassignment.soap.entity");
        return marshaller;
    }

    @Bean
    public Client employeeServiceClient(Jaxb2Marshaller marshaller, Properties properties) {
        Client client = new Client();
        client.setDefaultUri(properties.getEndpointUrl());
        client.setMarshaller(marshaller);
        return client;
    }
}
