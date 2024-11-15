// package com.microservice.servicea.Controller;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.microservice.servicea.FeignClient.GreetingClient;
// import org.springframework.web.bind.annotation.RequestParam;


// @RestController
// @RequestMapping("/call-service-b")
// public class ServiceAController {

//     private final GreetingClient greetingClient;

//     public ServiceAController(GreetingClient greetingClient) {
//         this.greetingClient = greetingClient;
//     }

//     @GetMapping("/greet")
//     public String callServiceB() {
//         System.out.println("\n\n\nits here\n\n");
//         return greetingClient.greet();
//     }


//     @GetMapping("/try")
//     public String getMethodName() {
//         return "Its working";
//     }
    
// }



