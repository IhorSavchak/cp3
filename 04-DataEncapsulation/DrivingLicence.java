public class DrivingLicence {
    private String name;
    private String surname;
    private String adress;
    private String postalCode;
    private String city;
    private int issuedYear;
    private String licenseCategory;

    public DrivingLicence(String name, String surname, String adress, String postalCode, String city, int licenceNum, int issuedYear, String licenseCategory) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.postalCode = postalCode;
        this.city = city;
        this.issuedYear = issuedYear;
        this.licenseCategory = licenseCategory;

        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getIssuedYear() {
        return issuedYear;
    }

    public void setIssuedYear(int issuedYear) {
        this.issuedYear = issuedYear;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }
    public void display() {
        System.out.println("The name: "+ getName() + " Surname: " + getSurname() + " Adress: " + getAdress() + " Postal Codee: " + getPostalCode() + " City: " + getCity() + " License Issued on: " + getIssuedYear() + " Licence category: " + getLicenseCategory());
    }

    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence("Toto", "Coutunio", "Krakow Street 2", "44-444", "Krakow", 111111, 2024, "B");
        dl.name = "Jamal";
        dl.display();
    }
}


