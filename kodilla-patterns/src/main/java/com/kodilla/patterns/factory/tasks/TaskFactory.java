package com.kodilla.patterns.factory.tasks;


public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskCategory) {
        return switch (taskCategory) {
            case SHOPPING -> new ShoppingTask("Water bottle supply", "7-Eleven", 5);
            case PAINTING -> new PaintingTask("Paint the fence", "yellow", "fence");
            case DRIVING -> new DrivingTask("Drive to shop", "IKEA", "BMW");
            default -> null;
        };
    }
}