double disabilityAmount() {
  if (seniority < 2 || monthsDisabled > 12 || isPartTime) {
    return 0;
  }
  /*
  if (monthsDisabled > 12) {
    return 0;
  }
  if (isPartTime) {
    return 0;
  }
  // compute the disability amount
  //...
  */
}