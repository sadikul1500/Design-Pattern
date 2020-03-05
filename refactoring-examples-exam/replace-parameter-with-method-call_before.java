int basePrice = quantity * itemPrice;
//double seasonDiscount = this.getSeasonalDiscount();
//double fees = this.getFees();
double finalPrice = discountedPrice(basePrice, this.getSeasonalDiscount(), this.getFees());