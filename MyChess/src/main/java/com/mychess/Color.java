package com.mychess;

/**
 * Перечисление, представляющее цвета шахматных фигур
 */
public enum Color {
    WHITE,
    BLACK;

    /**
     * Возвращает противоположный цвет.
     */
    public Color opposite() {
        return this == WHITE ? BLACK : WHITE;
    }
}
