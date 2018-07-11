package test002;

import com.ft.test002.AService;
import com.ft.test002.BService;
import com.ft.test002.BServiceImpl;
import com.ft.test002.ProxyObjCreator;
import org.junit.Test;

/**
 * @author mask
 * @date 2018/7/11 11:55
 * @desc
 */
public class ProxyObjCreatorTest {
    @Test
    public void test1(){

        ProxyObjCreator proxyObjCreator = new ProxyObjCreator();

        AService aService = proxyObjCreator.getBean(AService.class);
        aService.doA();
        System.out.println("#####################");

        BService tmpBService = new BServiceImpl();
        proxyObjCreator.setTargetObj(tmpBService);
        BService bService = proxyObjCreator.getBean(BService.class);
        bService.doB();
    }
}
