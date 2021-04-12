package com.EcommerceBackend.store;

import com.EcommerceBackend.BonusCard.BonusCard;
import com.EcommerceBackend.GiftCard.GiftCard;
import com.EcommerceBackend.VoucherCard.EVoucher;

import java.util.List;

public class Store {
    private List<GiftCard> giftCards;
    private List<BonusCard> bonusCards;
    private List<EVoucher> eVoucherCards;
    private String name;

    protected Store(List<GiftCard> giftCards, List<BonusCard> bonusCards, List<EVoucher> eVoucherCards, String name) {
        this.giftCards = giftCards;
        this.bonusCards = bonusCards;
        this.eVoucherCards = eVoucherCards;
        this.name = name;
    }

    public List<GiftCard> getGiftCards() {
        return giftCards;
    }

    public List<BonusCard> getBonusCards() {
        return bonusCards;
    }

    public List<EVoucher> geteVoucherCards() {
        return eVoucherCards;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Store{" +
                "giftCards=" + giftCards +
                ", bonusCards=" + bonusCards +
                ", eVoucherCards=" + eVoucherCards +
                ", name='" + name + '\'' +
                '}';
    }
}
