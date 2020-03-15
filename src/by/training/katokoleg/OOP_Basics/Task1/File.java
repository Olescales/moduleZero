package Task1;

public class File {

    private Content content;
    private String header;
    private FileExtension fileExtension;
    private Directory directory;

    public File(FileExtension fileExtension, String header, Directory directory) {
        this.fileExtension = fileExtension;
        this.header = header;
        this.directory = directory;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public FileExtension getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(FileExtension fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
