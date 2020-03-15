package Task1;

public class TextFile extends File {

    private Content textContent;

    public TextFile(FileExtension fileExtension, String header, Directory directory) {
        super(fileExtension, header, directory);
    }

    public Content getTextContent() {
        return textContent;
    }

    public void setTextContent(Content textContent) {
        this.textContent = textContent;
    }
}
