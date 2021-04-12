package com.EcommerceBackend.store;

import com.EcommerceBackend.BonusCard.BonusCard;
import com.EcommerceBackend.EcommerceBackendApplication;
import com.EcommerceBackend.GiftCard.GiftCard;
import com.EcommerceBackend.VoucherCard.EVoucher;

import java.util.List;

public class StoreBuilder {
    private List<GiftCard> giftCards;
    private List<BonusCard> bonusCards;
    private List<EVoucher> eVoucherCards;
    private String name = "No Name";

    public Store build(){
        return new Store(giftCards, bonusCards, eVoucherCards, name);
    }
    public StoreBuilder withGiftCard(List<GiftCard> giftCards){
        this.giftCards = giftCards;
        return this;
    }

    public StoreBuilder withBonusCard(List<BonusCard> bonusCards){
        this.bonusCards = bonusCards;
        return this;
    }

    public StoreBuilder withEVoucherCards(List<EVoucher> eVoucherCards){
        this.eVoucherCards = eVoucherCards;
        return this;
    }

    public StoreBuilder withName(String name){
        this.name = name;
        return this;
    }
}
