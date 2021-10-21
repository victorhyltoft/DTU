package assignments.testing;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class CompareFiles {

    public final static String TestfilePath = "src/assignments/assignment2/exercise2/";

    public static void main(String[] args) {
        listFilesForFolder(new File(TestfilePath));
        CompileAndRun();

    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }

    public static void CompileAndRun() {
        try {
            int result = compile("compileandrun/HelloWorld.java");
            System.out.println("javac returned " + result);
            result = run("compileandrun.HelloWorld");
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static int run(String clazz) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java", clazz);
        pb.redirectError();
        pb.directory(new File("src"));
        Process p = pb.start();
        InputStreamConsumer consumer = new InputStreamConsumer(p.getInputStream());
        consumer.start();

        int result = p.waitFor();

        consumer.join();

        System.out.println(consumer.getOutput());

        return result;
    }

    public static int compile(String file) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("javac", file);
        pb.redirectError();
        pb.directory(new File("src"));
        Process p = pb.start();
        InputStreamConsumer consumer = new InputStreamConsumer(p.getInputStream());
        consumer.start();

        int result = p.waitFor();

        consumer.join();

        System.out.println(consumer.getOutput());

        return result;
    }

    public static class InputStreamConsumer extends Thread {

        private final InputStream is;
        private IOException exp;
        private StringBuilder output;

        public InputStreamConsumer(InputStream is) {
            this.is = is;
        }

        @Override
        public void run() {
            int in = -1;
            output = new StringBuilder(64);
            try {
                while ((in = is.read()) != -1) {
                    output.append((char) in);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                exp = ex;
            }
        }

        public StringBuilder getOutput() {
            return output;
        }

        public IOException getException() {
            return exp;
        }
    }

}
