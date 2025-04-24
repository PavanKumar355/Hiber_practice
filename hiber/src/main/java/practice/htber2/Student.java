package practice.htber2;

import jakarta.persistence.*;

@Entity
public class Student {
@Id
int kodId;
String name;
int yop;
String address;

public Student()
{
super();
}
public Student(int kodId, String name, int yop, String address) {
	
	this.kodId = kodId;
	this.name = name;
	this.yop = yop;
	this.address = address;
}

public int getKodId() {
	return kodId;
	
}

public String getName() {
	return name;
}

public int getYop() {
	return yop;
}

public String getAddress() {
	return address;
}
public String toString() {
	return "Student [kodId-"+kodId+", name - "+name+", yop - "+yop+", address- "+address;
	
}

public void setYop(int yop) {
	// TODO Auto-generated method stub
	
	this.yop= yop;
}
}
