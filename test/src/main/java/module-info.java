module mainpkg.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpkg.test to javafx.fxml;
    exports mainpkg.test;
}