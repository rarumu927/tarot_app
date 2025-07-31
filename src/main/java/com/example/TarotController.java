package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class TarotController {

//     private final TarotService tarotService;

//     public TarotController(TarotService tarotService) {
//         this.tarotService = tarotService;
//     }

//     @GetMapping("/tarot")
//     public TarotResultDto getTarotReading() {
//         return tarotService.drawCard();
//     }
// }
@RestController
public class TarotController {
    @GetMapping("/")
    public String home() {
        return "Hello from Tarot app!";
    }
}
