package com.microservice.servicea.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservice.servicea.DTO.ResultDTO;
import com.microservice.servicea.DTO.StudentDTO;
// import com.microservice.servicea.FeignClient.GreetingClient;
import com.microservice.servicea.FeignClient.StudentServiceClient;

@Service
public class ResultService {

    @Autowired
    private StudentServiceClient studentServiceClient; 


    public ResultDTO getResult(Long roll){
        StudentDTO studentDTO;
        ResponseEntity<StudentDTO> responseEntity  = studentServiceClient.getStudentDetail(roll);
        // if (responseEntity.getStatusCode().is2xxSuccessful()) {
        //     studentDTO = responseEntity.getBody();
        // } else {
        //     // Handle the error case here
        //     return null;
        // }
        studentDTO = responseEntity.getBody();

        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setName(studentDTO.getName());
        resultDTO.setMark(studentDTO.getMark());
        resultDTO.setResult(studentDTO.getMark()<40?"fail":"pass");
        return resultDTO;
    }
}
