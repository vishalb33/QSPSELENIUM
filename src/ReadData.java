import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("‪‪‪D:\\Login.xlsx"); //path of excel file
		
		Workbook wb = WorkbookFactory.create(fis);  //loding the excel file
		Sheet sh = wb.getSheet("Sheet");            //loaded sheet also
		int rowcount = sh.getPhysicalNumberOfRows(); //how many row
		Row firstRow = sh.getRow(0);
		for (int row = 0; row < rowcount; row++) {
			for (int col = 0; col < firstRow.getLastCellNum(); col++)  {
				Cell cl = sh.getRow(row).getCell(col);
				System.out.println(cl.toString() + "   ");
			}
			System.out.println();
		}
	}
}
