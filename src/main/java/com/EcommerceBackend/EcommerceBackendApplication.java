package com.EcommerceBackend;

import com.EcommerceBackend.BonusCard.BonusCard;
import com.EcommerceBackend.GiftCard.GiftCard;
import com.EcommerceBackend.VoucherCard.EVoucher;
import com.EcommerceBackend.store.Store;
import com.EcommerceBackend.store.StoreBuilder;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
public class EcommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
		Logger logger = LoggerFactory.getLogger(EcommerceBackendApplication.class);

		GiftCard card1 = new GiftCard("giftCardName", "AppleRepublic", 1000);
		GiftCard card2 = new GiftCard("Gift Card Name", "Space", 500);
		List<GiftCard> list = new ArrayList<GiftCard>();
		list.add(card1);
		list.add(card2);
		BonusCard bonusCard1 = new BonusCard("bonusCard1", "AppleRepublic", 1000);
		BonusCard bonusCard2 = new BonusCard("bonusCard2", "KiwiRepublic", 500);
		List<BonusCard> list2 = new ArrayList<BonusCard>();
		list2.add(bonusCard1);
		list2.add(bonusCard2);
		EVoucher voucher1 = new EVoucher("eVoucher1", "AppleRepublic", 1000);
		EVoucher voucher2 = new EVoucher("eVoucher2", "KiwiRepublic", 500);
		List<EVoucher> list3 = new ArrayList<EVoucher>();
		list3.add(voucher1);
		list3.add(voucher2);


		Store store = new StoreBuilder().withGiftCard(list)
				.withBonusCard(list2)
				.withEVoucherCards(list3)
				.withName("Banana")
				.build();
		logger.info("This is the store: " + store);

		List<GiftCard> storeGiftCards = store.getGiftCards();
		List<BonusCard> storeBonusCards = store.getBonusCards();
		List<EVoucher> storeEVoucherCards = store.geteVoucherCards();

		for(int i = 0; i < storeGiftCards.size(); i++){
			logger.info("gift card name: " +
					storeGiftCards.get(i).getGiftCardName() +
					" store name: " +
					storeGiftCards.get(i).getStoreName() +
					" amount: " +
					storeGiftCards.get(i).getAmount());
		}
		for(int i = 0; i < storeBonusCards.size(); i++){
			logger.info("gift card name: " +
					storeBonusCards.get(i).getCardName() +
					" store name: " +
					storeBonusCards.get(i).getStoreName() +
					" amount: " +
					storeBonusCards.get(i).getAmount());
		}
		for(int i = 0; i < storeEVoucherCards.size(); i++){
			logger.info("gift card name: " +
					storeEVoucherCards.get(i).geteVoucherName() +
					" store name: " +
					storeEVoucherCards.get(i).getStoreName() +
					" amount: " +
					storeEVoucherCards.get(i).getAmount());
		}


	}
}
