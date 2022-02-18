package shop;

public interface ISell {

    default double calculateMarkUp() {
        return this.getPricing().getSellingPrice() - this.getPricing().getBuyingPrice();
    }

    Cost getPricing();

}
