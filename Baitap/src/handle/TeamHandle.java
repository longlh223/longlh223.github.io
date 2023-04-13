package handle;

import entity.Figure;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamHandle {
    public Team team(Scanner scanner){
        System.out.println("Nhap ten doi:");
        String name= scanner.nextLine();

        ArrayList<Figure> figures= new ArrayList<>();
        FigureHandle figureHandle= new FigureHandle();
        for (int i = 0; i < 5; i++) {
            Figure figure= figureHandle.inputFigure(scanner);
            figures.add(figure);
        }

        Team team= new Team(name,figures);
        return team;
    }
}
