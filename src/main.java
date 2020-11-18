
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
        //bua sau hoc readme
        System.out.println("chuc cuoi tuan vv");
        //MINH MUON KET LUAN MINH NGON, MINH OHAI TEST CA C TRUONG HOP XAI HAM
        //TRUONG HOP 5! 0! 
        //minh phai thiet ke cac loai testcase tinh huong test sau do minh verify
        //giua cac ham tra ve cua ham actual co khop voi expested ca minh du doan ko
        //ham chay ohai tra ve
        //neu moi thu khop, tuc la actual == expedted minh moi dam noi HAM NGON
        //CACH NAY co nhuoc diem nhin bang mat so sanh ket qua cua tng case tinh  huong test
        // cach nay on nhung tiem an sai sot do minh nhin
        //CACH NGAN CAo
        //cung nhin= mat nhing chi nhin 2mau xanh do cho moi test case
        //co nghia neu ban sai ham voii 100 tham so chay ham 100 tinh huong khac nhau
        //ban chinhin thay duy nhat 2 ham xanh do
        //moi test case phai co expected ==actual thi moi xanh
        //DO, moi mau xanh chi can it nhat thang do ket luan dam do
        //chi co 1 tinh huong sai ko khop ket luan luon, ham hong on dinh
        // ai dam sai ham ko on dinh
        //muon lam dc dieu nay, can su phu giup cua cac thu vien ben ngoai JDK, goi la unit test framwork
        //cac bo unit test noi tieng: JUNIT, TESTNG, NUnit, XUNIT, PHPUNIT
        //bua nay minh hoc xanh do qua Junit
        //van vs muc tieu test ham co ngon ko nhng chi nhin dung 2 mau
        //tets cac tinh huong chay ham
        System.out.println("Tao muon nhin thay doan code nay");
    }
}
