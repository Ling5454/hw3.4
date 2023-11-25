package country;

public class CountryModel {
    private String countryImg;
    private String countryName;

    public CountryModel(String countryImg, String countryName) {
        this.countryImg = countryImg;
        this.countryName = countryName;
    }

    public String getCountryImg() {
        return countryImg;
    }

    public String getCountryName() {
        return countryName;
    }
}

