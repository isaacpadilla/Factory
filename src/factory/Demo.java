package factory;
import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

/**
 * Clase de demostración. Aquí todo se junta.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     *Se suele elegir dependiendo de la configuración o
     * opciones de entorno. En este caso el SO, de la maquina local.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Todo el código del cliente debe funcionar con fábricas y productos a través de
     * interfaces abstractas. De esta manera no importa en qué fábrica trabaje.
     * con y qué tipo de producto devuelve.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
