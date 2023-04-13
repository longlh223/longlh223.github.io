package entity;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Figure> figures;

    public Team() {
    }

    public Team(String name, ArrayList<Figure> figures) {
        this.name = name;
        this.figures = figures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", figures=" + figures +
                '}';
    }
}
