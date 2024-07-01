import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fesst {



    public static void main(String[] args) {


        List languageList = new ArrayList<>();
        languageList.add("c");
        languageList.remove("[ut");
        

    }
}


class Base {
    int x = 2;
    int method(){
        return x;
    }
}

class Subclass extends Base {
    int x = 3;
    int method(){
        return x;
    }
}