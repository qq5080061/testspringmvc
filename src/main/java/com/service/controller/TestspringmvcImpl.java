package com.service.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-23T14:41:39.808Z")

@RestSchema(schemaId = "testspringmvc")
@RequestMapping(path = "/testspringmvc", produces = MediaType.APPLICATION_JSON)
public class TestspringmvcImpl {

    @Autowired
    private TestspringmvcDelegate userTestspringmvcDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestspringmvcDelegate.helloworld(name);
    }

}
