import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //冒泡排序性能较低，Java中内置了更高效的排序算法
        int[] arr = {9,5,2,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }



//    public static void main(String[] args) {
//        //数组排序（冒泡排序）
//        //假设排升序：
//        //1. 将数组中相邻元素从前往后依次进行比较，如果前一个元素比后一个元素大，则交换，一趟下来后最大元素
//        //就在数组的末尾
//        //2. 依次从上述过程，直到数组中所有的元素都排列好
//        int[] arr = {9,5,2,7};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void bubbleSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length-i; j++) {
//                if(arr[j-1]>arr[j]){
//                    int tmp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j]=tmp;
//                }
//            }
//        }
//    }





//    public static void main(String[] args) {
//        //查找数组中指定元素（二分查找）
//        //以升序数组为例, 二分查找的思路是先取中间位置的元素, 看要找的值比中间元素大还是小.
//        // 如果小, 就去左边找; 否则就去右边找
//        int[] array = {1,2,3,4,5,6};
//        System.out.println(binarySearch(array, 2));
//    }
//    public static int binarySearch(int[] array,int toFind){
//        int left = 0;
//        int right = array.length-1;
//        while(left <= right){//假设是升序数组
//            int mid = (left+right)/2;
//            if(toFind < array[mid]){//如果要找的数小于中间数，就去左侧区间找
//                right = mid - 1;//缩小右侧区间范围
//            }else if(toFind > array[mid]) {//如果要找的数大于中间数，就去右侧区间找
//                left = mid + 1;//缩小左侧区间范围
//            }else {
//                return mid;//相等，说明中间数就是所找数
//            }
//        }
//        return -1;//循环结束，说明没找到  数组没有-1下标
//    }
//





//    public static void main(String[] args) {
//        //查找数组中的指定元素（顺序查找）
//        int[] array = {1,12,23,35,58,60,92};
//        System.out.println(findArray(array, 60));
//    }
//    public static int findArray(int[] array,int toFind){
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == toFind){
//                return i;
//            }
//        }
//        return -1;//表示没有找到
//    }








//    public static void main(String[] args) {
//        //求数组中元素的平均值 方法2
//        int[] array = {1,2,3,4,5,6};
//        System.out.println(avg(array));
//    }
//    public static double avg(int[] array){
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//       return (double)sum/(double)array.length;
//    }



//    public static void main(String[] args) {
//        //求数组中元素的平均值
//        int[] array = {1,2,3,4,5,6};
//        System.out.println(avg(array));
//    }
//    public static double avg(int[] array){
//        int sum = 0;
//        for(int x:array){
//            sum += x;
//        }
//        return (double)sum/(double)array.length;
//    }



//    public static void main(String[] args) {
//        //寻找数组中的最大元素 练习
//        int[] array = {12,34,56,78,90};
//        System.out.println(maxArray(array));
//    }
//    public static int maxArray(int[] array){
//        //打擂台的方式！！从左到右两两比较
//        int max = array[0];
//        for (int i = 2; i < array.length; i++) {
//            if(max < array[i]){
//                max = array[i];
//            }
//        }
//        return max;
//    }








//    public static void main(String[] args) {
//        //找数组中的最大元素
//        int[] array = {1,2,3,4,5,6,7};
//        System.out.println(maxArray(array));
//    }
//
//    public static int maxArray(int[] array){
//        int max = array[0];
//        for (int i = 2; i < array.length; i++) {
//            if(max < array[i]){
//                max = array[i];
//            }
//        }
//        return max;
//    }



//    public static void main(String[] args) {
//        //数组拷贝 方法1  for循环拷贝
//        int[] array = {1,2,3,4,5,6,7};
//        int[] ret = copyArray(array);
//        System.out.println(Arrays.toString(ret));
//    }
//    public static int[] copyArray(int[] array){
//        int[] ret = new int[array.length];//创建数组并初始化
//        for (int i = 0; i < array.length; i++) {
//            ret[i] = array[i];//拷贝每一项
//        }
//        return ret;
//    }

//    public static void main(String[] args) {
//        //数组拷贝 方法2 使用操作数组的工具类 Arrays.copyOf
//        int[] array = {1,2,3,4,5,6,7};
//        int[] ret = Arrays.copyOf(array,array.length);
//        System.out.println(Arrays.toString(ret));
//    }


//    public static void main(String[] args){
//        //数组拷贝 方法3 使用System.arraycopy
//        int[] array = {1,2,3,4,5,6,7};
//        int[] ret = new int[array.length];
//        System.arraycopy(array,0,ret,0,array.length);
//     System.out.println(Arrays.toString(ret));
//    }


//    public static void main(String[] args) {
//        //数组拷贝 方法4 使用 array.clone
//        int[] array = {1,2,3,4,5,6,7};
//        int[] ret = array.clone();
//        System.out.println(Arrays.toString(ret));
//    }








//    public static void main(String[] args) {
//        //用代码实现 toString  将数组以字符串形式输出
//        int[] array = {12, 34, 1, 6, 9, 21};
//        System.out.println(myToString(array));
//    }
//
//    public static String myToString(int[] array) {
//        String ret = "[";
//        for (int i = 0; i < array.length; i++) {
//            ret += array[i];
//            if (i != array.length - 1) {
//                ret += ",";
//            }
//        }
//        ret += "]";
//        return ret;
//    }


//    public static void main(String[] args) {
//        int[] array = {12,34,1,6,9,21};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//    }


//    public static void main(String[] args) {
//        //将一个数组中的每一个元素扩大二倍
//        int[] array = {1,2,3,4,5,6,7};
//        int[] ret = func(array);
//        System.out.println(Arrays.toString(ret));//将数组以字符串的形式输出
//
//    }
//    public static int[] func(int[] array){
//        int[] tmp = new int[array.length];//创建数组并初始化
//        for (int i = 0; i < array.length; i++) {
//            tmp[i] = array[i]*2;//给数组中的元素都*2
//        }
//       return tmp;//返回数组
//    }




//    //数组：存放相同数据类型的集合。内存是连续的。
//    public static void main(String[] args) {
//        int[] array = {1,2,3,4};
////        int[] array2 = new int[]{11,22,33,44};
////        int[] array3 = new int[4];//0  里面放了4个0
//        String ret = Arrays.toString(array);//将数组以字符串的形式输出
//        System.out.println(ret);
////        for (int i = 0; i < array.length; i++) {
////            System.out.println(array[i]);
////        }
//    }
//}
}
