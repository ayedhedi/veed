import lombok.*;

@Getter
@Setter
@Builder
public class Bean {

    private String dealerCode;
    private String dealerName;
    private String dealerCountry;
    private String shareholderCountryCode;
    private String shareholderCountryLabel;
    private String shareholderAccount;
    private String accountManagementName1;
    private String accountManagementName2;
    private String adress1;
    private String adress2;
    private String blockedOperations;
    private String reasonForBlocking;
    private String dividendPolicy;
    private String legalFundCode;
    private String legalFundName;
    private String subfundCode;
    private String subfundName;
    private String userCurrency;
    private String shareClassCode;
    private String shareClassName;
    private String isin;
    private Double nav;
    private String shareClassCurrency;
    private Double amountInSharClassCurrency;
    private String amountInUserCurrency;
    private Double quantity;
    private Long numberOfAccounts;
}