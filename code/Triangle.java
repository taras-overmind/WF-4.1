package com.code;
public class Triangle {
    protected double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1<side2+side3 &&side2<side1+side3 && side3<side1+side2){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;}
        else{
            System.out.println("Трикутник вироджений");
            side1=0; side2=0; side3=0;
        }
    }
    void change_side(double new_side, int side_index){
        switch (side_index) {
            case (1): if(new_side<side2+side3) side1=new_side; break;
            case (2): if(new_side<side1+side3) side2=new_side; break;
            case (3): if(new_side<side2+side3) side3=new_side; break;
            default:
                System.out.println("Wrong side index");
        }
    }
    double calcPerimeter(){
        return side1+side2+side3;
    }
    double calcAngle(int side1_index, int side2_index){
        if ((side1_index==1 && side2_index==2) || (side1_index==2 && side2_index==1))
            return (Math.acos((side1*side1+side2*side2-side3*side3)/(2*side1*side2)));
        else if ((side1_index==2 && side2_index==3) || (side1_index==3 && side2_index==2))
            return (Math.acos((side2*side2+side3*side3-side1*side1)/(2*side2*side3)));
        else if ((side1_index==1 && side2_index==3) || (side1_index==3 && side2_index==1))
            return (Math.acos((side1*side1+side3*side3-side2*side2)/(2*side1*side3)));
        else{
            System.out.println("Wrong side index");
            return 0;}
    }


}
