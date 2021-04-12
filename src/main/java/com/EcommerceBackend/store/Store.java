package com.EcommerceBackend.store;

import com.EcommerceBackend.GiftCards.GiftCard;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Slf4j
public class Store {
    private List<GiftCard> giftCards;
    private String name;

    protected Store(List<GiftCard> giftCards, String name) {
        this.giftCards = giftCards;
        this.name = name;
    }

    public List<GiftCard> getGiftCards() {
        return giftCards;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Store{" +
                "giftCards=" + giftCards +
                ", name='" + name + '\'' +
                '}';
    }
}
