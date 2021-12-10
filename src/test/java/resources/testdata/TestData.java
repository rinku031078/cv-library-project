package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "jobsearch")
    public static Object[][] objectTestData() {
        return new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Electrician", "London", "up to 7 miles", "20000", "30000","Per annum","Permanent","Permanent Electrician jobs in London"},
                {"Software Developer", "Manchester", "up to 10 miles", "3500", "5000","Per month","Part Time","Part Time Software Developer jobs in Manchester"},
                {"Automation Tester", "Leeds", "up to 35 miles", "350", "650","Per day","Contract","Contract Automation Tester jobs in Leeds"},
                {"Plumber", "London", "up to 25 miles", "15", "25","Per hour","Temporary","Temporary Plumber jobs in London"},
                {"Mechanical Design Engineer", "Edinburgh, City of Edinburgh", "up to 50 miles", "500", "700","Per week","Apprenticeship","Apprenticeship Mechanical Design Engineer jobs in Edinburgh"},
                {"Scrum Master", "London", "up to 50 miles", "50000", "700000","Per annum","Permanent","Permanent Scrum Master jobs in London"},


        };
    }


}
