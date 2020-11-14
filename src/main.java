
import sangnd.util.MathUtility;

public class main {

    public static void main(String[] args) {
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        //in ra ket qua chung ta muon va chung ta lm
        System.out.println("5! expected " + expected);
        System.out.println("5! actual " + actual);
        //tiep tuc cho cac tinh huong test
        //      cac tinh huong can phai test goi la test cases
        //ve thuc hanh ki 5 mon swt 301
        System.out.println("6! expcted " + MathUtility.getFactorial(6));
        //ta ki vong may nem ve ngoai le
        //IllegalArgumentException neu user co tinh dua tham so vao va tham so lon hon >20
        System.out.println("IllegalArgumentException " + MathUtility.getFactorial(-5));
        //cho code len server
        //src quan trong nhat  neu f6 no se thao tanh thu muc build 
        //clean and build thu muc moi la dist distribution
        //rar doi duon thanh rar zip quy uoc dat dau main chay tu dau
        //jar war ko can dem len server code
        //web.xml jsp html: porm.xml can dua len github server/azure/gitlab
        //danh dau ai duoc len ai ko dc
        //git ignore ghi chu ai len ai o lai tap tin test
        //?lam app du an code
        //2 lam tren file git ignore danh dau len xuong
        //cach 2 tu dong lam qua api giang ho cho san
//        https://www.toptal.com/developers/gitignore
//.gitignore
//all txt
//vao bin
//neu e 2 cham
    }
}
