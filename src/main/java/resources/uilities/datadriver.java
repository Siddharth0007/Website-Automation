package resources.uilities;

import java.util.ArrayList;

public class datadriver {


    public static String getTest(String testDataName) throws Exception {

        ExcelReader excel = new ExcelReader();

        ArrayList<Object> arrayd = excel.getData(testDataName);

        String testvalue = (String) arrayd.get(1);

        return testvalue;
    }

}
