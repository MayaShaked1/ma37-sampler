package workspace.netanya.sampler.dataType;

public class MadaReports {
    private String mdaCode;
    private String idNum;
    private String idType;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String buildingNumber;
    private String barcode;
    private String getDate;
    private String takeDate;
    private String resultDate;

    public MadaReports (String mdaCode,String idNum,String idType,String firstName,String lastName, String city,String street, String buildingNumber,
                        String barcode,String getDate,String takeDate,String resultDate)
    {
        this.mdaCode=mdaCode;
        this.idNum=idNum;
        this.idType=idType;
        this.firstName=firstName;
        this.lastName=lastName;
        this.city=city;
        this.street=street;
        this.buildingNumber=buildingNumber;
        this.barcode=barcode;
        this.getDate=getDate;
        this.takeDate=takeDate;
        this.resultDate=resultDate;
    }

    public String getMdaCode() {
        return mdaCode;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getIdType() {
        return idType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getGetDate() {
        return getDate;
    }

    public String getTakeDate() {
        return takeDate;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setMdaCode(String mdaCode) {
        this.mdaCode = mdaCode;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public void setTakeDate(String takeDate) {
        this.takeDate = takeDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }

    @Override
    public String toString() {
        return "MadaReports: " +
                "mdaCode= " + mdaCode +
                ", idNum= " + idNum +
                ", idType= " + idType +
                ", firstName= " + firstName +
                ", lastName='" + lastName +
                ", city= " + city +
                ", street= " + street +
                ", buildingNumber= " + buildingNumber +
                ", barcode= " + barcode +
                ", getDate= " + getDate +
                ", takeDate= " + takeDate +
                ", resultDate= " + resultDate ;
    }
}
