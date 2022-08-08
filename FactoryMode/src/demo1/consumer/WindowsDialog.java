package demo1.consumer;

import demo1.product.Button;
import demo1.product.WindowsButton;

/**
 * @author cloaks
 * @description 具体创建者将重写工厂方法以改变其所返回的产品类型。
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
