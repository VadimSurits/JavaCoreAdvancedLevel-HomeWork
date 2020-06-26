package homeWork4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;

    public void ClickBtnAddMsg(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    public void ClickEnterBtn(KeyEvent keyEvent) {         //Попытка те же самые действия (из метода ClickBtnAddMsg)
        if (keyEvent.getCode() == KeyCode.ENTER) {         //выполнять при нажатии клавиши Enter - в итоге не работает!
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }
    }
}

