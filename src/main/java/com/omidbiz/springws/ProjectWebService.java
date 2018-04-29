package com.omidbiz.springws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProjectWebService
{

    
    @WebMethod
    public String create() 
    {
        return "created";
    }
    
}
