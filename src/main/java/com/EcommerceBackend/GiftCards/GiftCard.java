package com.EcommerceBackend.GiftCards;

public class GiftCard {
    private String giftCardName = "cardNameHere";
    private String storeName = "storeNameHere";
    private long amount = 1000;

    public GiftCard(String giftCardName, String storeName, long amount) {
        this.giftCardName = giftCardName;
        this.storeName = storeName;
        this.amount = amount;
    }

    public String getGiftCardName() {
        return giftCardName;
    }

    public void setGiftCardName(String giftCardName) {
        this.giftCardName = giftCardName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
