package com.microservice.servicea.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.servicea.DTO.StudentDTO;

@FeignClient(name = "student-service", url = "http://localhost:8081/student")
public interface StudentServiceClient {

    @GetMapping("/{roll}")
    ResponseEntity<StudentDTO> getStudentDetail(@PathVariable Long roll);
    
}
