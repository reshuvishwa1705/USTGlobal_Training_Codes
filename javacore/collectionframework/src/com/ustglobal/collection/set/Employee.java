package com.ustglobal.collection.set;

public class Employee implements Comparable<Employee>{
int id;
String name;
int sal;
public Employee(int id, String name, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + sal;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (sal != other.sal)
		return false;
	return true;
}
@Override
public int compareTo(Employee o) {
	Integer i = this.id;
	Integer j = o.id;
	return i.compareTo(j);
}

}