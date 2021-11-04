package nhap.giai_thuat;

public class Tuan1 {
    boolean checkCharFrequency(int[] arr) {
        int [] ar = new int[arr.length];

        for (int i = 0;i<arr.length;i++) {
            int count=0;
            for(int j =0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            ar[i] = count;
            if(ar[0] != ar[i]){
                return false;
            }

        }
        return true;
    }
}
