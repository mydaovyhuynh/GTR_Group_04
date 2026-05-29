import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controller {

    @FXML
    private Button button_calculate;

    @FXML
    private Label label_result;

    @FXML
    private TextField textField_num1;

    @FXML
    private TextField textField_num2;

    @FXML
    void on_calculate(ActionEvent event) {
        System.out.println("Button clicked!");
        String str_num1 = textField_num1.getText();
        String str_num2 = textField_num2.getText();

        System.out.println("Num1: " + str_num1);
        System.out.println("Num2: " + str_num2);

    }

}
