package org.ldxx.bean;

import java.util.List;

public class Supplier {
    private String spId;

    private String spName;

    private String spType;

    private String creditCode;

    private String bankName;

    private String bankNo;

    private String enterpriseQualification;

    private String businessLicense;

    private String businessLicenseTime;

    private String credit;

    private String legalPersonMan;

    private String enterpriseType;

    private String enterpriseAddr;

    private String enterpriseSax;

    private String enterpriseEmail;

    private List<Eva> enterpriseEva;

    private String businessScope;
    
    private String enterpriseDesc;
    
    private String importantEvent;
    
    private List<Enterprise> enterprise;
    
    
    
    public List<Enterprise> getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(List<Enterprise> enterprise) {
		this.enterprise = enterprise;
	}

	public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getEnterpriseDesc() {
		return enterpriseDesc;
	}

	public void setEnterpriseDesc(String enterpriseDesc) {
		this.enterpriseDesc = enterpriseDesc;
	}

	public String getImportantEvent() {
		return importantEvent;
	}

	public void setImportantEvent(String importantEvent) {
		this.importantEvent = importantEvent;
	}

	public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName == null ? null : spName.trim();
    }

    public String getSpType() {
        return spType;
    }

    public void setSpType(String spType) {
        this.spType = spType == null ? null : spType.trim();
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    public String getEnterpriseQualification() {
        return enterpriseQualification;
    }

    public void setEnterpriseQualification(String enterpriseQualification) {
        this.enterpriseQualification = enterpriseQualification == null ? null : enterpriseQualification.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getBusinessLicenseTime() {
        return businessLicenseTime;
    }

    public void setBusinessLicenseTime(String businessLicenseTime) {
        this.businessLicenseTime = businessLicenseTime == null ? null : businessLicenseTime.trim();
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit == null ? null : credit.trim();
    }

    public String getLegalPersonMan() {
        return legalPersonMan;
    }

    public void setLegalPersonMan(String legalPersonMan) {
        this.legalPersonMan = legalPersonMan == null ? null : legalPersonMan.trim();
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType == null ? null : enterpriseType.trim();
    }

    public String getEnterpriseAddr() {
        return enterpriseAddr;
    }

    public void setEnterpriseAddr(String enterpriseAddr) {
        this.enterpriseAddr = enterpriseAddr == null ? null : enterpriseAddr.trim();
    }

    public String getEnterpriseSax() {
        return enterpriseSax;
    }

    public void setEnterpriseSax(String enterpriseSax) {
        this.enterpriseSax = enterpriseSax == null ? null : enterpriseSax.trim();
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail == null ? null : enterpriseEmail.trim();
    }

	public List<Eva> getEnterpriseEva() {
		return enterpriseEva;
	}

	public void setEnterpriseEva(List<Eva> enterpriseEva) {
		this.enterpriseEva = enterpriseEva;
	}
    
    

}