package week2.day2;

import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReverseString {

	public static void main(String[] args) {
		String companyName="Testleaf";
		char[] num = companyName.toCharArray();
	System.out.println(num);
		
		for (int i = 7; i >=0 ; i--) {
			System.out.println(num[i]);
			
		}
	
		
	}
	}

