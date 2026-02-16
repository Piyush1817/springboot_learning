package com.piyush.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_world {
    private String name;
    @GetMapping("/name")
    public String getName() {
        return name ;
    }
}


//  PaymentService.java
// package com.piyush.springdemo;

// public interface PaymentService {
//     void pay(double amount);
// }




// UpiPayment.java
// package com.piyush.springdemo;
// public class UpiPayment implements PaymentService {
//     @Override
//     public void pay(double amount) {
//         System.out.println("Paying " + amount + " using UPI");
//     }
// }


// Main.java
// package com.piyush.springdemo;

// public class Main {

//     public static void main(String[] args) {

//         PaymentService paymentService = new UpiPayment();
//         paymentService.pay(500);

//     }
// }