package CD;

import java.util.ArrayList;
import java.util.List;

public class CDManager {
    List<CD> listCD = new ArrayList<CD>();

    public void AddOne() {
        CD cd = new CD();
        cd.input();
        boolean flag=true;
        for (CD x:listCD
             ) {
            if (x.getId()==cd.getId()){
                flag=false;
                break;
            }
        }
        if(flag){
            listCD.add(cd);
        }else {
            System.out.println("Trung ID,Nhap lai");
            AddOne();
        }
    }

    public void display() {
        for (CD cd : listCD
        ) {
            System.out.println(cd.toString());
        }
    }
}
