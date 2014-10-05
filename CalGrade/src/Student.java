/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wLongjaroen
 */
public class Student {

    // Field 
    private String[] dataFromMain;
    private String[] id;
    private int[] mid;
    private int[] fin;
    
    // Constructor
    public Student(String[] data) {
        dataFromMain = new String[3*data.length];
        id = new String[data.length];
        mid = new int[data.length];
        fin = new int[data.length];
        
        // split String to array[]
        for(int i = 0; i < data.length; i++){
             dataFromMain = dataFromMain[i].split(":");
        }
        
        // split data to each array
        for(int i = 0; i < dataFromMain.length; i++){
            
        }
    }
    
    // Method
    
    
}
