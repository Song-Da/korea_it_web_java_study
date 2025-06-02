package _31_Generic.WildCard.UnBoundWild;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Box<T> {
    private T item;
}
