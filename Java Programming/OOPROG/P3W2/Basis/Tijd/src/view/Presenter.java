package view;

import model.TimeModel;

import java.time.LocalTime;

public class Presenter {
    private TimeModel model;
    private TimeView view;

    public Presenter(TimeModel model, TimeView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getSlider().setOnMouseDragged(event -> {
            double tijdDouble = view.getSlider().getValue();
            int hours = (int) tijdDouble;
            double minutenDouble = tijdDouble - hours;
            int minutes = (int) minutenDouble * 6;
            model.setCurrentTime(LocalTime.of(hours, minutes));
            updateView();
        });
    }

    private void updateView() {
        view.applyDaylightSun(model.getDaylightPercentage(), model.getSunHeight(), model.getSunPositionX());
        LocalTime tijd = model.getCurrentTime();
        int hours = tijd.getHour();
        int minutes = (tijd.getMinute() / 6) / 10;
        double tijdDouble = hours + minutes;
        view.getSlider().setValue(tijdDouble);
    }
}
