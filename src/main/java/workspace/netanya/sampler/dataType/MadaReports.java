package workspace.netanya.sampler.dataType;

public class MadaReports <T>{
    private T mdaCode;
    private T idNum;
    private T idType;
    private T firstName;
    private T lastName;
    private T city;
    private T street;
    private T buildingNumber;
    private T barcode;
    private T getDate;
    private T takeDate;
    private T resultDate;

    public MadaReports (T mdaCode,T idNum,T idType,T firstName,T lastName, T city,T street, T buildingNumber,
                        T barcode,T getDate,T takeDate,T resultDate)
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

    public T getMdaCode() {
        return mdaCode;
    }

    public T getIdNum() {
        return idNum;
    }

    public T getIdType() {
        return idType;
    }

    public T getFirstName() {
        return firstName;
    }

    public T getLastName() {
        return lastName;
    }

    public T getCity() {
        return city;
    }

    public T getStreet() {
        return street;
    }

    public T getBuildingNumber() {
        return buildingNumber;
    }

    public T getBarcode() {
        return barcode;
    }

    public T getGetDate() {
        return getDate;
    }

    public T getTakeDate() {
        return takeDate;
    }

    public T getResultDate() {
        return resultDate;
    }

    public void setMdaCode(T mdaCode) {
        this.mdaCode = mdaCode;
    }

    public void setIdNum(T idNum) {
        this.idNum = idNum;
    }

    public void setIdType(T idType) {
        this.idType = idType;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public void setLastName(T lastName) {
        this.lastName = lastName;
    }

    public void setCity(T city) {
        this.city = city;
    }

    public void setStreet(T street) {
        this.street = street;
    }

    public void setBuildingNumber(T buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setBarcode(T barcode) {
        this.barcode = barcode;
    }

    public void setGetDate(T getDate) {
        this.getDate = getDate;
    }

    public void setTakeDate(T takeDate) {
        this.takeDate = takeDate;
    }

    public void setResultDate(T resultDate) {
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
