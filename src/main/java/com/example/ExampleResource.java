package com.example;

import io.quarkus.scheduler.Scheduled;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class ExampleResource {

    @Scheduled(cron = "0 0 9 ? * WED")
    public void foo(){
       
   }
}