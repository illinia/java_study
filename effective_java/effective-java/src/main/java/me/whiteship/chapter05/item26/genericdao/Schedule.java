package me.whiteship.chapter05.item26.genericdao;

import java.time.LocalDateTime;

public class Schedule implements Entity {
    private Long id;
    private LocalDateTime when;

    @Override
    public Long getId() {
        return id;
    }

    public LocalDateTime getWhen() {
        return when;
    }
}
