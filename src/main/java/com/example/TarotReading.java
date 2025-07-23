package com.example;
import java.util.Random;


/**
 * 占いの実行と表示を担当するクラス
 */
public class TarotReading {
    /**
     * デッキ
     */
    private final TarotDeck deck;

    /**
     * ランダムな塊
     */
    private final Random random;


    //コンストラクタ
    public TarotReading(TarotDeck deck) {
        this.deck = deck;
        this.random = new Random();
    }

    /**
     * 正位置の時と逆位置の時の意味を表示する
     */
    public String descriptionCard() {
        TarotCard card = deck.getCard();
        return card.getName() + card.getNumber() + "【正位置】" + card.getMeaningUpright() + "【逆位置】" + card.getMeaningReversed();
    }

    /**
     * 逆位置か正位置で説明を出すメソッド
     */
    public String readCard() {
        TarotCard card = deck.getCard();  // 一枚引く
        boolean isReversed = random.nextBoolean();  // trueなら逆位置、falseなら正位置

        StringBuilder result = new StringBuilder();

        //trueの時逆位置、falseの時正位置
        if(isReversed) {
            result.append("【逆位置】")
            .append(card.getMeaningReversed())
            .append("\n")
            .append(card.getReDescription());
        } else {
            result.append("【正位置】")
            .append(card.getMeaningUpright())
            .append("\n")
            .append(card.getUpDescription());
        }
        
        return result.toString();

    }

}