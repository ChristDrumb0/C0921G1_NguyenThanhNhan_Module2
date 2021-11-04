package ss2_loop.bai_tap;


public class In20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        StringBuilder number = new StringBuilder("2,");
        int so = 2;
        while(count < 20 ){
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
                    count++;
                }
            }

        }
        System.out.println(number);

    }
}
