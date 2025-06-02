package _31_Generic.WildCard.LowerBoundeWild;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Box<T> {
    private T item;
}
