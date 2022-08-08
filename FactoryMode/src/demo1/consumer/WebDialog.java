package demo1.consumer;

import demo1.product.Button;
import demo1.product.HTMLButton;

/**
 * @author cloaks
 * @description 具体创建者将重写工厂方法以改变其所返回的产品类型。
 */
public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }

}
