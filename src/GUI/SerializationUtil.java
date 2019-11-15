package GUI;


import doprava.AbsProstredek;
import java.io.*;
import java.util.ArrayList;



public class SerializationUtil {

	// serialize the given object and save it to file
	public static void serialize(ArrayList<AbsProstredek> obj, String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
      for (Object o : obj) {
        oos.writeObject(o);
      }
		fos.close();
	}
        
  // deserialize to Object from given file
	public static ArrayList<AbsProstredek> deserialize(String fileName) throws IOException, ClassNotFoundException {
    ArrayList<AbsProstredek> obj = new ArrayList<>();
		FileInputStream fis = new FileInputStream(fileName);
    ObjectInputStream ois = new ObjectInputStream(fis);
    Object o = null;
      try {
        for (int i=0; i<10; i++) {
          o = ois.readObject();
          obj.add((AbsProstredek)o);
        } 
      } catch(EOFException e) { 
         fis.close();
      }
      return obj;
	}

}
