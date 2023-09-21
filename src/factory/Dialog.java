package factory;
import buttons.Button;

/**
 * Clase base de fábrica. Tenga en cuenta que "fábrica" ​​es simplemente una función para la clase. Él
 * debe tener alguna lógica empresarial central que necesite diferentes productos para ser
 * creado.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Las subclases anularán este método para crear un botón específico
     * objetos.
     */
    public abstract Button createButton();
}
