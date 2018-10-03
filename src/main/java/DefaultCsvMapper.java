import java.util.Arrays;
import java.util.List;

public class DefaultCsvMapper implements CsvPropertyMapper {

    private final List<CsvProperty> csvProperties;

    public DefaultCsvMapper() {
        csvProperties = Arrays.asList(
                CsvProperty.builder().name("dealerCode").field("dealerCode").build(),
                CsvProperty.builder().name("dealerName").field("dealerName").build(),
                CsvProperty.builder().name("dealerCountry").field("dealerCountry").build(),
                CsvProperty.builder().name("shareholderCountryCode").field("shareholderCountryCode").build(),
                CsvProperty.builder().name("shareholderCountryLabel").field("shareholderCountryLabel").build(),
                CsvProperty.builder().name("shareholderAccount").field("shareholderAccount").build(),
                CsvProperty.builder().name("accountManagementName1").field("accountManagementName1").build(),
                CsvProperty.builder().name("accountManagementName2").field("accountManagementName2").build(),
                CsvProperty.builder().name("adress1").field("adress1").build(),
                CsvProperty.builder().name("adress2").field("adress2").build(),
                CsvProperty.builder().name("blockedOperations").field("blockedOperations").build(),
                CsvProperty.builder().name("reasonForBlocking").field("reasonForBlocking").build(),
                CsvProperty.builder().name("dividendPolicy").field("dividendPolicy").build(),
                CsvProperty.builder().name("legalFundCode").field("legalFundCode").build(),
                CsvProperty.builder().name("legalFundName").field("legalFundName").build(),
                CsvProperty.builder().name("subfundCode").field("subfundCode").build(),
                CsvProperty.builder().name("subfundName").field("subfundName").build(),
                CsvProperty.builder().name("userCurrency").field("userCurrency").build(),
                CsvProperty.builder().name("shareClassCode").field("shareClassCode").build(),
                CsvProperty.builder().name("shareClassName").field("shareClassName").build(),
                CsvProperty.builder().name("isin").field("isin").build(),
                CsvProperty.builder().name("nav").field("nav").build(),
                CsvProperty.builder().name("shareClassCurrency").field("shareClassCurrency").build(),
                CsvProperty.builder().name("amountInSharClassCurrency").field("amountInSharClassCurrency").build(),
                CsvProperty.builder().name("amountInUserCurrency").field("amountInUserCurrency").build(),
                CsvProperty.builder().name("quantity").field("quantity").build(),
                CsvProperty.builder().name("numberOfAccounts").field("numberOfAccounts").build()
        );
    }

    @Override
    public List<CsvProperty> getMapping() {
        return csvProperties;
    }
}
