package test001;

import com.ft.test001.PrinterProxy;
import com.ft.test001.PrinterService;
import com.ft.test001.PrinterServiceImpl;
import org.junit.Test;
/**
 * @author mask
 * @date 2018/7/11 11:55
 * @desc
 */
public class PrinterProxyTest {
    @Test
    public void test1(){
        String[] text = {"i","am","mask"};
        PrinterService printerService = new PrinterServiceImpl();
        printerService.print(text);

        System.out.println("#####################");
        PrinterProxy printerProxy = new PrinterProxy(printerService);
        printerProxy.getProxyObj().print(text);
    }
}
