package demo1.product;

/**
 * @author cloaks
 * @description 具体产品需提供产品接口的各种实现。
 */
public class WindowsButton implements Button {

    @Override
    public void render() {
        // 根据 Windows 样式渲染按钮。
        System.out.println("WindowsButton render");
    }

    @Override
    public void onClick() {
        // 绑定本地操作系统点击事件。
        System.out.println("WindowsButton onClick");
    }
}
