package View;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import core.Views;

public abstract class view<T> implements Views<T> {
    protected Scanner scanner=new Scanner(System.in);

    @Override
    public void afficher(List<T> datas) {
    for (T data : datas) {
         System.out.println(data);   
    }
    
  } 
  public int ask1(String msg){
    int clas;
    scanner.nextLine();
    System.out.println(msg);
    clas=scanner.nextInt();
    return clas;
}
public static LocalDate formatDate(String date){
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date,formatter);
      } 



      public static LocalTime formatHeure(String heure){
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("HH:mm");
       return  LocalTime.parse(heure,formatter);
    }
    
}


