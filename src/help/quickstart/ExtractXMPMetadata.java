package help.quickstart;

import java.io.FileOutputStream;
import java.io.IOException;
import com.snowtide.pdf.PDFTextStream;

public class ExtractXMPMetadata {
	public static void main (String[] args) throws IOException {
		String pdfFilePath = "c:\\tmp\\test.pdf";

		PDFTextStream pdfts = new PDFTextStream(pdfFilePath);
		String outPath = "c:\\tmp\\test.xml";
		FileOutputStream s = new FileOutputStream(outPath);
		System.out.println(outPath);
		s.write(pdfts.getXmlMetadata());
		s.close();
		pdfts.close();
		System.out.printf("Wrote Adobe XMP metadata to %s", outPath);}}
