package pages;

public class PDFContenetValidation {
	
	String filePath1 = "";
	String filePath2 = "";
	String resultFile = "";
	String difference1;
	String difference2;
	
	static String textpath = "";
	static String textpath1 = "";
	
	public PDFContenetValidation PDFContentValidation () {
		return this;
	}
	
	public void pdfStart() {
		
		PDFContenetValidation pdfRead = new PDFContenetValidation();
		pdfRead.readContentFromPDF(filePath2);
		pdfRead.printContentOfPDF(filePath2);
		pdfRead.readContentFromPDF(filePath2);
		pdfRead.printContentOfPDF(filePath2);
		pdfRead.PDFComparison();
		pdfRead.log(difference1);
		pdfRead.log(difference2);
		pdfRead.pdfAlignmentCheck();
		
		
	}

	private void pdfAlignmentCheck() {
		// TODO Auto-generated method stub
		
	}

	private void log(String difference12) {
		// TODO Auto-generated method stub
		
	}

	private void PDFComparison() {
		// TODO Auto-generated method stub
		
	}

	private void printContentOfPDF(String filePath22) {
		// TODO Auto-generated method stub
		
	}

	private void readContentFromPDF(String filePath22) {
		// TODO Auto-generated method stub
		
	}

}
