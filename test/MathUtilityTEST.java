/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sangnd.util.MathUtility;
//import static sangnd.util.MathUtility;
//chi tu jDK 5? ham sattic goi ma hok can ten class cham
//do minh da choi tro khai bao van can san ten class va ten ham static qua lenh
//import static
//sau nay xai ham static cua class nay ko can ten class cham sd nhu c


/**
 *
 * @author nds72
 */
public class MathUtilityTEST {

    //viet ra nhung vc nhung tinh huong sai ham getFactoria()
    //kiem tra xem actual == expected nhu truyen thonh gay ko
    //nhung o day co xin so hon ko ngoai vs xanh do
    //ngoai ra ra con dung cho CI -- countinous Integration
    // CD countinous Delivery
    // CT countinous Regrewssion TEST
    // DEvOPs== Developmet and operation
    //app lien tuc dc kiem tra chat luong code bulid ra file jar thanh war day len mot server trung gian Stafing evn de cho nhom test san sang test
    //sau do co the day len production server may chay that noi khach hang
    //moi vc se bat dau ke tu luc devlopber push code len github va moi thu cu the thu dong ko can cang thiep con nguoi
    @Test //tu khoa nay tuong duong public static void main
    //trong ham nay minh se show ra mau xanh do dua tren su khop nhau cua EXPESTED VS ACTUAL qua ham aseertEquals().. ma thu vien cung cap
    //assert () du cac loai assert tren cuoc doi  -asser (v) so sah
    //thay vi so sanh - mat ta nho ham so sanh gium, thay mau gium ta
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(120,MathUtility.getFactorial(5));//hay tinh gium tui 5 ! coi no co la 120 hem
        //co thi xanh
        //ko bao do
        assertEquals(120,MathUtility.getFactorial(5));
        //ky thuat tdd
    }
}
