
class Rect{

    float l, b;

    public void set_data(){
        l = 12.48f;
        b = 13.0f;
    }

    public void get_area(){
        System.out.println(this.l * this.b);
    }
}

public class AreaOfRectangle {

        public static void main(String[] args){
            Rect r1 = new Rect();
            r1.set_data();
            r1.get_area();

        }
    
}
