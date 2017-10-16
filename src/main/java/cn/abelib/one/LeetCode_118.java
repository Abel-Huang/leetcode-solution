package cn.abelib.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abel-huang on 2016/7/19.
 * notes: how to use clear() function in list, I
 * decide to write a blog to detailed introduction
 * this part.
 */
public class LeetCode_118 {
    public static void main(String args[]){
        int a=5;
        System.out.println(generate(a).toString());
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pasTrian=new ArrayList<>();
        if(numRows==0){

        }
        else{
            for(int i=0;i<numRows;i++){
                List<Integer> temp=new ArrayList<>();
                for(int j=0;j<=i;j++){
                    if(j>0&&j<i&&i>0){
                        int trans=((pasTrian.get(i-1)).get(j-1)).intValue()+((pasTrian.get(i-1)).get(j)).intValue();
                        temp.add(new Integer(trans));
                    }
                    else{
                        temp.add(new Integer(1));
                    }
                }
                pasTrian.add(temp);
                //temp.clear();
            }
        }
        return pasTrian;
    }
}
