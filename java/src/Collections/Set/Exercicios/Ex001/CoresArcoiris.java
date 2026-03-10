package Collections.Set.Exercicios.Ex001;

import java.util.Comparator;
import java.util.Objects;

public class CoresArcoiris implements Comparable<CoresArcoiris> {
    private String cores;

    public CoresArcoiris(String cores) {
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return cores;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoresArcoiris that = (CoresArcoiris) o;
        return Objects.equals(cores, that.cores);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cores);
    }

    @Override
    public int compareTo(CoresArcoiris cores) {
        return this.getCores().compareTo(cores.getCores());
    }
}
