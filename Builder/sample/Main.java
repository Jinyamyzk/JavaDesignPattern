import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        if (args.length !=1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("text")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getTextResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getHTMLResult();
            System.out.println("HTMLファイル" + filename + "が作成されました。");
        } else if (args[0].equals("frame")) {
            FrameBuilder framebuilder = new FrameBuilder();
            Director director = new Director(framebuilder);
            director.construct();
            JFrame frame = framebuilder.getFrameResult();
            frame.setVisible(true);
        }else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main text   テキストで文書作成");
        System.out.println("Usage: java Main html　  HTMlファイルで文書作成");
    }
}
