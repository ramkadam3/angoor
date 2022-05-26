package pompak;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
	public String exel(int i,int j) throws EncryptedDocumentException, IOException
	{
		
		
		
		
		String path="C:\\Users\\sunny\\Desktop\\test.xlsx";
         FileInputStream file= new FileInputStream(path);
         String a=WorkbookFactory.create(file).getSheet("first").getRow(i).getCell(j).getStringCellValue();
                      	return a;	 
	}
}
