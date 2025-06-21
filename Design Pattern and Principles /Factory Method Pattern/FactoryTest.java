public interface Document {
    void open();
}
public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document...");
    }
}
public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}
public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}
public abstract class DocumentFactory {
    public abstract Document createDocument();
}
public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
