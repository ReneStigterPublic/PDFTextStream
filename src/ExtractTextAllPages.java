
 
import java.io.IOException;
 
import com.snowtide.pdf.OutputTarget;
import com.snowtide.pdf.PDFTextStream;
 
public class ExtractTextAllPages {
    public static void main (String[] args) throws IOException {
        //String pdfFilePath = args[0];
        String pdfFilePath = "c:\\tmp\\test.pdf";
        PDFTextStream pdfts = new PDFTextStream(pdfFilePath); 
        StringBuilder text = new StringBuilder(1024);
        pdfts.pipe(new OutputTarget(text));
        pdfts.close();
        System.out.printf("The text extracted from %s is:", pdfFilePath);
        System.out.println(text);
    }
}