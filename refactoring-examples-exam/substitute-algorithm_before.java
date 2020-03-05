String foundPerson(String[] people){
  List candidates = Arrays.asList(new String[] {"Don", "John", "Kent"});

  for (String person: People)
  {
    if(candidates.contains(person))
      return person;
    return "";
  }
  /*
  for (int i = 0; i < people.length; i++) {
    if (people[i].equals("Don")){
      return "Don";
    }
    if (people[i].equals("John")){
      return "John";
    }
    if (people[i].equals("Kent")){
      return "Kent";
    }
  }
  return "";*/
}