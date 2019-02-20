package ingsw.pdd.Builder.dto;

public class Phone {
	private String phoneNumber;
	private String ext;
	private String phoneType;
	
	public Phone() {
	}
	
	public Phone(String phoneNumber, String ext, String phoneType) {
		this.phoneNumber = phoneNumber;
		this.ext = ext;
		this.phoneType = phoneType;
	}
	/** Getters, setters */
	@Override
	public String toString() {
		return "Phone{" + "phoneNumber=" + phoneNumber + ", ext=" + ext + ", phoneType=" + phoneType + '}';
	}
}