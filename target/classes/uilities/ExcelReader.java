package resources.uilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelReader {
	
	



    public ArrayList<Object> getData(String testDataName)  {
        String path = System.getProperty("user.dir");

        ArrayList<Object> arr = new ArrayList<Object>();
        XSSFWorkbook workbook = null;

        FileInputStream fis;
        try {
            fis = new FileInputStream(path + "/src/main/java/resources/test_data.xlsx");
            workbook = new XSSFWorkbook(fis);
        }
        catch (Exception e1)
        {
            System.out.println("Test Data file not found");
            e1.printStackTrace();
        }

        int sheetC = workbook.getNumberOfSheets();

        for(int i = 0; i<sheetC; i++)
        {
            try {
                if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
                    XSSFSheet sheet = workbook.getSheetAt(i);
                    Iterator<Row> rowdata = sheet.iterator();
                    Row firstrow = rowdata.next();
                    Iterator<Cell> cell = firstrow.cellIterator();
                    int k = 0;
                    int column = 0;
                    while (cell.hasNext()) {
                        Cell cellvalue = cell.next();
                        if (cellvalue.getStringCellValue().equalsIgnoreCase("key")) {
                            column = k;
                        }
                        k++;
                    }

                    while (rowdata.hasNext()) {
                        Row r = rowdata.next();
                        if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testDataName)) {
                            Iterator<Cell> cellrow = r.cellIterator();
                            while (cellrow.hasNext()) {
                                Cell cell1 = cellrow.next();

                                switch (cell1.getCellType()) {
                                    case STRING:
                                        arr.add(cell1.getStringCellValue());
                                        break;

                                    case NUMERIC:
                                        arr.add(NumberToTextConverter.toText(cell1.getNumericCellValue()));
                                        break;

                                    case BOOLEAN:
                                        arr.add(cell1.getBooleanCellValue());
                                }

                                //arr.get(1);
                            }
                        }
                    }
                }
            }catch (Exception e1)
            {
                System.out.println("Sheet name or Row name not matching");
                System.out.println(e1.getMessage());
            }
        }
            return arr;
    }
}
