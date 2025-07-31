package com.example;

//タロット占いの結果をJSONで返す用のクラス
public class TarotResultDto {
    private String name;
    private String meaningUpright;
    private String meaningReversed;
    private String position; // "upright" または "reversed"
    private String imageUrl; // フロントで画像表示用
    private String description;  // 一言アドバイス

    public TarotResultDto(String name, String upright, String reversed, String position, String imageUrl, String description) {
        this.name = name;
        this.meaningUpright = upright;
        this.meaningReversed = reversed;
        this.position = position;
        this.imageUrl = imageUrl;
        this.description = description;
    }

     // 必要な getter（Springが自動でJSON化するため）
    public String getName() { return name; }
    public String getMeaningUpright() { return meaningUpright; }
    public String getMeaningReversed() { return meaningReversed; }
    public String getPosition() { return position; }
    public String getImageUrl() { return imageUrl; }
    public String getDescription() { return description; }

   
}