import java.io.*;
class FileHandle{
 public static void main(String[] args){
   File file = new File("Location");
   if(file.exists()){
     System.out.println("File Found");
    Sysyem.exit(0);
   }
 }

}
