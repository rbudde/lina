package de.laura.java2d.shape;

import java.awt.Graphics2D;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

import de.laura.java2d.geo.Punkt;

public class GGroup implements IShape<GGroup> {
    private final ImmutableList<IShape<?>> shapes;

    private GGroup(ImmutableList<IShape<?>> shapes) {
        this.shapes = shapes;
    }

    @Override
    public GGroup translate(Punkt other) {
        GGroup.Builder groupBuilder = GGroup.builder();
        for ( IShape<?> shape : shapes ) {
            groupBuilder.add(shape.translate(other));
        }
        return groupBuilder.build();
    }

    public List<IShape<?>> getShapes() {
        return Collections.unmodifiableList(shapes);
    }

    @Override
    public String toString() {
        return "GGRoup [" + shapes + "]";
    }

    @Override
    public void paint(Graphics2D g2) {
        for ( IShape<?> shape : shapes ) {
            shape.paint(g2);
        }
    }

    public static GGroup.Builder builder(IShape<?>... shapes) {
        Builder groupBuilder = new Builder();
        groupBuilder.add(shapes);
        return groupBuilder;
    }

    public static class Builder {
        private final ImmutableList.Builder<IShape<?>> builder = ImmutableList.<IShape<?>> builder();

        public void add(IShape<?>... shapes) {
            for ( IShape<?> shape : shapes ) {
                builder.add(shape);
            }
        }

        public void add(List<IShape<?>> shapes) {
            for ( IShape<?> shape : shapes ) {
                builder.add(shape);
            }
        }

        public GGroup build() {
            return new GGroup(builder.build());
        }
    }
}
