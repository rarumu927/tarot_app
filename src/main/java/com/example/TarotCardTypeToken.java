package com.example;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;

public class TarotCardTypeToken {
    public static final Type TAROT_CARD_LIST_TYPE = new TypeToken<List<TarotCard>>() {}.getType();
}

