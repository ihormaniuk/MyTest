package famili.human;

public class Human {
    private String name;       //імя
    private String surName;     //фамілія
    private int age;        //років
    private int yearBirth;      // рік народження
    private String colorBody;       //колір шкіри
    private String colorHair;           // колір волося
    private double growth;          //ріст
    private double bodyWeight;          //вага тіла


    public Human(String name, String surName, int age, int yearBirth, String colorBody, String colorHair, double growth, double bodyWeight){              //конструктор батьківського класу
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.yearBirth = yearBirth;
        this.colorBody = colorBody;
        this.colorHair = colorHair;
        this.growth = growth;
        this.bodyWeight = bodyWeight;
    }

    public void setName(String name) {                  //get - set батьківського класу
        this.age = age;
    }

    public String getName(String name) {
        return name;
    }
    public void setSurName(String surname){
        this.surName = surName;
    }
    public String getSurName(String surName){
        return surName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(int age){
        return age;
    }
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }

    public int getYearBirth(int yearBirth) {
        return yearBirth;
    }
    public void setColorBody(String colorBody){
        this.colorBody = colorBody;
    }

    public String getColorBody(String colorBody) {
        return colorBody;
    }
    public void setColorHair(String colorHair){
        this.colorHair = colorHair;
    }

    public String getColorHair(String colorhair) {
        return colorHair;
    }
    public void setGrowth(double growth){
        this.growth = growth;
    }

    public double getGrowth(double growth) {
        return growth;
    }
    public void setBodyWeight(double bodyWeight){
        this.bodyWeight = bodyWeight;
    }

    public double getBodyWeight(double bodyWeight) {
        return bodyWeight;
    }
    public void getInfo(){
        System.out.println("Ім`я - " + name + "," + " Фамілія - " + surName + "," + " Вік - " + age + "," + " Рік народження - " + yearBirth + "," + " Колір шкіри - " + colorBody + ","  + " Колір волося - " + colorHair + ","  + " Ріст - " + growth + ","  + " Вага - " + bodyWeight);
    }
}
