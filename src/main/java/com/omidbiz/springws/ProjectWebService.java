package com.omidbiz.springws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

@WebService
@Component
public class ProjectWebService
{

    
    @WebMethod
    public String create() 
    {
        return "created";
    }
    
}
