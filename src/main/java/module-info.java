module com.example.zpo_final_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens allFxComponents to javafx.fxml;
    exports allFxComponents;
    exports allFxComponents.Controllers;
    opens allFxComponents.Controllers to javafx.fxml;
}