import java.io.IOException;

public class ejecutor {
    public static void main(String... args){
        String[] command = {
            ".\\docto\\docto.exe",
            "-f", ".\\tareasistemasO.docx",
            "-O", ".\\tareasistemasOTxt.txt",
            "-T", "wdFormatText"
        };

        ProcessBuilder processBuilder = new ProcessBuilder(command);

        try {        
            Process process = processBuilder.start();

            int exitCode = process.waitFor();

            System.out.println("La aplicacion fue executada con código: "+exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}