package com.hei.St;


import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Auther:hxq
 * @Date:2021/12/9 - 12 - 09 -15:38
 */
public class Stud {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("---------------欢迎------------------");
            System.out.println("1、add");
            System.out.println("2、dele");
            System.out.println("3、unp");
            System.out.println("4、select");
            System.out.println("5、esc");
            System.out.println("请输入关键字:");
            Scanner sc = new Scanner(System.in);
            String a = sc.next().trim();
            System.out.println(a);
            if (a.equals("add") || a.equals("1")) {
                //System.out.println("请添加");
                addStudent(array);
            } else if (a.equals("dele")|| a.equals("2")) {
                System.out.println("请删除");
            } else if (a.equals("unp")|| a.equals("3")) {
                System.out.println("请修改");
            } else if (a.equals("select")|| a.equals("4")) {
                //System.out.println("请查看");
                findAllstudent(array);
            } else if (a.equals("esc")|| a.equals("5")) {
                System.out.println("think");
                //break;
                System.exit(0);
            } else {
                System.out.println("我是权爹");
            }


        }
    }
    //定义的方法   添加数据      将填加的数据给学生对象  添加到 list内
    public static void  addStudent(ArrayList<Student>arrar){
        //传值给学生对象
        Scanner sa = new Scanner(System.in);
        System.out.println("请输入id");
        String id = sa.nextLine();
        System.out.println("请输入name");
        String name = sa.nextLine();
        System.out.println("请输入age");
        String age = sa.nextLine();
        System.out.println("请输入地址");
        String address = sa.nextLine();
        //创建学生对象
        Student student = new Student();
        student.setSid(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        //添加到list 内
        arrar.add(student);
        //添加成功
        System.out.println("成功");

    }
    //查看学生   查看list内数据
    public static void findAllstudent(ArrayList<Student>array){
        //显示表头
        System.out.println("id\t\t\tname\t\tage\taddress");
        //取出list内容(遍历集合)
        for (int i=0;i<array.size();i++){
            Student student = array.get(i);
            System.out.println(student.getSid()+"\t\t\t"+student.getName()+"\t\t"+student.getAge()+"岁\t\t"+student.getAddress());

        }
    }



}