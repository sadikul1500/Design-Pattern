class Employee{
	public Employee(String name, String id, int grade) {
    this.name = name;
    this.id = id;
    this.grade = grade;
  }
}
class Manager extends Employee {
  public Manager(String name, String id, int grade) {
    super(name, id, grade);
  }
  //...
}