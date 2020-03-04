package Commons;

import Model.Student;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameStudent = "DemoIO/src/Data/Student.csv";
    //header file CSV Student
    private static final String FILE_HEADER = "name,grade,address";

    public static void writeStudentToFileCSV(ArrayList<Student> ListStudent) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameStudent);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Student student : ListStudent) {
                fileWriter.append(student.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getGrade());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in csv file writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<Student> getFileCSVToListStudent() {
        BufferedReader br = null;
        ArrayList<Student> listStudent = new ArrayList<Student>();
        Path path = Paths.get(fileNameStudent);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameStudent);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameStudent));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                Student student = new Student();
                student.setName(splitData[0]);
                student.setGrade(splitData[1]);
                student.setAddress(splitData[2]);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listStudent;
    }
}
