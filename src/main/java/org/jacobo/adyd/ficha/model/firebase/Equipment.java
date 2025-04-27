package org.jacobo.adyd.ficha.model.firebase;

import java.util.Objects;


public record Equipment(String nombre, Integer peso, Integer precio,
                        String estado, String dano, String bonus, String especiales) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(nombre, equipment.nombre)
                && Objects.equals(peso, equipment.peso) && Objects.equals(precio, equipment.precio)
                && Objects.equals(estado, equipment.estado) && Objects.equals(dano, equipment.dano)
                && Objects.equals(bonus, equipment.bonus) && Objects.equals(especiales, equipment.especiales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, peso, precio, estado, dano, bonus, especiales);
    }
}
