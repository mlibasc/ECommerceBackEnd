package com.EcommerceBackend.store;

import com.EcommerceBackend.GiftCards.GiftCard;

import java.util.List;

public class StoreBuilder {
    private List<GiftCard> giftCards;
    private String name = "No Name";

    public Store build(){
        return new Store(giftCards, name);
    }
    public StoreBuilder withGiftCard(List<GiftCard> giftCards){
        this.giftCards = giftCards;
        return this;
    }
    public StoreBuilder withName(String name){
        this.name = name;
        return this;
    }
}
