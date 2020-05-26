package main; 
public class comparison{
    static boolean Number(String text){
        String[] arabic = {"10","9","8","7","6","5","4","3","2","1"};
        for (String keyword : arabic){
            if (text.contains(keyword)){
                return true;
            }
        }
        return false;
    }
}
