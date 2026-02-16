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



    // exampple of inheritance 
// class BaseEntity {
//     LocalDateTime createdAt;
//     LocalDateTime updatedAt;
// }


// class Student extends BaseEntity { }
// class Course extends BaseEntity { }

// also used for custom exception
// class UserNotFoundException extends RuntimeException {
// }


// runtime polymorphism 
// class Animal {
//     void sound() {
//         System.out.println("Animal sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Bark");
//     }
// }
// Animal animal = new Dog();
// animal.sound();

// Output:-Bark