package be.kdg.tijd.view;

import be.kdg.tijd.model.TimeModel;

import java.time.LocalTime;

public class Presenter {
    private final TimeModel model;
    private final TimeView view;

    public Presenter(TimeModel model, TimeView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        this.view.getSlider().setOnMouseDragged(event -> {
            final double sliderValue = this.view.getSlider().getValue();
            this.model.setCurrentTime(LocalTime.of((int)sliderValue, (int)((sliderValue % 1.0) * 60)));
            this.updateView();
        });
    }

    private void updateView() {
        this.view.applyDaylightSun(model.getDaylightPercentage(), model.getSunHeight(), model.getSunPositionX());

        final LocalTime time = this.model.getCurrentTime();
        this.view.getSlider().setValue(time.getHour() + time.getMinute() / 60.0);
    }
}
