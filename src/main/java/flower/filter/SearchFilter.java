package flower.filter;

import flower.store.Item;

public interface SearchFilter {
    boolean match(Item item);
}