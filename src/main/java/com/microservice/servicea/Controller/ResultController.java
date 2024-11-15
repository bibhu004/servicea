package com.microservice.servicea.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.servicea.Service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService resultService;
    

    @GetMapping("/{roll}")
    public ResponseEntity<?> getMethodName(@PathVariable Long roll) {
        try{
            return ResponseEntity.ok(resultService.getResult(roll));
        }  catch(IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
         catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occured");
        }
    }
    
}
