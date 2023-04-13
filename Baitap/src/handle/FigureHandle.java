package handle;

import entity.Figure;

import java.util.Scanner;

public class FigureHandle {
    public Figure inputFigure(Scanner scanner){
        System.out.println("Nhap ten tuong: ");
        String name= scanner.nextLine();
        System.out.println("Nhap thuoc tinh:");
        String position= scanner.nextLine();
        Figure figure= new Figure(name, position);
        return figure;
    }
}
