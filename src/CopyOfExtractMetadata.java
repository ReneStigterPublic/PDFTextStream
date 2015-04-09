
/*Extract key\value PDF metadata*/

import java.io.IOException;

import com.snowtide.pdf.PDFTextStream;	

public class CopyOfExtractMetadata {
	public static void main (String[] args) throws IOException {
		String pdfFilePath = "c:\\tmp\\test.pdf";
		System.out.printf("All document metadata from %s:", pdfFilePath);
		PDFTextStream pdfts = new PDFTextStream(pdfFilePath);
		for (Object key : pdfts.getAttributeKeys()) {
			System.out.printf("%s: %s", key, pdfts.getAttribute((String)key));
			System.out.println();
		}
		pdfts.close();
	}
}
