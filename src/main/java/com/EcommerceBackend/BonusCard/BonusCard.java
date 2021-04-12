package com.EcommerceBackend.BonusCard;

public class BonusCard {
    private String cardName = "No Name";
    private String storeName = "storeNameHere";
    private long amount = 0;

    public BonusCard(String cardName, String storeName, long amount) {
        this.cardName = cardName;
        this.storeName = storeName;
        this.amount = amount;
    }

    public String getCardName() {
        return cardName;
    }

    public String getStoreName() {
        return storeName;
    }

    public long getAmount() {
        return amount;
    }
}
