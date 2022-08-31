package challenges;

import java.time.LocalDateTime;



public class productOrderDto {

    private User user;
    private  ProductItem productItem;
    private double productPrice;
    private LocalDateTime productOrderTime;
    boolean soldSuccess;
    public productOrderDto(final User user,final ProductItem productItem,final  double productPrice, final  LocalDateTime productOrderTime, final boolean soldSuccess) {
        this.user = user;
        this.productItem = productItem;
        this.productPrice = productPrice;
        this.productOrderTime = productOrderTime;
        this.soldSuccess = soldSuccess;
    }



}
