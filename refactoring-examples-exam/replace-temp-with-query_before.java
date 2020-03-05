double getBasePrice()
{
	double basePrice = quantity * itemPrice;
}

double calculateTotal() {
  
  if (getBasePrice() > 1000) {
    return getBasePrice() * 0.95;
  }
  else {
    return getBasePrice() * 0.98;
  }
}