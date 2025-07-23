package com.example;
/**
 * カード一枚ごとの情報を持つクラス
 */
public class TarotCard {
    /**
     * カードの名前
     */
    private String name;

    /*
     * カードの名前(英語)
     */
    private String nameEnglish;

    /**
     * カードの番号
     */
    private int number;

    // /**
    //  * カードのマーク
    //  */
    // private String suit;

    /**
     * 正位置
     */
    private String meaningUpright;

    /**
     * 逆位置
     */
    private String meaningReversed;

    /**
     * 逆位置のカードの説明
     */
    private String reDescription;

    /**
     * 正位置のカードの説明
     */
    private String upDescription;

    //コンストラクタ
    /**
     * デフォルトコンストラクタ
     */
    public TarotCard() {}

    /**
     * コンストラクタ
     * @param name
     * @param number
     * @param meaningUpright
     * @param meaningReversed
     */
    TarotCard(String name,int number,String meaningUpright,String meaningReversed) {
        this.name = name;
        this.number = number;
        this.meaningUpright = meaningUpright;
        this.meaningReversed = meaningReversed;
    }
    
    
    //getter
    public String getName() {
        return this.name;
    }

    public String getNameEnglish() {
        return this.nameEnglish;
    }

    public int getNumber() {
        return  this.number;
    }

    public String getMeaningUpright() {
        return this.meaningUpright;
    }

    public String getMeaningReversed() {
        return this.meaningReversed;
    }

    public String getReDescription() {
        return this.reDescription;
    }

    public String getUpDescription() {
        return this.upDescription;
    }

}