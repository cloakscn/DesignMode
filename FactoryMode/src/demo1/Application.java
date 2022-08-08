package demo1;

import demo1.consumer.Dialog;
import demo1.consumer.WebDialog;
import demo1.consumer.WindowsDialog;

/**
 * @author cloaks
 * @description
 */
public class Application {
    private Dialog dialog;

    /**
     * @description 程序根据当前配置或环境设定选择创建者的类型。
     */
    private void initialize() throws Exception {
//        Object config = readApplicationConfigFile();
//
//        if (config.OS == "Windows") {
//            dialog = new WindowsDialog();
//        } else if (config.OS == "Web") {
//            dialog = new WebDialog();
//        }
//        else {
//            throw new Exception("错误！未知的操作系统。");
//        }
    }

    /**
     * @param args
     * @throws Exception
     * @description 当前客户端代码会与具体创建者的实例进行交互，但是必须通过其基本接口
     * 进行。只要客户端通过基本接口与创建者进行交互，你就可将任何创建者子类传递给客户端。
     */
    public void main(String[] args) throws Exception {
        this.initialize();
        dialog.render();
    }
}