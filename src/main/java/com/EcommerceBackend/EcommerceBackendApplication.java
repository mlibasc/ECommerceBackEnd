package com.EcommerceBackend;

import com.EcommerceBackend.GiftCards.GiftCard;
import com.EcommerceBackend.store.Store;
import com.EcommerceBackend.store.StoreBuilder;
import com.EcommerceBackend.store.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
		StoreService storeService;

		GiftCard card1 = new GiftCard("giftCardName", "AppleRepublic", 1000);
		GiftCard card2 = new GiftCard("Gift Card Name", "Space", 500);
		List<GiftCard> list = new ArrayList<GiftCard>();
		list.add(card1);
		list.add(card2);


		Store store = new StoreBuilder().withGiftCard(list)
				.withName("Banana")
				.build();
		logger.info("This is the store: " + store);

		List<GiftCard> storeGiftCards = store.getGiftCards();

		for(int i = 0; i < storeGiftCards.size(); i++){
			logger.info("gift card name: " +
					storeGiftCards.get(i).getGiftCardName() +
					" store name: " +
					storeGiftCards.get(i).getStoreName() +
					" amount: " +
					storeGiftCards.get(i).getAmount());
		}

	}
}
