package EksamensForberedelse.GraferOgAktivitetsPlanlægning;

import java.util.ArrayList;
import java.util.Scanner;

import JavaTest.anagramSpotter;

import java.io.File;
import java.io.FileNotFoundException;
public class Aktivitet {
    int event;
    String task;
    int duration;
    public Aktivitet(int event, String task, int duration){
        this.duration = duration;
        this.task = task;
        this.event = event;
    }
    public int getDuration(){
        return duration;
    }
    public String getTask(){
        return task;
    }
    public int getEvent(){
        return event;
    }
    @Override
    public String toString(){
        return event + " | " + task + " | " + duration;
    }
    public static void main(String[] args) {
        ArrayList<Aktivitet> tabel = new ArrayList<>();
        String filePath = "src\\EksamensForberedelse\\GraferOgAktivitetsPlanlægning\\data.txt";
        File file = new File(filePath);
        
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                
                int event = Integer.parseInt(parts[0]);
                String task = parts[1];
                int duration = Integer.parseInt(parts[2]);

                Aktivitet aktivitet = new Aktivitet(event, task, duration);
                tabel.add(aktivitet);
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        float avgDuration = 0; int j = 0;
        for (Aktivitet aktivitet : tabel) {
            System.out.println(aktivitet.toString());
            avgDuration += aktivitet.getDuration();
            j++;
            
        }
        System.out.println("average duration = " + avgDuration / j);
        ArrayList<String> path = new ArrayList<>();
        int currentEvent = tabel.get(0).getEvent();
        int currentHighest = 0;
        String taskToBeAdded = "";
        for (Aktivitet aktivitet : tabel) {
            if(currentEvent != aktivitet.getEvent()){
                path.add(taskToBeAdded);
                currentHighest = 0;
                currentEvent = aktivitet.getEvent();
            }
            if(aktivitet.getDuration() > currentHighest){
                currentHighest = aktivitet.getDuration();
                taskToBeAdded = aktivitet.getTask();
            }
            
        }
        path.add(taskToBeAdded);
        for (String string : path) {
            System.out.print(string +" - ");
        }

    }
}
