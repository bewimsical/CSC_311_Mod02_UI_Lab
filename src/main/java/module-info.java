module edu.farmingdale.csc_311_mod02_ui_lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc_311_mod02_ui_lab to javafx.fxml;
    exports edu.farmingdale.csc_311_mod02_ui_lab;
}