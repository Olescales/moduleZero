package Task1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    private static File createFile (String header, FileExtension fileExtension, Directory directory) {
        return new TextFile(FileExtension.TXT, "MyFile", new Directory());
    }

    private static File renameFile (File file, String newHeader) {
        file.setHeader(newHeader);
        return file;
    }

    private static void getContentToConsole (File file) {
        System.out.println(file.getContent());
    }

    private static File addContent (File file, Content content) {
        StringBuilder stringBuilder = new StringBuilder();

        String fileContent = file.getContent().getText();
        String contentToAdd = content.getText();

        stringBuilder.append(fileContent);
        stringBuilder.append(contentToAdd);

        Content newContent = new Content(stringBuilder.toString());
        file.setContent(newContent);
        return file;
    }
}
