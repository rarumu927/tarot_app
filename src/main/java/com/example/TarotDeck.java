package com.example;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;


/**
 * カードの束、デッキ全体を扱うクラス
 */
public class TarotDeck {
    private final List<TarotCard> cards;
    private TarotCard onlyCard;

    
    //コンストラクタ
    public TarotDeck(String jsonFilePath) {
        this.cards = loadCardsFromJson(jsonFilePath);
    }

    //gsonの読み込み
    private List<TarotCard> loadCardsFromJson(String jsonFilePath) {
        try (Reader reader = new FileReader(jsonFilePath)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, TarotCardTypeToken.TAROT_CARD_LIST_TYPE);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    /**
     * ランダムに一枚引く
     * @return onlyCard
     */
    public TarotCard drawCard() {
        Random rand = new Random();
        onlyCard = cards.get(rand.nextInt(cards.size()));
        return onlyCard;
    }

    /**
     * ランダムに引いたカードを所持
     * @return onlyCard
     */
    public TarotCard getCard() {
        return onlyCard;
    }
}

