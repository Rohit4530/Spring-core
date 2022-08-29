package com.spring.core.SpringCore.AutoWiring.Annotation;

public class Address {
   private String street;
   private String city;
public Address() {
	super();
}
public Address(String street, String city) {
	super();
	this.street = street;
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + "]";
}
}
