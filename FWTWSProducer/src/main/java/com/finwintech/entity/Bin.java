package com.finwintech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bin_table")
public class Bin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bin_id")
    private int binId;

    @Column(name = "bin_number")
    private String binNumber;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "card_level")
    private String cardLevel;

    @Column(name = "card_brand")
    private String cardBrand;

    @Column(name = "bank_issuing")
    private String bankIssuing;

    @Column(name = "bank_country_name")
    private String bankCountryName;

    @Column(name = "bank_country_two_alfa_code")
    private String bankCountryTwoAlfaCode;

    @Column(name = "bank_country_three_alfa_code")
    private String bankCountryThreeAlfaCode;

    @Column(name = "bank_country_three_numeric_code")
    private String bankCountryThreeNumericCode;

    @Column(name = "bin_groups")
    private String binGroups;

    @Column(name = "blocked")
    private int blocked;

    @Column(name = "error")
    private int error;

    @Column(name = "message")
    private String message;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getBinId() {
        return binId;
    }

    public void setBinId(int binId) {
        this.binId = binId;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(String cardLevel) {
        this.cardLevel = cardLevel;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getBankIssuing() {
        return bankIssuing;
    }

    public void setBankIssuing(String bankIssuing) {
        this.bankIssuing = bankIssuing;
    }

    public String getBankCountryName() {
        return bankCountryName;
    }

    public void setBankCountryName(String bankCountryName) {
        this.bankCountryName = bankCountryName;
    }

    public String getBankCountryTwoAlfaCode() {
        return bankCountryTwoAlfaCode;
    }

    public void setBankCountryTwoAlfaCode(String bankCountryTwoAlfaCode) {
        this.bankCountryTwoAlfaCode = bankCountryTwoAlfaCode;
    }

    public String getBankCountryThreeAlfaCode() {
        return bankCountryThreeAlfaCode;
    }

    public void setBankCountryThreeAlfaCode(String bankCountryThreeAlfaCode) {
        this.bankCountryThreeAlfaCode = bankCountryThreeAlfaCode;
    }

    public String getBankCountryThreeNumericCode() {
        return bankCountryThreeNumericCode;
    }

    public void setBankCountryThreeNumericCode(String bankCountryThreeNumericCode) {
        this.bankCountryThreeNumericCode = bankCountryThreeNumericCode;
    }

    public String getBinGroups() {
        return binGroups;
    }

    public void setBinGroups(String binGroups) {
        this.binGroups = binGroups;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Bin{" +
                "binId=" + binId +
                ", binNumber='" + binNumber + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardLevel='" + cardLevel + '\'' +
                ", cardBrand='" + cardBrand + '\'' +
                ", bankIssuing='" + bankIssuing + '\'' +
                ", bankCountryName='" + bankCountryName + '\'' +
                ", bankCountryTwoAlfaCode='" + bankCountryTwoAlfaCode + '\'' +
                ", bankCountryThreeAlfaCode='" + bankCountryThreeAlfaCode + '\'' +
                ", bankCountryThreeNumericCode='" + bankCountryThreeNumericCode + '\'' +
                ", binGroups='" + binGroups + '\'' +
                ", blocked=" + blocked +
                ", error=" + error +
                ", message='" + message + '\'' +
                '}';
    }
}