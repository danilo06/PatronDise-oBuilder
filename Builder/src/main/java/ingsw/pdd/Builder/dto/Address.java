package ingsw.pdd.Builder.dto;

	public class Address {
		private String address;
		private String city;
		private String country;
		private String cp;
		
		public Address() {	
		}
		
		public Address(String address, String city, String country, String cp) {
			this.address = address;
			this.city = city;
			this.country = country;
			this.cp = cp;
			}

		@Override
		public String toString() {
			return "Address [address=" + address + ", city=" + city + ", country=" + country + ", cp=" + cp + "]";
		}
		
}
