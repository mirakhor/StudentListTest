/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytest;

/**
 *
 * @author Elnaz
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StudentTest[] studentList = new StudentTest[3];
        studentList[0] =new StudentTest("s1", "el");
        studentList[1] =new StudentTest("s2", "ba");
        studentList[2] =new StudentTest("s3", "ar");
        
        for(int i=0; i<studentList.length; i++){
            System.out.println(studentList[i].getName());
        }
        
        
        
        // TODO code application logic here
    }
    
}
