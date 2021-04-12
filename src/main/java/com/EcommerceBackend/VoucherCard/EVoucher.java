package com.EcommerceBackend.VoucherCard;

public class EVoucher {
    private String eVoucherName = "No Name";
    private String storeName = "No Store Name";
    private long amount = 0;

    public EVoucher(String eVoucherName, String storeName, long amount) {
        this.eVoucherName = eVoucherName;
        this.storeName = storeName;
        this.amount = amount;
    }

    public String geteVoucherName() {
        return eVoucherName;
    }

    public String getStoreName() {
        return storeName;
    }

    public long getAmount() {
        return amount;
    }
}
