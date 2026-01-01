package com.diagram.backend.Scenario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;
import java.util.Objects;

@Entity
@Table(name="scenarios")
public class Scenario {
    @Id
    private Long id;
    private String description;
    private String topic;

    public Scenario() {
    }

    public Scenario(Long id, String description, String topic) {
        this.id = id;
        this.description = description;
        this.topic = topic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Scenario scenario = (Scenario) o;
        return Objects.equals(getId(), scenario.getId()) && Objects.equals(getDescription(), scenario.getDescription()) && Objects.equals(getTopic(), scenario.getTopic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getTopic());
    }
}
