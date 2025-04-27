package org.jacobo.adyd.ficha.model.common;



public record Equipment(String name, String description, Integer weight, Integer price,
                        String status, Integer damage, String bonus, String specials, Integer quantity) {

}
