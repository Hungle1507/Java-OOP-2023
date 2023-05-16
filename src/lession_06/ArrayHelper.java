package lession_06;

public class ArrayHelper {
    public int findMinNumber (int[] arr){
        return -1;
    }

    public int findMaxNumber (int[] arr){
        return -1;
    }
    public int[] sort(int[] arr){
        sortArr(arr);
        return arr;
    }

    /**
    * @param sortType asc, desc
    * */
    public int[] sort(int[] arr, String sortType){
        if (sortType.equals("asc")){
            sortArr(arr);
        }else if (sortType.equals("desc")){

        }
        return arr;
    }
    private void sortArr(int[] arr) {

    }
}
