class bill{
     static int billId = 1727;
	 static String billIssueDate ="12/06/2024";
	 static String billDueDate ="27/07/2024";
	 static boolean isBillPaid = false;
	 static boolean isLatestBill = true;
 
 public static void main(String airtelBill[]){

	 System.out.println("*************************");
	 System.out.println("The Bill ID is " + billId);
	 System.out.println("The Bill is issued on " + billIssueDate);
	 System.out.println("The Bill Due Date is " + billDueDate);
	 System.out.println("The Bill is latest " + isLatestBill);
	 System.out.println("The Bill is paid " + isBillPaid);
	 System.out.println("*************************");
 
 }
	
}