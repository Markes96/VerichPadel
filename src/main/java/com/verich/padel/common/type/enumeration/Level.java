package com.verich.padel.common.type.enumeration;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Level {

  INITIATION(1),

  INITIATION_PLUS(2),

  BEGINNER(3),

  BEGINNER_PLUS(4),

  INTERMEDIATE(5),

  INTERMEDIATE_PLUS(6),

  ADVANCED(7),

  ADVANCED_PLUS(8),

  EXPERT(9),

  EXPERT_PLUS(10),

  MASTER(11),

  LENGEND(12);

  private static final int RANGE = 5;
  private static final int OUTPUT = 5;

  private final int index;

  public static Level getLevel(final int levelValue) {


    final int levelIndex = (levelValue - OUTPUT) / RANGE;

    for (final Level level : values()) {
      if (levelIndex == level.index)
        return level;
    }

    return levelIndex > LENGEND.index ? LENGEND : INITIATION;
  }

  public int getValue() {
    return (index * RANGE) + OUTPUT;
  }
}
