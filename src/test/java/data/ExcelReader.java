package data;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
   static  FileInputStream reader  ;

    public  FileInputStream  fileReader()  {
        String filePath = System.getProperty("user.dir")+"/src/test/java/data/ExcelData.xlsx";


        try {
            reader = new FileInputStream(filePath) ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reader ;
    }

    public  Object[][]   getExcelData () throws IOException {
      reader = fileReader() ;
      XSSFWorkbook wb = new XSSFWorkbook(reader);
        XSSFSheet sheet =wb.getSheetAt(0)  ;

          int no_of_row = 2;
           int no_of_col = 2 ;
           String[][] array_Data = new String [no_of_row][no_of_col]  ;

             for (int i =0 ; i < no_of_row ; i++) {
               for (int j=0 ; j < no_of_col ; j++) {
                   XSSFRow row = sheet.getRow(i);
                   array_Data[i][j]= row.getCell(j).toString();
               }
             }
             wb.close();
            return array_Data ;
    }

}
