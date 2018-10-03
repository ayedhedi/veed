import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter(new File("test.csv"));

        List<Bean> beans = new ArrayList<>();
        for(int i=0;i<100000;i++){
            beans.add(generateBean());
        }

        ReportCsvWriter<Bean> reportCsvWriter = new
                ReportCsvWriter<>(Bean.class, new DefaultCsvMapper(), new DefaultCsvSettings());

        reportCsvWriter.write(fileWriter, beans.stream());

        fileWriter.close();
    }


    static Bean generateBean() {
        return Bean.builder()
                .accountManagementName1(RandomStringUtils.randomAlphabetic(10))
                .accountManagementName2(RandomStringUtils.randomAlphabetic(10))
                .adress1(RandomStringUtils.randomAlphabetic(10))
                .adress2(RandomStringUtils.randomAlphabetic(10))
                .amountInSharClassCurrency(Math.random())
                .blockedOperations(RandomStringUtils.randomAlphabetic(10))
                .dealerCode(RandomStringUtils.randomAlphabetic(10))
                .dealerCountry(RandomStringUtils.randomAlphabetic(10))
                .dealerName(RandomStringUtils.randomAlphabetic(10))
                .dividendPolicy(RandomStringUtils.randomAlphabetic(10))
                .isin(RandomStringUtils.randomAlphabetic(10))
                .legalFundCode(RandomStringUtils.randomAlphabetic(10))
                .nav(Math.random())
                .amountInUserCurrency(RandomStringUtils.randomAlphabetic(10))
                .numberOfAccounts((long)(Math.random()*1000))
                .quantity(Math.random())
                .reasonForBlocking(RandomStringUtils.randomAlphabetic(10))
                .shareClassCode(RandomStringUtils.randomAlphabetic(10))
                .shareClassCurrency(RandomStringUtils.randomAlphabetic(10))
                .shareClassName(RandomStringUtils.randomAlphabetic(10))
                .shareholderAccount(RandomStringUtils.randomAlphabetic(10))
                .shareholderCountryCode(RandomStringUtils.randomAlphabetic(10))
                .shareholderCountryLabel(RandomStringUtils.randomAlphabetic(10))
                .subfundCode(RandomStringUtils.randomAlphabetic(10))
                .subfundName(RandomStringUtils.randomAlphabetic(10))
                .legalFundName(RandomStringUtils.randomAlphabetic(10))
                .userCurrency(RandomStringUtils.randomAlphabetic(10))
                .build();
    }
}
