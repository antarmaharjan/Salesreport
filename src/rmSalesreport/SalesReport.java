package rmSalesreport;

import java.util.Scanner;

public class SalesReport {

	public static void main(String[] args) {
		
	
		int Taxcode;
		String CustomerName="n";
		double SalesAmt;
		double TotalAmt =0;
		double TaxAmt =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter CustmerName");
		CustomerName =scanner.nextLine();
		System.out.println("Enter Taxcode");
		Taxcode =scanner.nextInt();
		
		System.out.println("Enter SalesAmt");
		SalesAmt =scanner.nextDouble();
		
		if (Taxcode ==0){
			System.out.println("Tax exempt");
		}
		else if(Taxcode ==1){
			TaxAmt =(0.03*SalesAmt);
		}
		else if (Taxcode ==2){
		TaxAmt = (0.05*SalesAmt);
		}
		else{
			System.out.println("you entered the wrong taxcode,please enter the correct taxcode");
			Taxcode =scanner.nextInt();
		}
		TotalAmt =SalesAmt +TaxAmt;
		System.out.println("----------Sales Report----------------------");
		//System.out.println("TaxCode CustomerName SalesAmt TaxAmt TotalAmt");
		System.out.println("Tax code="+Taxcode+" Customer Name="+CustomerName +" Sales Amount ="+SalesAmt +" Tax amount="+TaxAmt +" Total amount ="+TotalAmt);
	
		
		

	}

}

