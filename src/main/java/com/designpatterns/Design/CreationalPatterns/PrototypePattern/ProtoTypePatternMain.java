package com.designpatterns.Design.CreationalPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class ProtoTypePatternMain {
    public static void main(String Args[]) throws InterruptedException, CloneNotSupportedException {
        System.out.println("Let us see on example of ProtoTypedesignPattern " +
                "with Shallow Copy and Deep Copy");
        FIleReaderUtils fIleReaderUtils=new FIleReaderUtils();
        File file=fIleReaderUtils.getFileInfo("Controller.txt","Desktop");
        List<String> pages=new ArrayList<>();
        pages.add("one");
        pages.add("two");
        pages.add("three");
        pages.add("four");
        pages.add("five");
        file.setPages(pages);
        System.out.println(file.toString());
        File file1= file.clone();
        System.out.println(file1.toString());

        pages.add("six");
        System.out.println(file.toString());
        System.out.println(file1.toString());
        System.out.println(file.getPages().hashCode());
        System.out.println(file1.getPages().hashCode());

         /*
         Here in shallow copying i have added pages.add("six");
        It is getting added for both of them . They both have same refernce. So changes in the first file will get refelct in the scond too
        If you see the last 2 lines both have the same hash code -> Mean same reference

        For deep Copy we need to write our OwnClone method
      */

    }
}
