package ingsw.pdd.Builder.dto;

public class Contact {
private String name;
private Phone phone;
private Address address;

	public Contact() {
	}

	public Contact(String name, Phone phone,Address address) {
		this.name = name;
		this.phone = phone;
		this.address= address;
	}
	
	public Contact(String name, Phone phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}