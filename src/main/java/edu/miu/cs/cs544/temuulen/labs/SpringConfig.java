package edu.miu.cs.cs544.temuulen.labs;

import org.springframework.context.annotation.Bean;

public class SpringConfig {
    @Bean
    public Vehicle vehicle() {
        return new Car();
    }
    @Bean(name = "game")
    public Game myGame(Vehicle vehicle) {
        return new Game(vehicle);
    }
}
