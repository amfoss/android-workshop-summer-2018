import java.io.*;

public class MyReader {
    
    // Method 1
    public void readFromAFile(String fileName) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
        
            int c; // To store a piece of a data from file
    
            while((c = fileReader.read()) != -1) {
                System.out.println(c);
            }
        }catch(FileNotFoundException fnfe) {
            System.err.println(fnfe);
        }catch(IOException io){
            System.err.println(io);
        }finally{
            try{
                fileReader.close();
            }catch(IOException ioe) {
                System.err.println(ioe);
            }
        }
    }

    //. Method 2
    public void writeToAFile(String fileName, String input) 
    throws IOException {

        FileWriter fileWriter = new FileWriter("fileName");

        for(int i=0; i<input.length(); i++) {
            fileWriter.write(input.charAt(i));
        }

        fileWriter.close();
    }
}