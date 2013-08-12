package br.com.aj2.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class SerialHd {

    public static String getHDSerial() throws IOException {
        String os = System.getProperty("os.name");

        try {
            if(os.startsWith("Windows")) {
                return getHDSerialWindows("C");
            // } else if(os.startsWith("Linux")) {
            //    return getHDSerialLinux("D");
            } else {
                throw new IOException("unknown operating system: " + os);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            throw new IOException(ex.getMessage());
        }
    }

    public static String getHDSerialWindows(String drive) {
        String result = "";
        try {
            //File file = File.createTempFile("tmp",".vbs");
            File file = File.createTempFile("tmp", ".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);
 
            String vbs = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n" + "Set colDrives = objFSO.Drives\n" 
                            + "Set objDrive = colDrives.item(\"" + drive + "\")\n" + "Wscript.Echo objDrive.SerialNumber";  
            fw.write(vbs);
            fw.close();
            Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                result += line;
            }
            input.close();
        } catch (Exception e) {
 
        }
        if (result.trim().length() < 1  || result == null) {
            result = "NO_DISK_ID";
 
        }
 
        return result.trim();
    }
    
    // public static String getHDSerialLinux(String drive) {
    	// Código Aqui!!
    // }
    
	public static void main(String[] args) {
		try {
			System.out.println("Serial HD: " + Integer.toHexString(Integer.parseInt(getHDSerial())));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}