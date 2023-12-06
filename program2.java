package salerecordpack;

public class program2 {

	public static void main(String[] args) {
		// Assuming the CSV file path is passed as a command-line argument
		String csvFilePath = args[0];

		// Task 1: Read instances of a specific Car Make and Model
		ArrayList<SaleRecord> specificCarRecords = readSpecificCarRecords(csvFilePath, "Nissan", "Altima");

		// Task 2a: Sort based on Customer First Name (using Comparator)
		sortByCustomerFirstName(specificCarRecords);

		// Task 2b: Sort based on Commission Rate (using Comparable)
		sortByCommissionRate(specificCarRecords);

		// Task 2c: Sort based on Date (using Lambda Function)
		sortByDateLambda(specificCarRecords);

		// Task 2d: Sort based on Date (without using Lambda Function)
		sortByDateWithoutLambda(specificCarRecords);

	}//End of Main Method

}
