public class Racle {
    int length ;
    int width ;


    public  Racle(){
    }

    public  Racle(int length ,int width){
        this.length = length;
        this.width = width;
    }

    public int perimeter(){
        return  length*2 + width*2;
    }

    public int area(){
        return length*width;
    }

}
