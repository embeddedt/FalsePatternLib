package com.falsepattern.lib.compat;

import com.falsepattern.lib.StableAPI;
import lombok.*;
import net.minecraft.util.MathHelper;

import javax.annotation.concurrent.Immutable;

/**
 * A functional equivalent to Vec3i present in Minecraft 1.12.
 */
@Getter
@Immutable
@EqualsAndHashCode
@AllArgsConstructor
@StableAPI(since = "0.6.0")
public class Vec3i implements Comparable<Vec3i> {
    /**
     * A static zero vector
     */
    public static final Vec3i NULL_VECTOR = new Vec3i(0, 0, 0);

    protected final int x;
    protected final int y;
    protected final int z;

    /**
     * Instantiates a new vector.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public Vec3i(double x, double y, double z) {
        this(MathHelper.floor_double(x), MathHelper.floor_double(y), MathHelper.floor_double(z));
    }

    public int compareTo(@NonNull Vec3i vec) {
        return y == vec.getY() ? z == vec.getZ() ? x - vec.getX() : z - vec.getZ() : y - vec.getY();
    }

    /**
     * Cross product between two vectors.
     *
     * @param vec the other vector
     * @return the new resulting vector
     */
    public Vec3i crossProduct(@NonNull Vec3i vec) {
        return new Vec3i(
                y * vec.getZ() - z * vec.getY(),
                z * vec.getX() - x * vec.getZ(),
                x * vec.getY() - y * vec.getX()
        );
    }

    /**
     * Gets distance to the vector.
     *
     * @param x the other x
     * @param y the other y
     * @param z the other z
     * @return the distance
     */
    public double getDistance(int x, int y, int z) {
        return Math.sqrt(distanceSq(x, y, z));
    }

    /**
     * Square distance between vectors.
     *
     * @param vec the other vector
     * @return the square distance
     */
    public double distanceSq(@NonNull Vec3i vec) {
        return distanceSq(vec.getX(), vec.getY(), vec.getZ());
    }

    /**
     * Square root distance to a point.
     *
     * @param x the other x
     * @param y the other y
     * @param z the other z
     * @return the square distance
     */
    public double distanceSq(int x, int y, int z) {
        val dX = this.x - x;
        val dY = this.y - y;
        val dZ = this.z - z;
        return dX * dX + dY * dY + dZ * dZ;
    }

    /**
     * Square distance between point to center of this Block.
     *
     * @param x the other x
     * @param y the other y
     * @param z the other z
     * @return the square distance to center
     */
    public double distanceSqToCenter(double x, double y, double z) {
        val dX = this.x + 0.5D - x;
        val dY = this.y + 0.5D - y;
        val dZ = this.z + 0.5D - z;
        return dX * dX + dY * dY + dZ * dZ;
    }
}