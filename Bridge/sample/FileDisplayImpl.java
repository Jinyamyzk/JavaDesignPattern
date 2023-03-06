import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileDisplayImpl extends DisplayImpl {
    private String filename;
    private List<String> lines;
    private int maxlen = 0;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
        Path path = Paths.get(filename);
        try {
        lines = Files.readAllLines(path);
        } catch(IOException e) {
            e.printStackTrace();
        }
        lines.forEach(line -> {
            maxlen = line.length() > maxlen? line.length() : maxlen;
        });
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        lines.forEach(line -> System.out.println("> " + line + ""));
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        for (int i = 0; i < maxlen+2; i++) {
            System.out.print("=");
        }
        System.out.println("");
    }
}
