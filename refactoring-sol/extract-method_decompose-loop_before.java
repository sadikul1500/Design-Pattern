void getResult(int i, List users)
{
	String result = "";
    result += users.get(i).getName();
    result += " ";
    result += users.get(i).getAge();
    System.out.println(result);
}

void printProperties(List users) {
  for (int i = 0; i < users.size(); i++) {
    getResult(i, users );

    // ...
  }
}