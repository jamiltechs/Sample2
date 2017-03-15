/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iq;

import java.util.Random;

/**
 *
 * @author JAMILU
 */
public class IQ {
    static String realName, mixedName = "";
    static int nameCount;
    public static String generate(){
        // TODO code application logic here
        String [] laptop = {"acer","zinox", "hp", "toshiba", "omatek","mac","lenovo","samsung","dell","sony","asus","ibm","alienware","fujitsu","huawi","msi","lg","panasonic"};
        //System.out.println(laptop.length);
         Random myRandom = new Random();
        int selectedElement = myRandom.nextInt(18);
        nameCount = laptop[selectedElement].length();
        realName = laptop[selectedElement];
        for(int i = 1; i <= nameCount; i ++ )
        {
            //System.out.print(realName.charAt(myRandom.nextInt(nameCount)));
            mixedName = mixedName+realName.charAt(myRandom.nextInt(nameCount));
        }
        System.out.println(mixedName);
        actualName(realName);
    return mixedName;
    }

    public static String actualName(String realName) {
        return realName;
    }
}
