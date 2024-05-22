package Basic_Programs_Java;

import java.util.Scanner;

public class Areas_of_shapes {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the shape you want area::");
            System.out.println("Choose 1.Circle 2.Rectangle 3.Rhombus 4.Parallelogram 5.Triangle");
            int shape = in.nextInt();
            switch (shape) {
                case 1:
                    System.out.print("Enter Radius:");
                    int rad = in.nextInt();
                    double areac = 3.14 * (double)rad * (double)rad;
                    System.out.println("The area of circle is:" + areac);
                    break;
                case 2:
                    System.out.print("Enter Length and Breadth:");
                    int len = in.nextInt();
                    int brea = in.nextInt();
                    int areare = len * brea;
                    System.out.println("The area of Rectangle is:" + areare);
                    break;
                case 3:
                    System.out.print("Enter Base and Height of Rhombus:");
                    int ba = in.nextInt();
                    int he = in.nextInt();
                    int arearh = ba * he;
                    System.out.println("The area of Rhombus is:" + arearh);
                    break;
                case 4:
                    System.out.print("Enter Base and Height of Parallelogram:");
                    int b = in.nextInt();
                    int h = in.nextInt();
                    int areapr = b * h;
                    System.out.println("The area of Parallelogram is:" + areapr);
                    break;
                case 5:
                    System.out.print("Choose 1.Normal triangle 2.Isosceles Triangle 3.Equilateral Triangle ");
                    int tri = in.nextInt();
                    switch (tri) {
                        case 1:
                            System.out.println("Enter base and height::");
                            int base = in.nextInt();
                            int height = in.nextInt();
                            double areatri = 0.5 * (double)base * (double)height;
                            System.out.println("The area of Triangle is:" + areatri);
                            break;
                        case 2:
                            System.out.println("Enter base and height::");
                            int bas = in.nextInt();
                            int hei = in.nextInt();
                            int areariso = bas * hei / 2;
                            System.out.println("The area of Isosceles Triangle is:" + areariso);
                            break;
                        case 3:
                            System.out.println("Enter length of side::");
                            int a = in.nextInt();
                            double areaequi = (double)(a * a) * 0.433;
                            System.out.println("The area of Equilateral Triangle is:" + areaequi);
                            break;
                        default:
                            System.out.println();
                    }
                default:
                    System.out.println();
            }

        }
    }
