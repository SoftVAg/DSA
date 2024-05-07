import java.io.*;

public class parseFile {
    public static boolean createFile(){
       try {
           BufferedWriter write = new BufferedWriter(new FileWriter("fileName.txt"));
           write.write("Name = Vedansh");
           write.close();
       }
        catch (IOException e) {
           throw new RuntimeException(e);
       }
        return false;
    }

//    public static HashMap<String,String> parsingFile() throws FileNotFoundException {
//        File file = new File("C:\\Users\\DELL\\IdeaProjects\\DSA\\src\\file.txt");
//        HashMap<String,String> map = new HashMap<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line;
//          //  line = br.readLine();
//            while ((line = br.readLine()) != null && !line.startsWith("#")) {
//                String[] s = line.split("=",2);
//                map.put(s[0].trim() , s[1].trim());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return map;


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(createFile());
    }

}
