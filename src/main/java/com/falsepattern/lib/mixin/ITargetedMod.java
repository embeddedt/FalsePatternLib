package com.falsepattern.lib.mixin;

import com.google.common.io.Files;

import java.nio.file.Path;
import java.util.function.Predicate;

public interface ITargetedMod {

    String getModName();
    Predicate<String> getCondition();
    boolean isLoadInDevelopment();

    default boolean isMatchingJar(Path path) {
        String pathString = path.toString();
        String nameLowerCase = Files.getNameWithoutExtension(pathString).toLowerCase();
        String fileExtension = Files.getFileExtension(pathString);

        return "jar".equals(fileExtension) && getCondition().test(nameLowerCase);
    }

    final class PredicateHelpers {
        public static Predicate<String> startsWith(String subString) {
            return (name) -> name.startsWith(subString);
        }

        public static Predicate<String> contains(String subString) {
            return (name) -> name.contains(subString);
        }

        public static Predicate<String> matches(String regex) {
            return (name) -> name.matches(regex);
        }
    }
}
