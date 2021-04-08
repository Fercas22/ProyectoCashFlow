package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class menuController implements Initializable {

    @FXML
    private Button exit;

    @FXML
    private Button categoria;

    @FXML
    private Button flujo;

    @FXML
    private Button dinero;

    @FXML
    private ImageView reporte;

    @FXML
    void categoriaOnMouseClicked(MouseEvent event) {
        Main.setFXML("categoria", "Categoria");
    }

    @FXML
    void dineroOnMouseClicked(MouseEvent event) {
        Main.setFXML("indicadorDinero", "Indicadores de Dinero");
    }

    @FXML
    void exitOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void flujoOnMouseClicked(MouseEvent event) {
        Main.setFXML("flujoEfectivo", "Flujo de Efectivo");
    }

    @FXML
    void reporteOnMouseClicked(MouseEvent event) {
        Main.setFXML("reporteMensual", "Reporte Mensual");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        reporte.setImage(new Image("Resources/Reporteimg.png"));
    }
}
