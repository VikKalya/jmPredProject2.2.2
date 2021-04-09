package model;

import org.springframework.stereotype.Component;


public class Car {
    private Long id;
    private String model;
    private String series;

    public Car(){

    }
    public Car(Long id, String model, String series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
