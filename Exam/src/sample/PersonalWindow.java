package Exam.src.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Данный класс является личным кабинетом для авторизованных пользователей.
 * @author Шабанов Максим ПИ20-1В
 */
public class PersonalWindow extends Application {
    /**
     * Данный метод настраивает и запускает javaFx.
     * @param primaryStage Главное окно приложения
     * @throws Exception Ошибка старта программы
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample1.fxml"));
        primaryStage.setTitle("Личный кабинет");
        primaryStage.setScene(new Scene(loader.load(),600,400));
        primaryStage.show();
    }
}
