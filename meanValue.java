package vibes.guy.manage.nilai;
import java.util.Scanner;
import java.util.ArrayList;

public class meanValue {
    
    public static void main (String[] args) {
        System.out.println ("Hello, user!");
        
        //Playtest
        Scanner input = new Scanner (System.in);
        System.out.println ("Absen?");
        String absen1 = input.nextLine();
        System.out.println ("Nilai Tugas?");
        double tugas = input.nextInt();
        int tugas1 = (int) tugas;
        System.out.println ("Nilai Paparan?");
        double paparan = input.nextInt();
        int paparan1 = (int) paparan;
        System.out.println ("Nilai UTS?");
        double uts = input.nextInt();
        int uts1 = (int) uts;
        System.out.println ("Nilai UAS?");
        double uas = input.nextInt();
        int uas1 = (int) uas;
        System.out.println ("Absen ke - " + absen1);
        ArrayList <Integer> data1 = new ArrayList<>();
        data1.add(tugas1);
        data1.add(paparan1);
        data1.add(uts1);
        data1.add(uas1);
        System.out.println ("Data ArrayList = " + (data1));
        double total = tugas + paparan + uts + uas;
        double mean = total / 4; 
        System.out.println ("Rata-rata = " + (mean));
                                
    }  
}

/*
* Alhamdulillah :)
*/