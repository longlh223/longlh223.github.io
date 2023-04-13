package entity;

import java.util.ArrayList;

public class SummonRift {
    private String time;
    private ArrayList<Team> teams;

    public SummonRift(String time, ArrayList<Team> teams) {
        this.time = time;
        this.teams = teams;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "time='" + time + '\'' +
                ", teams=" + teams +
                '}';
    }
}
