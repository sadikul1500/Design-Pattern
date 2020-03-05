/*if (customer == null) {
  plan = BillingPlan.basic();
}
else {
  plan = customer.getPlan();
}*/

BillingPlan plan = customer.getPlan();

public BillingPlan getPlan()
{
	return BillingPlan.getPlan();
}