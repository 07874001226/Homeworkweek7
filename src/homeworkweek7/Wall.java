package homeworkweek7;

/*Wall Area
Write a class with the name Wall. The class needs two fields (instance variables) with name width
and height of type double.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters width and height of type double and it needs to
initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
* Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named setWidth with one parameter of type double, it needs to set the value of the width
field. If the parameter is less than 0 it needs to set the width field value to 0.
* Method named setHeight with one parameter of type double, it needs to set the value of the
height field. If the parameter is less than 0 it needs to set the height field value to 0.
* Method named getArea without any parameters, it needs to return the area of the wall.
TEST EXAMPLE
→ TEST CODE: (Write bellow code into main method and run and compare result with OUTPUT)
Wall wall = new Wall (5, 4);
System.out.println("area= " + wall.getArea());
wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea());
→ OUTPUT:
area= 20.0
width= 5.0
height= 0.0
area= 0.0
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 5 methods and 2 constructors

 */
public class Wall {
    //instance method

    private double width, height;//cunstructor

    public Wall(double width, double height) {
        //if else statement
        if (width > 0 && height < 0) {
            this.height = 0.0;
            this.width = 0.0;
        } else if (width < 0 && height > 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else if (width < 0 && height < 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    //instance method
    public double getWidth() {
        return width;
    }
    //instance method
    public double getHeight() {
        return height;
    }
//instance method
    public void setWidth(double width) {
        this.width = width;
//if statement
        if (width<0)
        {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
//instance method
    public void setHeight(double height) {
        this.height = height;
        if (height<0) {
            this.height= 0;
        }else{
            this.height = height;
        }
    }
    public double getArea (){
        double area = height * width;
        return this.width * this.height;
    }
//main method
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area = "+ wall.getArea());//print statement
        wall.setHeight(-1.5);
        System.out.println("width = "+ wall.getWidth());//print statement
        System.out.println("height = "+ wall.getHeight());//print statement
        System.out.println("area = "+ wall.getArea());//print statement
}
}