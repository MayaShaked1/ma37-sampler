package workspace.netanya.sampler.dataType;

public class LabTests {
    private String idNum;
    private String idType;
    private String firstName;
    private String lastName;
    private String resultDate;
    private String birthDate;
    private String labCode;
    private String stickerNumber;
    private String resultTestCorona;
    private String variant;
    private String testType;
    private String joinDate;
    private String healthCareId;
    private String healthCareName;

    public LabTests (String idNum,String idType,String firstName,String lastName,String resultDate,String birthDate,String labCode,
                     String stickerNumber,String resultTestCorona,String variant,String testType,String joinDate,String healthCareId,String healthCareName)
    {
        this.idNum=idNum;
        this.idType=idType;
        this.firstName=firstName;
        this.lastName=lastName;
        this.resultDate=resultDate;
        this.birthDate=birthDate;
        this.labCode=labCode;
        this.stickerNumber=stickerNumber;
        this.resultTestCorona=resultTestCorona;
        this.variant=variant;
        this.testType=testType;
        this.joinDate=joinDate;
        this.healthCareId=healthCareId;
        this.healthCareName=healthCareName;
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

    public String getResultDate() {
        return resultDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getLabCode() {
        return labCode;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public String getResultTestCorona() {
        return resultTestCorona;
    }

    public String getVariant() {
        return variant;
    }

    public String getTestType() {
        return testType;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getHealthCareId() {
        return healthCareId;
    }

    public String getHealthCareName() {
        return healthCareName;
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

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public void setStickerNumber(String stickerNumber) {
        this.stickerNumber = stickerNumber;
    }

    public void setResultTestCorona(String resultTestCorona) {
        this.resultTestCorona = resultTestCorona;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setHealthCareId(String healthCareId) {
        this.healthCareId = healthCareId;
    }

    public void setHealthCareName(String healthCareName) {
        this.healthCareName = healthCareName;
    }
}
