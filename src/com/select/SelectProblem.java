package com.select;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class SelectProblem {
    public static void main(String [] args){

        int selectAction = 3;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("请选择进行的操作 1、更新第一个列表 2、更新第二个列表 3、选择下一个题号");
            selectAction = input.nextInt();
            switch (selectAction) {
                case 1:
                    updateList("firstlist.txt");
                    break;
                case 2:
                    updateList("secondlist.txt");
                    break;
                case 3:
                    selectNextNumber();
                    break;
                default:
                    System.out.println("输入错误,请重新输入");
            }
        }

    }


    public static void updateList(String fileName){

        int addNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入添加的序号");
        addNumber = input.nextInt();

        try {
            File targetFile = new File(fileName);
            PrintWriter output = new PrintWriter(new FileWriter(targetFile,true));
            output.println(addNumber);
            output.close();
            System.out.println("序号"+addNumber+"添加成功");
        }catch (Exception ex){

        }
    }

    public static void selectNextNumber(){

        System.out.print("请输入最大的序号");
        Scanner input = new Scanner(System.in);
        int maxNumber = input.nextInt();
        try {
            File file = new File("firstlist.txt");
            File file2 = new File("secondlist.txt");
            Scanner input1;
            Scanner input2;

            boolean flag = false;  //生成随机序号成功的标识位
            while(!flag){
                input1 = new Scanner(file);
                input2 = new Scanner(file2);
                Random random = new Random();
                int number = random.nextInt(maxNumber);
                System.out.println("随机出的序号为" + number);

                while (input1.hasNext()) {
                    int number1 = input1.nextInt();
                    if (number1 == number) {
                        System.out.println("选择的序号在列表一中出现");
                    }
                }

                boolean index = false;
                while (input2.hasNext()) {
                    int number2 = input2.nextInt();
                    if (number2 == number) {
                        index = true;
                        System.out.println("选择的序号在列表二中出现,请重新选择");
                    }
                }

                flag = !index;

                input1.close();
                input2.close();
            }
        }
        catch (Exception ex){

        }
    }

}
