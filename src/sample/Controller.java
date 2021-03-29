package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
public Button Button;
public Spinner zakres;
public Canvas pole;
public TextField poleszer;
public TextField polewys;
public Text text1;
public Text text2;
public Text text3;
public Button rescalemesh;
public CheckBox periodic;




@FXML
public void SearchButtonClicked(javafx.event.ActionEvent actionEvent)
{
    int rule = (int) zakres.getValue();
    boolean warunek = periodic.isSelected();
Main.initialize_maintab(pole.getWidth(), pole.getHeight());
Main.bigfunction(Main.getrule(rule), Main.initialize_maintab(pole.getWidth(), pole.getHeight()), pole.getGraphicsContext2D(), pole, warunek );
}
@FXML
public void RescaleButtonClicked(javafx.event.ActionEvent rescaleEvent)
{

   int szer =Integer.parseInt(String.valueOf(poleszer.getText()));
    int wys = Integer.parseInt(String.valueOf(polewys.getText()));
    Main.rescale_mesh(pole, szer, wys, pole.getGraphicsContext2D());
}

}
