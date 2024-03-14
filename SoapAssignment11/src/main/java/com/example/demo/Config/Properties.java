//package com.example.demo.Config;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//@Component
//@ConfigurationProperties(prefix = "employee-service")
//public class Properties {
//    private String endpointUrl;
//    public String getEndpointUrl() {
//        return endpointUrl;
//    }
//
//    public void setEndpointUrl(String endpointUrl) {
//        this.endpointUrl = endpointUrl;
//    
//}
//}
package com.example.demo.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "employee-service")
public class Properties {
    private String endpointUrl;

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }
}
