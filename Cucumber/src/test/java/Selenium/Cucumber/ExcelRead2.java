package Selenium.Cucumber;

import java.io.FileInputStream;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead2

{

	public static String readURLFromExcel() throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\ba06875\\Desktop\\abc.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheetAt(0);
        int rowcount = sh.getLastRowNum() + 1;
		int colcount = sh.getRow(0).getLastCellNum();
        ArrayList<String> list = new ArrayList<String>();

		//System.out.println("Row Count : " + rowcount);
	//	System.out.println("Col Count : " + colcount);

		for (int row = 0; row < rowcount; row++) {

			String Data = sh.getRow(row).getCell(0).getStringCellValue();
			list.add(Data);
			System.out.println(Data);
		//	System.setProperty("webdriver.gecko.driver",
				//	"C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			//System.setProperty("webdriver.chrome.driver",
					//"C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\chromedriver_win32\\chromedriver.exe");
			/*ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(list.get(row));
			// driver.get(list.get(col));
			driver.manage().window().maximize();
			Thread.sleep(5000);*/
			return list.get(row);
		}
		return null;
	}
};