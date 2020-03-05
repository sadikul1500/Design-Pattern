/*double getExpenseLimit() {
  // should have either expense limit or a primary project
  return (expenseLimit != NULL_EXPENSE) ?
    expenseLimit:
    primaryProject.getMemberExpenseLimit();
}*/

double getExpenseLimit() {
  // should have either expense limit or a primary project
	assert(expenseLimit != NULL_EXPENSE || primaryProject != null,"Both of them must not be null");

  	return (expenseLimit != NULL_EXPENSE) ?
    expenseLimit:
    primaryProject.getMemberExpenseLimit();
}