package com.example.dogdemo;
/**
 * 
 * @author s546908-Dwithi Reddy Pathi Reddy
 *
 */
import org.springframework.stereotype.Component;

@Component
public class Trainer {
private int id;
private String name;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Trainer [id=" + id + ", name=" + name + "]";
}

}
