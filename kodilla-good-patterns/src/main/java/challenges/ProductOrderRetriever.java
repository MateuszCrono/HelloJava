package challenges;


import java.time.LocalDateTime;

public class ProductOrderRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("Macho-man74","Johny", "Wayne");

        ProductItem productItem = new ProductItem ("Last of Us", "Playstation 5 Block Buster", "Video game");

        double productPrice = 149.99;

        LocalDateTime productOrderTime = LocalDateTime.of(2022, 8, 10 , 12, 9);

        System.out.println("User" + user.getUserName() + " on Date : " + productOrderTime +  " Ordered : " + productItem.getProductName() + " for : " + productPrice);

        return new ProductOrderRequest (user, productItem, productPrice, productOrderTime );
    }
}