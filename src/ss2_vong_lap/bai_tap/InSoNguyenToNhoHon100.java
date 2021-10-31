package ss2_vong_lap.bai_tap;

public class InSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        StringBuilder number = new StringBuilder("2,");
        int so = 2;
        while(so < 100 ){
            so++;
            if(so > 2 ){
                boolean flag = true;
                for(int i = 2; i < so;i++){
                    if(so%i == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    number.append(so).append(",");
                }
            }
        }
        System.out.println(number);

    }
}
