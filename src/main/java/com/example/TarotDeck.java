package com.example;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
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
    private final Random rand = new Random();

    
    //コンストラクタ
    public TarotDeck() {
        this.cards = loadCardsFromJson();
    }


    //gsonの読み込み
    private List<TarotCard> loadCardsFromJson() {
    // jsonFilePathは無視して、クラスパスから読み込む場合の例
    try (InputStream is = getClass().getResourceAsStream("/major_arcana.json")) {
        if (is == null) {
            System.err.println("major_arcana.json not found in classpath");
            return new ArrayList<>();
        }
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
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
        if (cards == null || cards.isEmpty()) {
        throw new IllegalStateException("カードデッキが空です。JSONファイルの読み込みに失敗している可能性があります。");
        }

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

