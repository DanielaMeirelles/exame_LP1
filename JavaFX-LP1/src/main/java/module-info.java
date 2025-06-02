module fatec.sjc.sp.tarefa3javafxlp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens fatec.sjc.sp.tarefa3javafxlp1 to javafx.fxml;
    exports fatec.sjc.sp.tarefa3javafxlp1;
    exports fatec.sjc.sp.tarefa3javafxlp1.controller;
    opens fatec.sjc.sp.tarefa3javafxlp1.controller to javafx.fxml;
}