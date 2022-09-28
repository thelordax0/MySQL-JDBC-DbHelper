package dbhelper;

public class Country {
	private String countryId;
	private String country;
	
	
	public Country(String countryId,String country) {
		this.country=country;
		this.countryId=countryId;
	}


	public String getCountryId() {
		return countryId;
	}


	public String getCountry() {
		return country;
	}
	
	
	
	
	
}
