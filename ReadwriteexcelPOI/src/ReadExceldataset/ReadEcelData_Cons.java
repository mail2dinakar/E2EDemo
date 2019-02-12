package ReadExceldataset;

import Lib.ReadExceldataConstructorclass;

public class ReadEcelData_Cons {

	public static void main(String[] args) {
		ReadExceldataConstructorclass excel=new ReadExceldataConstructorclass("C:\\Users\\Bhanu\\Desktop\\Bhanu Selenium\\Exceldata.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));
		
		System.out.println(excel.getrowcount(0));

	}

}
