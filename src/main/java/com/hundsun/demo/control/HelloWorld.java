package com.hundsun.demo.control;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public int hello() {
        //return "Hello Spring Boot!";
        HelloWorld h=new HelloWorld();
        System.out.println("aaaaa");

        return h.addHello(2,3);
    }
    public int addHello(int i,int j)
    {
        return i+j;
    }
    //冒泡排序
    public void bubbleSort(int[] arr)
    {
        int temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    //冒泡排序
    public void bubbleSort2(int[] arr)
    {
        int temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    //选择排序
    public void selectSort(int[] arr)
    {
        int temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    //按照入参 int[] arrays 实现arrays的冒泡排序
    public void sortArrays(int[] arrays) {
        int temp = 0;
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }


    //根据sortArrays方法，生成testSortArrays方法，入参为int[] arrays，返回值为int[] arrays
    public boolean testSortArrays(){
        int[] arrays = {1, 3, 2, 5, 4};
        int[] arrays2 = {1, 2, 3, 4, 5};
        sortArrays(arrays);
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != arrays2[i]) {
                return false;
            }
        }
        return true;
    }

    //实现表的左右交换
    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
