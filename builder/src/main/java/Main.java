import com.designr.Director;
import com.designr.component.Booklet;
import com.designr.component.House;
import com.designr.house.HouseBookletBuilder;
import com.designr.house.HouseBuilder;

public class Main {

    public static void main(String[] args){
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();
        director.constructTypeA(houseBuilder);

        House house = houseBuilder.getResult();
        System.out.println(house.getWallType());

        HouseBookletBuilder bookletBuilder = new HouseBookletBuilder();

        director.constructTypeA(bookletBuilder);
        Booklet booklet = bookletBuilder.getResult();

        System.out.println("\nHouse Booklet build: \n" + booklet.print());
    }
}
