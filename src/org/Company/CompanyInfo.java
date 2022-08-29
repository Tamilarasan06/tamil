package org.Company;

public class CompanyInfo {
   private void companyName(String name1) {
	   System.out.println("Company Name 1 :"+name1);
	 }
   private void companName(String name1) {
	   System.out.println("Company Name 1 :"+name1);
	 }
   private void companyName(String name2, int id) {
	System.out.println("Company name 2 :"+name2);
	}
   private void companyName(String name3,long ed) {
	System.out.println("Company name 3 :"+name3);
	}
public static void main(String[] args) {
	CompanyInfo ci = new CompanyInfo();
	ci.companyName("mi");
	ci.companyName("redmi", 234);
	ci.companyName("oppo",123l);
	ci.companName("Tamil");
}   
}
