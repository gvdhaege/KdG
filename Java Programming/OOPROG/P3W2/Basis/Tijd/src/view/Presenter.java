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
            double sliderValue = view.getSlider().getValue();
            model.setCurrentTime(LocalTime.of((int) sliderValue, (int) ((sliderValue % 1.0) * 60)));
            updateView();
        });
    }

    private void updateView() {
        view.applyDaylightSun(model.getDaylightPercentage(), model.getSunHeight(), model.getSunPositionX());
        LocalTime tijd = model.getCurrentTime();
        view.getSlider().setValue(tijd.getHour() + tijd.getMinute() / 60.0);
    }


}
