package com.example;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class TarotService {

    private final TarotDeck deck;
    private final TarotReading reading;
    private final Random random;

    public TarotService() {
        this.deck = new TarotDeck("C:\\Users\\rarum\\Desktop\\programing\\Java\\tarot\\resources\\major_arcana.json");
        this.reading = new TarotReading(deck);
        this.random = new Random();
    }

    public TarotResultDto drawCard() {
         //カードを引く
        deck.drawCard();

        //カードを所持
        TarotCard card = deck.getCard();

        //
        boolean isReversed = random.nextBoolean();
        String position = "";

        if(isReversed) {
            position = "reversed";
        } else {
            position = "upright";
        }

        //
        String imageUrl = "/image/" + card.getNumber() + "-" + card.getNameEnglish() + ".jpg";

        //
        String description = "";

        if(isReversed) {
            description = card.getReDescription();
        } else {
            description = card.getUpDescription();
        }

        return new TarotResultDto(
            card.getName(),
            card.getMeaningUpright(),
            card.getMeaningReversed(),
            position,
            imageUrl,
            description
        );   
    }

}