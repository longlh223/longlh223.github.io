import entity.SummonRift;
import entity.Team;
import handle.TeamHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap thoi gian dien ra tran dau");
        String time= scanner.nextLine();

        TeamHandle teamHandle = new TeamHandle();
        ArrayList<Team> teams= new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Thong tin team "+(i+1)+":");
            Team team=teamHandle.team(scanner);
            teams.add(team);
        }

        SummonRift summonRift = new SummonRift(time,teams);
        System.out.println(summonRift);
    }
}