boolean hasDiscount(Order order) {
  //double basePrice = order.basePrice();
  return order.basePrice() > 1000;
}