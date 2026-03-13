module ranks.gym {
    requires javafx.controls;
    requires javafx.fxml;


    opens ranks.gym to javafx.fxml;
    exports ranks.gym;
}